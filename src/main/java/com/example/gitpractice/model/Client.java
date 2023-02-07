package com.example.gitpractice.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("client")
public class Client {

    @Id
    private String id;

    @JsonProperty("client_name")
    private String clientName;

    @JsonProperty("client_mail")
    private String clientMail;
}
