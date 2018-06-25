/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.facture;

import ejb.facture.CoursFactureFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import jpa.facture.CoursFacture;

/**
 *
 * @author Alfa Waro
 */
@Named(value = "coursFactureBean ")
@ViewScoped
public class CoursFactureBean implements Serializable {

    @EJB
    private CoursFactureFacade coursFactureFacade;
    private CoursFacture newCoursFacture;
    private List<CoursFacture> listCoursFactures;
    private CoursFacture selectedCoursFacture;

    public CoursFactureBean() {
    }

    @PostConstruct
    public void init() {
        listCoursFactures = coursFactureFacade.findAll();
        newCoursFacture = new CoursFacture();
    }

    public void saveCoursFacture(ActionEvent event) {
        coursFactureFacade.create(newCoursFacture);
        listCoursFactures = coursFactureFacade.findAll();
        newCoursFacture = new CoursFacture();
    }
    public void editCoursFacture(ActionEvent event){
        coursFactureFacade.edit(selectedCoursFacture);
        listCoursFactures= coursFactureFacade.findAll();
}
public void removeCoursFacture(ActionEvent event){
    coursFactureFacade.remove(selectedCoursFacture);
    listCoursFactures = coursFactureFacade.findAll();
}
    public CoursFactureFacade getCoursFactureFacade() {
        return coursFactureFacade;
    }

    public void setCoursFactureFacade(CoursFactureFacade coursFactureFacade) {
        this.coursFactureFacade = coursFactureFacade;
    }

    public CoursFacture getNewCoursFacture() {
        return newCoursFacture;
    }

    public void setNewCoursFacture(CoursFacture newCoursFacture) {
        this.newCoursFacture = newCoursFacture;
    }

    public List<CoursFacture> getListCoursFactures() {
        return listCoursFactures;
    }

    public void setListCoursFactures(List<CoursFacture> listCoursFactures) {
        this.listCoursFactures = listCoursFactures;
    }

    public CoursFacture getSelectedCoursFacture() {
        return selectedCoursFacture;
    }

    public void setSelectedCoursFacture(CoursFacture selectedCoursFacture) {
        this.selectedCoursFacture = selectedCoursFacture;
    }

}
