package com.simpleCrud.controllers;

import com.simpleCrud.dtos.ClientDTO;
import com.simpleCrud.model.Client;
import com.simpleCrud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @PostMapping
    public ResponseEntity<Client> createProduct(@RequestBody ClientDTO client){
        Client newClient = service.createClient(client);

        return new ResponseEntity<>(newClient, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients(){
        List<Client> allClients = service.getAllClients();
        return new ResponseEntity<>(allClients,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Client>> getClientById(@PathVariable Long id){
        Optional<Client> client = service.getClientById(id);
        return new ResponseEntity<>(client,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteClient(@PathVariable Long id){
        return service.deleteClient(id);
    }

}
