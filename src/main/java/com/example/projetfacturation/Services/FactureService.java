package com.example.projetfacturation.Services;

import com.example.projetfacturation.Models.FactureModel;

import java.util.Date;
import java.util.List;

public interface FactureService {

    List<FactureModel> getListFactures();

    FactureModel createFacture(FactureModel Facture);

    FactureModel updateFactures(FactureModel Facture);

    FactureModel getFactureById(Long id);

    void deleteFacture(Long id);

    List<FactureModel> getFactureByDate(Date date);

    List<FactureModel> getFactureByIdClient(Long idClient);

}
