package com.example.gitpractice.service;


import com.example.gitpractice.dao.ClientDao;
import com.example.gitpractice.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientDao dao;

    public Client save(Client client){
        return dao.save(client);
    }
}
