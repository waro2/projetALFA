/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.facture;

import ejb.facture.FactureFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import jpa.facture.Facture;

/**
 *
 * @author Alfa Waro
 */
@Named(value = "factureBean")
@ViewScoped
public class FactureBean implements Serializable {

    @EJB
    private FactureFacade factureFacade;
    private Facture newFacture;
    private List<Facture> listFacture;
    private Facture selectedFacture;

    public FactureBean() {
    }

    @PostConstruct
    public void init() {
        listFacture = factureFacade.findAll();
        newFacture = new Facture();

    }

    public void saveFacture() {
        listFacture = factureFacade.findAll();
        newFacture = new Facture();
        factureFacade.create(null);

    }
    public void editFacture(ActionEvent event ){
        factureFacade.edit(selectedFacture);
        listFacture= factureFacade.findAll();
 }
    public void removeFacture(ActionEvent event){
    factureFacade.remove(selectedFacture);
    listFacture= factureFacade.findAll();
    
    }

    public FactureFacade getFactureFacade() {
        return factureFacade;
    }

    public void setFactureFacade(FactureFacade factureFacade) {
        this.factureFacade = factureFacade;
    }

    public Facture getNewFacture() {
        return newFacture;
    }

    public void setNewFacture(Facture newFacture) {
        this.newFacture = newFacture;
    }

    public List<Facture> getListFacture() {
        return listFacture;
    }

    public void setListFacture(List<Facture> listFacture) {
        this.listFacture = listFacture;
    }

    public Facture getSelectedFacture() {
        return selectedFacture;
    }

    public void setSelectedFacture(Facture selectedFacture) {
        this.selectedFacture = selectedFacture;
    }

}
