package com.example.projetfacturation.Endpoints;

import com.example.projetfacturation.Constants.UrlConstants;

import com.example.projetfacturation.Models.LigneFactureModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "lignes de factures", description = "Gestion des lignes de factures")
public interface LigneFactureEndpoint {
    @GetMapping(value = UrlConstants.GET_LIGNE_FACTURES, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Liste des lignes de factures", description = "La liste des lignes de factures ")
    List<LigneFactureModel> getAllLigneFactures();

    @PostMapping(value = UrlConstants.CREATE_LIGNE_FACTURES, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "creation d'une lignes de facture", description = "creation d'une lignes de facture ")
    LigneFactureModel createLigneFacture (@RequestBody LigneFactureModel cient);

    @GetMapping(value = UrlConstants.GET_LIGNE_FACTURES_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "export une lignes de facture sous forme JSON", description = "export une lignes de facture sous forme JSON")
    LigneFactureModel getLigneFactureById (@RequestParam("idLigneFacture") Long id);

    @PutMapping(value = UrlConstants.MODIFY_LIGNE_FACTURES, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "modifier une lignes de facture", description = "modifier une lignes de facture ")
    LigneFactureModel updateLigneFacture (@RequestBody LigneFactureModel cient);

    @DeleteMapping(value = UrlConstants.DELETE_LIGNE_FACTURES, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "supprimer une lignes de facture", description = "supprimer une lignes de facture ")
    void deleteLigneFacture (@RequestParam("idLigneFacture") Long id);


}
