package com.expressimmigration.express.controllers;

import com.expressimmigration.express.models.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @GetMapping("/client")
    public Client readclient(){
        Client happy = new Client("happy", "jonathan", "jonathanlipro@gmail.com");
        return happy;
    };

}
