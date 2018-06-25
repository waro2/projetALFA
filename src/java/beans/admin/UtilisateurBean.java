/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.admin;

import ejb.admin.UtilisateurFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;

import javax.inject.Named;
import jpa.admin.Utilisateur;

/**
 *
 * @author Alfa Waro
 */
@Named(value = "utilisateurBean")
@ViewScoped
public class UtilisateurBean implements Serializable {

    @EJB
    private UtilisateurFacade utilisateurFacade;
    private List<Utilisateur> listeUtilisateurs;
    private Utilisateur newUtilisateur;
    private Utilisateur selectedUtilisateur;

    /**
     * Creates a new instance of UtilisateursBean
     */
    public UtilisateurBean() {
        
    }

    public UtilisateurFacade getUtilisateurFacade() {
        return utilisateurFacade;
    }

    public void setUtilisateurFacade(UtilisateurFacade utilisateurFacade) {
        this.utilisateurFacade = utilisateurFacade;
    }

    @PostConstruct
    public void init() {
        listeUtilisateurs = utilisateurFacade.findAll();
        newUtilisateur = new Utilisateur();
    }

    public void saveUser(ActionEvent event) {
        utilisateurFacade.create(newUtilisateur);
        listeUtilisateurs = utilisateurFacade.findAll();
        newUtilisateur = new Utilisateur();
    }


    public void editUser(ActionEvent event) {
        utilisateurFacade.edit(selectedUtilisateur);
        listeUtilisateurs = utilisateurFacade.findAll();
    }
    public void removeUser(ActionEvent event){
     utilisateurFacade.remove(selectedUtilisateur);
     listeUtilisateurs = utilisateurFacade.findAll();
    }

    public Utilisateur getNewUtilisateur() {
        return newUtilisateur;
    }

    public void setNewUtilisateur(Utilisateur newUtilisateur) {
        this.newUtilisateur = newUtilisateur;
    }

    public Utilisateur getSelectedUtilisateur() {
        return selectedUtilisateur;
    }

    public void setSelectedUtilisateur(Utilisateur selectedUtilisateur) {
        this.selectedUtilisateur = selectedUtilisateur;
    }

    public List<Utilisateur> getListeUtilisateurs() {
        return listeUtilisateurs;
    }

    public void setListeUtilisateurs(List<Utilisateur> listeUtilisateurs) {
        this.listeUtilisateurs = listeUtilisateurs;
    }



}
