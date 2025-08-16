package com.example.projetfacturation.Repository;

import com.example.projetfacturation.Models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long> {

    ClientModel findClientModelById(Long id);


}
