package com.example.gitpractice.dao;


import com.example.gitpractice.model.Client;
import com.example.gitpractice.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientDao {

    private final ClientRepository repository;

    public Client save(Client client){
        return repository.save(client);
    }
}
