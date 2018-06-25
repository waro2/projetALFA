/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facture;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import jpa.cours.Cours;

/**
 *
 * @author Alfa Waro
 */
@Entity
public class CoursFacture implements Serializable{
    @Id
    private String id;
    private int nombrecours;
    private double prix;
    @OneToMany(mappedBy = "coursFacture")
    private List<Cours> listCours;
    @ManyToOne
    private Facture facture;

    public CoursFacture() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNombrecours() {
        return nombrecours;
    }

    public void setNombrecours(int nombrecours) {
        this.nombrecours = nombrecours;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public List<Cours> getListCours() {
        return listCours;
    }

    public void setListCours(List<Cours> listCours) {
        this.listCours = listCours;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }
    
    
}
