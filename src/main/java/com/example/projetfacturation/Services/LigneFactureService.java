package com.example.projetfacturation.Services;

import com.example.projetfacturation.Models.LigneFactureModel;

import java.util.List;

public interface LigneFactureService {

    List<LigneFactureModel> getListLigneFactures();

    LigneFactureModel createLigneFacture(LigneFactureModel LigneFacture);

    LigneFactureModel updateLigneFactures(LigneFactureModel LigneFacture);

    LigneFactureModel getLigneFactureById(Long id);

    void deleteLigneFacture(Long id);


}
