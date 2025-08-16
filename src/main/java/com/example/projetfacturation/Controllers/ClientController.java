package com.example.projetfacturation.Controllers;

import com.example.projetfacturation.Constants.UrlConstants;
import com.example.projetfacturation.Endpoints.ClientEndpoint;
import com.example.projetfacturation.Models.ClientModel;
import com.example.projetfacturation.Services.ClientService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = UrlConstants.CLIENT_URLS)
public class ClientController implements ClientEndpoint  {
    @Resource
    private ClientService clientService;

    @Override
    public List<ClientModel> getAllClients() {
        return clientService.getListClients();
    }

    @Override
    public ClientModel createClient (@RequestBody ClientModel cient) {
        return clientService.createClient(cient);

    }

    @Override
    public ClientModel getClientById (@RequestParam("idClient") Long id) {
        return clientService.getClientById(id);

    }

    @Override
    public ClientModel updateClient (@RequestBody ClientModel cient) {
        return clientService.updateClients(cient);

    }

    @Override
    public void deleteClient (@RequestParam("idClient") Long id) {
        clientService.deleteClient(id);
    }


}
