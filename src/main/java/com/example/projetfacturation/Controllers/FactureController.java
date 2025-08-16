package com.example.projetfacturation.Controllers;

import com.example.projetfacturation.Constants.UrlConstants;
import com.example.projetfacturation.Endpoints.FactureEndpoint;
import com.example.projetfacturation.Models.FactureModel;
import com.example.projetfacturation.Services.FactureService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping(value = UrlConstants.FACTURES_URLS)
public class FactureController implements FactureEndpoint {

    @Resource
    private FactureService factureService;

    @Override
    public List<FactureModel> getAllFactures() {
        return factureService.getListFactures();
    }

    @Override
    public FactureModel createFacture (@RequestBody FactureModel facture) {
        if(facture.getLignes() == null || facture.getLignes().isEmpty()){
            throw new IllegalArgumentException("Il faut ajouter au moins une ligne dans la facture");
        } else {
            return factureService.createFacture(facture);
        }

    }

    @Override
    public FactureModel getFactureById (@RequestParam("idFacture") Long id) {
        return factureService.getFactureById(id);

    }

    @Override
    public FactureModel updateFacture (@RequestBody FactureModel facture) {
        return factureService.updateFactures(facture);

    }

    @Override
    public void deleteFacture (@RequestParam("idFacture") Long id) {
        factureService.deleteFacture(id);
    }

    @Override
    public List<FactureModel> getFactureByDate (@RequestParam("date") Date date){
        return factureService.getFactureByDate(date);

    }

    @Override
    public List<FactureModel> getFactureByIdClient (@RequestParam("idClient") Long idClient) {
        return factureService.getFactureByIdClient(idClient);

    }

}
