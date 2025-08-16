package com.example.projetfacturation.Services;

import com.example.projetfacturation.Models.ClientModel;

import java.util.List;

public interface ClientService {

    List<ClientModel> getListClients();

    ClientModel createClient(ClientModel client);

    ClientModel updateClients(ClientModel client);

    ClientModel getClientById(Long id);

    void deleteClient(Long id);



}
