package com.example.gitpractice.controller;


import com.example.gitpractice.model.Client;
import com.example.gitpractice.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final ClientService service;

    @PostMapping
    public Client save(@RequestBody Client client){
        return service.save(client);
    }
}
