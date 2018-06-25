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
import jpa.facture.Client;

/**
 *
 * @author Alfa Waro
 */
@Entity
public class Ville  implements Serializable{

    @Id
    private String id;
    private String libelle;
    @OneToMany(mappedBy = "Ville")
    private List<Client> listlClients;
    @ManyToOne
    private Pays pays;
    
    public Ville() {
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

    public List<Client> getListlClients() {
        return listlClients;
    }

    public void setListlClients(List<Client> listlClients) {
        this.listlClients = listlClients;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
    
    
}
