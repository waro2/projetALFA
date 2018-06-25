/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.facture;

import ejb.AbstractFacade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.facture.Payer;

/**
 *
 * @author Alfa Waro
 */
@Stateless
public class PayerFacade extends AbstractFacade<Payer> {
    @PersistenceContext(unitName = "lmdrPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PayerFacade() {
        super(Payer.class);
    }
    
}
