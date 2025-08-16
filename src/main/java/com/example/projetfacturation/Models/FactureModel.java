package com.example.projetfacturation.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="FACTURE")
public class FactureModel {

    @Id
    @Column(name = "ID_FACTURE", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "TOTAL_HT")
    private Long totalHT;

    @Column(name = "TOTAL_TVA")
    private Long totalTVA;

    @Column(name = "TOTAL_TTC")
    private Long totalTTC;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT", nullable = false)
    private ClientModel client;

    @OneToMany(mappedBy = "facture", cascade = CascadeType.ALL)
    private List<LigneFactureModel> lignes;

    public FactureModel(Long id, Date date, Long totalHT, Long totalTVA, Long totalTTC, ClientModel client, List<LigneFactureModel> lignes) {
        this.id = id;
        this.date = date;
        this.totalHT = totalHT;
        this.totalTVA = totalTVA;
        this.totalTTC = totalTTC;
        this.client = client;
        this.lignes = lignes;
    }

    public FactureModel() {

    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Long getTotalHT() {
        return totalHT;
    }

    public Long getTotalTVA() {
        return totalTVA;
    }

    public Long getTotalTTC() {
        return totalTTC;
    }

    public ClientModel getClient() {
        return client;
    }

    public List<LigneFactureModel> getLignes() {
        return lignes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTotalHT(Long totalHT) {
        this.totalHT = totalHT;
    }

    public void setTotalTVA(Long totalTVA) {
        this.totalTVA = totalTVA;
    }

    public void setTotalTTC(Long totalTTC) {
        this.totalTTC = totalTTC;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }

    public void setLignes(List<LigneFactureModel> lignes) {
        this.lignes = lignes;
    }
}
