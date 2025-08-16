package com.example.projetfacturation.Services;

import com.example.projetfacturation.Constants.ConstantsVar;
import com.example.projetfacturation.Models.FactureModel;
import com.example.projetfacturation.Models.LigneFactureModel;
import com.example.projetfacturation.Repository.FactureRepository;
import com.example.projetfacturation.Repository.LigneFactureRepository;
import jakarta.annotation.Resource;
import jakarta.persistence.Column;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FactureServiceImpl implements FactureService{

    @Resource
    private FactureRepository factureRepository;

    @Resource
    private LigneFactureRepository ligneFactureRepository;

    @Override
    public List<FactureModel> getListFactures() {
        return factureRepository.findAll();
    }

    @Override
    public FactureModel createFacture(FactureModel facture) {
         long totalHT = 0L;
         long totalTVA = 0L;
         for(LigneFactureModel ligne : facture.getLignes()){
             if (ligne.getDescription() == null || ligne.getPrixUnitaireHT() == null || ligne.getQuantite() == null) {
                 throw new IllegalArgumentException ("les champs sont obligatiores ") ;
             } else {
                 if (!ConstantsVar.tauxValides.contains(ligne.getTauxTVA())) {
                     throw new IllegalArgumentException ("TVA doit être 0, 5.5, 10, 20") ;
                 } else {
                     ligne.setFacture(facture);
                     long ligneHT = ligne.getQuantite() * ligne.getPrixUnitaireHT();
                     totalHT += totalHT;
                     totalTVA += ligneHT * (ligne.getTauxTVA() / 100);
                 }
             }
         }

        facture.setTotalHT(totalHT);
         facture.setTotalTVA(totalTVA);
         facture.setTotalTTC(totalHT + totalTVA);
        return factureRepository.saveAndFlush(facture);
    }

    @Override
    public FactureModel updateFactures(FactureModel facture) {

        return factureRepository.saveAndFlush(facture);
    }

    @Override
    public FactureModel getFactureById(Long id) {
        return factureRepository.findFactureModelById(id);

    }

    @Override
    public void deleteFacture(Long id) {
        factureRepository.deleteById(id);

    }

    @Override
    public List<FactureModel> getFactureByDate(Date date){
        return factureRepository.findFactureModelByDate(date);

    }

    @Override
    public List<FactureModel> getFactureByIdClient(Long idClient){
        return factureRepository.findFactureModelByIdClient(idClient);

    }
}
