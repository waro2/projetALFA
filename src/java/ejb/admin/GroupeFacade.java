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
import jpa.admin.Groupe;

/**
 *
 * @author Alfa Waro
 */
@Stateless
public class GroupeFacade extends AbstractFacade<Groupe> {
    @PersistenceContext(unitName = "lmdrPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GroupeFacade() {
        super(Groupe.class);
    }
    
}
