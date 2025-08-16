package com.example.projetfacturation.Models;


import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.Email;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="CLIENT")
public class ClientModel {

    @Id
    @Column(name = "ID_CLIENT", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOM")
    private String nom;

    @Email
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SIRET")
    private String siret;

    @Column(name = "DATE_CREATION")
    private Date dateCreation;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<FactureModel> factures;

    public ClientModel(Long id, String nom, String email, String siret, Date dateCreation, List<FactureModel> factures) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.siret = siret;
        this.dateCreation = dateCreation;
        this.factures = factures;
    }

    public ClientModel() {

    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getSiret() {
        return siret;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public List<FactureModel> getFactures() {
        return factures;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setFactures(List<FactureModel> factures) {
        this.factures = factures;
    }
}
