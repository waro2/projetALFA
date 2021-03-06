/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.admin;

import ejb.AbstractFacade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.admin.Utilisateur;

/**
 *
 * @author Alfa Waro
 */
@Stateless
public class UtilisateurFacade extends AbstractFacade<Utilisateur> {
    @PersistenceContext(unitName = "lmdrPU") 
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtilisateurFacade() {
        super(Utilisateur.class);
    }
    
}
