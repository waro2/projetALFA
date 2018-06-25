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
import javax.persistence.OneToMany;

/**
 *
 * @author Alfa Waro
 */
@Entity
public class Pays implements Serializable{
    @Id
    private String id;
    private String libelle;
    @OneToMany(mappedBy = "pays")
    private List<Ville> listVilles;

    public Pays() {
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

    public List<Ville> getListVilles() {
        return listVilles;
    }

    public void setListVilles(List<Ville> listVilles) {
        this.listVilles = listVilles;
    }
    
    
}
