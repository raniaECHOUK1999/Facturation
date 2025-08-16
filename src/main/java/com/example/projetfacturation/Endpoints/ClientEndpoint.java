package com.example.projetfacturation.Endpoints;

import com.example.projetfacturation.Constants.UrlConstants;
import com.example.projetfacturation.Models.ClientModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "clients", description = "Gestion des clients")
public interface ClientEndpoint {
    @GetMapping(value = UrlConstants.GET_CLIENTS, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Liste des clients", description = "La liste des clients ")
    List<ClientModel> getAllClients();

    @PostMapping(value = UrlConstants.CREATE_CLIENTS, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "creation d'une client", description = "creation d'une client ")
    ClientModel createClient (@RequestBody ClientModel cient);

    @GetMapping(value = UrlConstants.GET_CLIENTS_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "export une client sous forme JSON", description = "export une client sous forme JSON")
    ClientModel getClientById (@RequestParam("idClient") Long id);

    @PutMapping(value = UrlConstants.MODIFY_CLIENTS, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "modifier une client", description = "modifier une client ")
    ClientModel updateClient (@RequestBody ClientModel cient);

    @DeleteMapping(value = UrlConstants.DELETE_CLIENTS, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "supprimer une client", description = "supprimer une client ")
    void deleteClient (@RequestParam("idClient") Long id);


}
