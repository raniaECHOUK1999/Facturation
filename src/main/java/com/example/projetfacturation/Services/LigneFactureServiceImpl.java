package com.example.projetfacturation.Services;

import com.example.projetfacturation.Models.LigneFactureModel;
import com.example.projetfacturation.Repository.LigneFactureRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneFactureServiceImpl implements LigneFactureService{

    @Resource
    private LigneFactureRepository ligneFactureRepository;

    @Override
    public List<LigneFactureModel> getListLigneFactures() {
        return ligneFactureRepository.findAll();
    }

    @Override
    public LigneFactureModel createLigneFacture(LigneFactureModel LigneFacture) {
        return ligneFactureRepository.saveAndFlush(LigneFacture);

    }

    @Override
    public LigneFactureModel updateLigneFactures(LigneFactureModel LigneFacture) {
        return ligneFactureRepository.saveAndFlush(LigneFacture);
    }

    @Override
    public LigneFactureModel getLigneFactureById(Long id) {
        return ligneFactureRepository.findLigneFactureModelById(id);

    }

    @Override
    public void deleteLigneFacture(Long id) {
        ligneFactureRepository.deleteById(id);

    }
}
