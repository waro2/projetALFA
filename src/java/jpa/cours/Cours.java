/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.cours;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import jpa.admin.Utilisateur;
import jpa.facture.CoursFacture;
import jpa.facture.Payer;

/**
 *
 * @author Alfa Waro
 */
@Entity
public class Cours implements Serializable{
    @Id
    private String id;
    private String libelle;
    private String description;
    @ManyToOne
    private CategorieCours categorieCours;
    @ManyToOne
    private CoursFacture coursFacture;
    
    @ManyToOne
    private Utilisateur utilisateur;
    @OneToMany(mappedBy = "cours")
    private List<Payer> listpPayers;
     
    
public Cours(){
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategorieCours getCategorieCours() {
        return categorieCours;
    }

    public void setCategorieCours(CategorieCours categorieCours) {
        this.categorieCours = categorieCours;
    }

    public CoursFacture getCoursFacture() {
        return coursFacture;
    }

    public void setCoursFacture(CoursFacture coursFacture) {
        this.coursFacture = coursFacture;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Payer> getListpPayers() {
        return listpPayers;
    }

    public void setListpPayers(List<Payer> listpPayers) {
        this.listpPayers = listpPayers;
    }
    
    
}
