package com.example.projetfacturation.Endpoints;

import com.example.projetfacturation.Constants.UrlConstants;
import com.example.projetfacturation.Models.ClientModel;
import com.example.projetfacturation.Models.FactureModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Tag(name = "Factures", description = "Gestion des factures")
public interface FactureEndpoint {
    @GetMapping(value = UrlConstants.GET_CLIENTS, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Liste des factures", description = "La liste des factures ")
    List<FactureModel> getAllFactures();

    @PostMapping(value = UrlConstants.CREATE_FACTURES, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "creation d'une facture", description = "creation d'une facture ")
    FactureModel createFacture (@RequestBody FactureModel facture);

    @GetMapping(value = UrlConstants.GET_FACTURES_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "export une facture sous forme JSON", description = "export une facture sous forme JSON")
    FactureModel getFactureById (@RequestParam("idFacture") Long id);

    @PutMapping(value = UrlConstants.MODIFY_FACTURES, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "modifier une facture", description = "modifier une facture ")
    FactureModel updateFacture (@RequestBody FactureModel facture);

    @DeleteMapping(value = UrlConstants.DELETE_FACTURES, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "supprimer une facture", description = "supprimer une facture ")
    void deleteFacture (@RequestParam("idFacture") Long id);

    @GetMapping(value = UrlConstants.GET_FACTURES_BY_DATE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "get facture by date", description = "get facture by date")
    List<FactureModel> getFactureByDate (@RequestParam("date")@DateTimeFormat(iso =  DateTimeFormat.ISO.DATE )  Date date);

    @GetMapping(value = UrlConstants.GET_FACTURES_BY_ID_CLIENT, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "get facture by id client", description = "get facture by id client")
    List<FactureModel> getFactureByIdClient (@RequestParam("idClient") Long idClient);
}
