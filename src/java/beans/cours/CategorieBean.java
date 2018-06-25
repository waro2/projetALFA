/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.cours;

import ejb.cours.CategorieCoursFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import jpa.cours.CategorieCours;

/**
 *
 * @author Alfa Waro
 */
@Named(value = "categorieBean")
@ViewScoped
public class CategorieBean implements Serializable {

    @EJB
    private CategorieCoursFacade categorieCoursFacade;
    private CategorieCours newCategorieCours;
    private List<CategorieCours> listCategorieCours;
    private CategorieCours selectedCategorieCours;

   

    public CategorieBean() {
    }
 @PostConstruct
    public void init() {
        listCategorieCours = categorieCoursFacade.findAll();
        newCategorieCours = new CategorieCours();
    }

    public void saveCategorieCours() {
        categorieCoursFacade.create(newCategorieCours);
        newCategorieCours = new CategorieCours();
        listCategorieCours = categorieCoursFacade.findAll();

    }
    public void editCategorieCours(ActionEvent event){
        categorieCoursFacade.edit(selectedCategorieCours);
        listCategorieCours= categorieCoursFacade.findAll();
    
    }
   public void removeCategorieCours(ActionEvent event){
       categorieCoursFacade.remove(selectedCategorieCours);
       listCategorieCours = categorieCoursFacade.findAll();
   
   }

    public CategorieCoursFacade getCategorieCoursFacade() {
        return categorieCoursFacade;
    }

    public void setCategorieCoursFacade(CategorieCoursFacade categorieCoursFacade) {
        this.categorieCoursFacade = categorieCoursFacade;
    }

    public CategorieCours getNewCategorieCours() {
        return newCategorieCours;
    }

    public void setNewCategorieCours(CategorieCours newCategorieCours) {
        this.newCategorieCours = newCategorieCours;
    }

    public List<CategorieCours> getListCategorieCours() {
        return listCategorieCours;
    }

    public void setListCategorieCours(List<CategorieCours> listCategorieCours) {
        this.listCategorieCours = listCategorieCours;
    }
 public CategorieCours getSelectedCategorieCours() {
        return selectedCategorieCours;
    }

    public void setSelectedCategorieCours(CategorieCours selectedCategorieCours) {
        this.selectedCategorieCours = selectedCategorieCours;
    }
}
