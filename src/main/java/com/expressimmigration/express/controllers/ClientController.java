package com.expressimmigration.express.controllers;

import com.expressimmigration.express.models.Client;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ClientController {
    //Client happy = new Client(clientId,"happy", "jonathan", "jonathanlipro@gmail.com");
    @GetMapping("readclient")
    public String getClientById(){
        return "Method de retour d'un client";
    }
    /*public Client readClient(){

        return happy;
    };*/

    @PostMapping("createclient")
    public String createClient(){
        String result = "Je creer mon Client ici";
        return result;
    }

    @PutMapping("editclient")
    public String editClient(){
        return "Je Modifie mon Client ici";
    }

    @DeleteMapping("dellclient")
    public String deleteCLient(){
        return "Je supprime mon Client ici";
    }

}
