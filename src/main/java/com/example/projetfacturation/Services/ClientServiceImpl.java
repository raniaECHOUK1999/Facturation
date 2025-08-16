package com.example.projetfacturation.Services;

import com.example.projetfacturation.Models.ClientModel;
import com.example.projetfacturation.Repository.ClientRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{


    @Resource
    private ClientRepository clientRepository;

    @Override
    public List<ClientModel> getListClients() {
        return clientRepository.findAll();
    }

    @Override
    public ClientModel createClient(ClientModel client) {
        return clientRepository.saveAndFlush(client);

    }

    @Override
    public ClientModel updateClients(ClientModel client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public ClientModel getClientById(Long id) {
        return clientRepository.findClientModelById(id);

    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);

    }

}
