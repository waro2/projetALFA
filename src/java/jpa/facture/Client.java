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
import jpa.cours.Ville;

/**
 *
 * @author Alfa Waro
 */
@Entity
public class Client implements Serializable{
    @Id
    private String login;
    private String nom;
    private String prenoms;
    private String password;
    private String adresse;
    private String email;
    private String telephonne;
    @ManyToOne
    private Ville Ville;
    @OneToMany(mappedBy = "client")
   private List<Payer> listpPayers;
    @OneToMany(mappedBy = "client")
    private List<Facture> listFactures;
    
    

    public Client() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephonne() {
        return telephonne;
    }

    public void setTelephonne(String telephonne) {
        this.telephonne = telephonne;
    }

    public List<Payer> getListpPayers() {
        return listpPayers;
    }

    public void setListpPayers(List<Payer> listpPayers) {
        this.listpPayers = listpPayers;
    }

    public Ville getVille() {
        return Ville;
    }

    public void setVille(Ville Ville) {
        this.Ville = Ville;
    }

    public List<Facture> getListFactures() {
        return listFactures;
    }

    public void setListFactures(List<Facture> listFactures) {
        this.listFactures = listFactures;
    }

  
    
    
}
