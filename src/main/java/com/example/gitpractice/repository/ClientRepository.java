package com.example.gitpractice.repository;

import com.example.gitpractice.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}
