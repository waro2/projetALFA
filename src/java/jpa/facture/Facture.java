/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.facture;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import jpa.admin.Utilisateur;

/**
 *
 * @author Alfa Waro
 */
@Entity
public class Facture implements Serializable{
    @Id
    private String id;
    @Temporal(TemporalType.DATE)
    private Date DateFacture;
    private String netpayer;
    private int reference;
    @ManyToOne
    private Client client;
   
    @ManyToOne
    private Utilisateur utilisateur;
    @OneToMany(mappedBy = "facture")
    private List<CoursFacture> listCoursFactures;

    public Facture() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateFacture() {
        return DateFacture;
    }

    public void setDateFacture(Date DateFacture) {
        this.DateFacture = DateFacture;
    }

    public String getNetpayer() {
        return netpayer;
    }

    public void setNetpayer(String netpayer) {
        this.netpayer = netpayer;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<CoursFacture> getListCoursFactures() {
        return listCoursFactures;
    }

    public void setListCoursFactures(List<CoursFacture> listCoursFactures) {
        this.listCoursFactures = listCoursFactures;
    }
    
    
    
    
}
