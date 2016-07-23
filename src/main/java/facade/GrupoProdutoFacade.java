/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entidade.GrupoProduto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *I
 * @author jaimedias
 */
@Stateless
public class GrupoProdutoFacade extends AbstractFacade<GrupoProduto>{

    @PersistenceContext(unitName = "posfcvjsfPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public GrupoProdutoFacade() {
        super(GrupoProduto.class);
    }
    
}
