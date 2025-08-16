package com.example.projetfacturation.Repository;

import com.example.projetfacturation.Models.LigneFactureModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneFactureRepository extends JpaRepository<LigneFactureModel, Long> {

    LigneFactureModel findLigneFactureModelById(Long id);

}
