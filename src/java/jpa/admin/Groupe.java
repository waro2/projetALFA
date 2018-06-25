/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.admin;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import jpa.admin.Utilisateur;

/**
 *
 * @author Alfa Waro
 */
@Entity
public class Groupe implements Serializable{
    @Id
    private String id;
    private String libelle;
    
    @OneToMany(mappedBy = "groupe")
    private List<Utilisateur> listUtilisateurs;

    public Groupe() {
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

    public List<Utilisateur> getListUtilisateurs() {
        return listUtilisateurs;
    }

    public void setListUtilisateurs(List<Utilisateur> listUtilisateurs) {
        this.listUtilisateurs = listUtilisateurs;
    }
    
    
    
}
