package com.example.projetfacturation.Repository;

import com.example.projetfacturation.Models.ClientModel;
import com.example.projetfacturation.Models.FactureModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FactureRepository extends JpaRepository<FactureModel, Long> {

    FactureModel findFactureModelById(Long id);
    List<FactureModel> findFactureModelByDate(Date date);

    @Query("SELECT f FROM FactureModel f WHERE f.client.id = :clientId")
    List<FactureModel> findFactureModelByIdClient(Long clientId);


}
