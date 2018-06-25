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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import jpa.cours.Cours;
import jpa.facture.Facture;

/**
 *
 * @author Alfa Waro
 */
@Entity
public class Utilisateur implements Serializable {

    @Id
    private String login;
    private String nom;
    private String prenoms;
    private String password;
    private String adresse;
    private String email;
    private String telephonne;
    private String genre;

    @OneToMany(mappedBy = "utilisateur")
    private List<Cours> listCours;

    @ManyToOne
    private Groupe groupe;

    @OneToMany(mappedBy = "utilisateur")
    private List<Facture> listFactures;
    
   

    public Utilisateur() {
    }

    public void azero() {
        this.login=null;
        this.nom = null;
        this.prenoms = null;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Cours> getListCours() {
        return listCours;
    }

    public void setListcCours(List<Cours> listcCours) {
        this.listCours = listcCours;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public List<Facture> getListFactures() {
        return listFactures;
    }

    public void setListFactures(List<Facture> listFactures) {
        this.listFactures = listFactures;
    }

  

}
