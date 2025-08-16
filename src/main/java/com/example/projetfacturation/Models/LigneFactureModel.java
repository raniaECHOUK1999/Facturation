package com.example.projetfacturation.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="LIGNE")
public class LigneFactureModel {

    @Id
    @Column(name = "ID_LIGNE", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_FACTURE", nullable = false)
    private FactureModel facture;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "QUANTITE", nullable = false)
    private Integer quantite;

    @Column(name = "PRIX_UNITAIRE_HT", nullable = false)
    private Long prixUnitaireHT;

    @Column(name = "TAUX_TVA", nullable = false)
    private Double tauxTVA;

    public Long getId() {
        return id;
    }

    public FactureModel getFacture() {
        return facture;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public Long getPrixUnitaireHT() {
        return prixUnitaireHT;
    }

    public Double getTauxTVA() {
        return tauxTVA;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFacture(FactureModel facture) {
        this.facture = facture;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public void setPrixUnitaireHT(Long prixUnitaireHT) {
        this.prixUnitaireHT = prixUnitaireHT;
    }

    public void setTauxTVA(Double tauxTVA) {
        this.tauxTVA = tauxTVA;
    }
}
