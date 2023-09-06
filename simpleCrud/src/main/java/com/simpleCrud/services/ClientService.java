package com.simpleCrud.services;

import com.simpleCrud.dtos.ClientDTO;
import com.simpleCrud.model.Client;
import com.simpleCrud.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public Client createClient(ClientDTO data){
        Client newClient = new Client(data);
        this.repository.save(newClient);
        return newClient;
    }
    public List<Client> getAllClients(){

        return repository.findAll();
    }


    public Optional<Client> getClientById(Long id){

        return repository.findById(id);
    }



    public Boolean deleteClient(Long id){
        repository.deleteById(id);
        return true;
    }
}
