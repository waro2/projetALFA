/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.cours;

import ejb.cours.VilleFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import jpa.cours.Ville;

/**
 *
 * @author Alfa Waro
 */
@Named(value = " villeBean")
@ViewScoped
public class VilleBean implements Serializable {

    @EJB
    private VilleFacade villeFacade;
    private Ville newVille;
    private List<Ville> listVilles;
    private Ville selectedVille;

    public VilleBean() {
    }

    @PostConstruct
    public void init() {
        listVilles = villeFacade.findAll();
        newVille = new Ville();
    }

    public void saveVille() {
        newVille = new Ville();
        listVilles = villeFacade.findAll();
        villeFacade.create(newVille);
    }

    public void editVille(ActionEvent event) {
        villeFacade.edit(selectedVille);
        listVilles = villeFacade.findAll();
    }

    public void removeVille(ActionEvent event) {
        villeFacade.remove(selectedVille);
        listVilles = villeFacade.findAll();

    }

    public VilleFacade getVilleFacade() {
        return villeFacade;
    }

    public void setVilleFacade(VilleFacade villeFacade) {
        this.villeFacade = villeFacade;
    }

    public Ville getNewVille() {
        return newVille;
    }

    public void setNewVille(Ville newVille) {
        this.newVille = newVille;
    }

    public List<Ville> getListVilles() {
        return listVilles;
    }

    public void setListVilles(List<Ville> listVilles) {
        this.listVilles = listVilles;
    }

    public Ville getSelectedVille() {
        return selectedVille;
    }

    public void setSelectedVille(Ville selectedVille) {
        this.selectedVille = selectedVille;
    }

}
