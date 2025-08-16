package com.example.projetfacturation.Controllers;

import com.example.projetfacturation.Constants.UrlConstants;
import com.example.projetfacturation.Endpoints.LigneFactureEndpoint;
import com.example.projetfacturation.Models.LigneFactureModel;
import com.example.projetfacturation.Services.LigneFactureService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = UrlConstants.LIGNE_FACTURES_URLS)
public class LigneFactureController implements LigneFactureEndpoint {

    @Resource
    private LigneFactureService ligneFactureService;

    @Override
    public List<LigneFactureModel> getAllLigneFactures() {
        return ligneFactureService.getListLigneFactures();
    }

    @Override
    public LigneFactureModel createLigneFacture (@RequestBody LigneFactureModel ligneFacture) {
        return ligneFactureService.createLigneFacture(ligneFacture);

    }

    @Override
    public LigneFactureModel getLigneFactureById (@RequestParam("idLigneFacture") Long id) {
        return ligneFactureService.getLigneFactureById(id);

    }

    @Override
    public LigneFactureModel updateLigneFacture (@RequestBody LigneFactureModel ligneFacture) {
        return ligneFactureService.updateLigneFactures(ligneFacture);

    }

    @Override
    public void deleteLigneFacture (@RequestParam("idLigneFacture") Long id) {
        ligneFactureService.deleteLigneFacture(id);
    }

}
