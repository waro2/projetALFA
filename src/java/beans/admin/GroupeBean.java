/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.admin;

import ejb.admin.GroupeFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import jpa.admin.Groupe;

/**
 *
 * @author Alfa Waro
 */
@Named(value = "groupeBean")
@ViewScoped
public class GroupeBean implements Serializable {

    @EJB
    private GroupeFacade groupeFacade;
    private List<Groupe> listGroupes;
    private Groupe newGroupe;
    private Groupe selectedGroupe;

    public GroupeBean() {
    }

    @PostConstruct
    public void init() {
        listGroupes = groupeFacade.findAll();
        newGroupe = new Groupe();
    }

    public void saveGroupe(ActionEvent event) {
        groupeFacade.create(newGroupe);
        listGroupes = groupeFacade.findAll();
        newGroupe = new Groupe();
    }

    public void editGroupe(ActionEvent event) {
      groupeFacade.edit(selectedGroupe);
      listGroupes= groupeFacade.findAll();

    }

    public void removeGroupe(ActionEvent event) {
        groupeFacade.remove(selectedGroupe);
        listGroupes = groupeFacade.findAll();
    }

    public GroupeFacade getGroupeFacade() {
        return groupeFacade;
    }

    public void setGroupeFacade(GroupeFacade groupeFacade) {
        this.groupeFacade = groupeFacade;
    }

    public List<Groupe> getListGroupes() {
        return listGroupes;
    }

    public void setListGroupes(List<Groupe> listGroupes) {
        this.listGroupes = listGroupes;
    }

    public Groupe getNewGroupe() {
        return newGroupe;
    }

    public void setNewGroupe(Groupe newGroupe) {
        this.newGroupe = newGroupe;
    }

    public Groupe getSelectedGroupe() {
        return selectedGroupe;
    }

    public void setSelectedGroupe(Groupe selectedGroupe) {
        this.selectedGroupe = selectedGroupe;
    }

}
