package com.expressimmigration.express.controllers;

import com.expressimmigration.express.exceptions.ClientNotFoundException;
import com.expressimmigration.express.models.Client;
import com.expressimmigration.express.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ClientController {
    //Client happy = new Client(clientId,"happy", "jonathan", "jonathanlipro@gmail.com");
    private  final ClientService clientService;
    private Integer clientID;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }



    @GetMapping("{clientID}")
    public Optional<Client> getClientById(@PathVariable("clientID") Integer clientID){
        return clientService.getClientbyId(clientID);
    }
    /*public Client readClient(){

        return happy;
    };*/

    @GetMapping("allclient")
    public List<Client> getAllClient(){
        return clientService.getAll();
    }

    @PostMapping("createclient")
    //@RequestBody : le corps de la requette a prendre : type variable
    public Client createClient(@RequestBody Client newClient){
        //String result = "Je creer mon Client ici";
        return clientService.createClient(newClient);
    }

    @PutMapping("editclient")
    public String editClient(){
        return "Je Modifie mon Client ici";
    }

    @DeleteMapping("{clientID}")
    public String deleteCLientById(@PathVariable("clientID") Integer clientID) throws ClientNotFoundException {
        return clientService.delateClientbyId(clientID);
    }

}
