/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.cours;

import ejb.cours.CoursFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import jpa.cours.Cours;

/**
 *
 * @author Alfa Waro
 */
@Named(value = "coursBean")
@ViewScoped
public class CoursBean implements Serializable {

    @EJB
    private CoursFacade coursFacade;
    private Cours newCours;
    private List<Cours> listCours;
    private Cours selectedCours;

    public CoursBean() {
    }

    @PostConstruct
    public void init() {
        newCours = new Cours();
        listCours = coursFacade.findAll();
    }

    public void saveCours() {
        coursFacade.create(newCours);
        newCours = new Cours();
        listCours = coursFacade.findAll();
    }

    public void editCours(ActionEvent event) {
        coursFacade.edit(selectedCours);
        listCours= coursFacade.findAll();

    }
    public void removeCours(ActionEvent event){
        coursFacade.remove(selectedCours);
        listCours= coursFacade.findAll();
    
    }

    public CoursFacade getCoursFacade() {
        return coursFacade;
    }

    public void setCoursFacade(CoursFacade coursFacade) {
        this.coursFacade = coursFacade;
    }

    public Cours getNewCours() {
        return newCours;
    }

    public void setNewCours(Cours newCours) {
        this.newCours = newCours;
    }

    public List<Cours> getListCours() {
        return listCours;
    }

    public void setListCours(List<Cours> listCours) {
        this.listCours = listCours;
    }

    public Cours getSelectedCours() {
        return selectedCours;
    }

    public void setSelectedCours(Cours selectedCours) {
        this.selectedCours = selectedCours;
    }
    
}
