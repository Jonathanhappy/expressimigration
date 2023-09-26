package com.expressimmigration.express.services;

import com.expressimmigration.express.exceptions.ClientNotFoundException;
import com.expressimmigration.express.models.Client;
import com.expressimmigration.express.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public Optional<Client> getClientbyId(Integer clientID) {
        return clientRepository.findById(clientID);
    }

    public Client createClient(Client newClient) {
        return  clientRepository.save(newClient);
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public String delateClientbyId(Integer clientID) throws ClientNotFoundException {
        Client clientASupprimer = clientRepository.findById(clientID)
                .orElseThrow(() -> new ClientNotFoundException("client avec id : "+ clientID + "est Introuvable"));
        clientRepository.delete(clientASupprimer);
        return "Client avec l'ID "+ clientID + " a ete supprimé avec succès";
    }
}
