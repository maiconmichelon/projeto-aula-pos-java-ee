/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Temas;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author jaimedias
 */
@ManagedBean
@ApplicationScoped
public class SistemaControle {

    private Temas temas = Temas.aristo;

    public Temas getTemas() {
        return temas;
    }

    public void setTemas(Temas temas) {
        this.temas = temas;
    }
    
    public Temas[] getListaTemas(){
	return Temas.values();
}

}
