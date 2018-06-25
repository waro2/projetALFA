/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.cours;

import ejb.cours.PaysFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import jpa.cours.Pays;

/**
 *
 * @author Alfa Waro
 */
@Named(value = " paysBean")
@ViewScoped
public class PaysBean implements Serializable {

    @EJB
    private PaysFacade paysFacade;
    private Pays newPays;
    private List<Pays> listPays;
    private Pays selectedPays;

    public PaysBean() {
    }

    @PostConstruct
    public void init() {
        listPays = paysFacade.findAll();
        newPays = new Pays();

    }

    public void savePays() {
        paysFacade.create(newPays);
        listPays = paysFacade.findAll();
        newPays = new Pays();
  }
    public void editPays(ActionEvent event){
     paysFacade.edit(selectedPays);
     listPays= paysFacade.findAll();
   }
public void removePays(ActionEvent event){
    paysFacade.remove(selectedPays);
    listPays= paysFacade.findAll();

}
    public PaysFacade getPaysFacade() {
        return paysFacade;
    }

    public void setPaysFacade(PaysFacade paysFacade) {
        this.paysFacade = paysFacade;
    }

    public Pays getNewPays() {
        return newPays;
    }

    public void setNewPays(Pays newPays) {
        this.newPays = newPays;
    }

    public List<Pays> getListPays() {
        return listPays;
    }

    public void setListPays(List<Pays> listPays) {
        this.listPays = listPays;
    }

    public Pays getSelectedPays() {
        return selectedPays;
    }

    public void setSelectedPays(Pays selectedPays) {
        this.selectedPays = selectedPays;
    }

}
