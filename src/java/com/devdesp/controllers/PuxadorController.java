
package com.devdesp.controllers;

import com.devdesp.model.dao.ManagerDao;
import com.devdesp.model.negocio.Puxador;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author guthemberg.interamin
 */
public class PuxadorController {
    
    private Puxador puxador;
    private Puxador selPuxador;
    
    @PostConstruct
    public void init(){
        this.puxador = new Puxador();
    }
    
    public String inserir(){
        
        ManagerDao.getCurrentInstance().insert(this.puxador);
        
        this.puxador = new Puxador();
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Puxador cadastrado com sucesso!"));
        
        return "ApresentaPuxador";
    }
    
    public List<Puxador> readAllPuxador(){
        
        List<Puxador> tipos = ManagerDao.getCurrentInstance()
                .read("select tv from Puxador tv", 
                        Puxador.class);
        return tipos;
    }
    
    public String alterar(){
        
        ManagerDao.getCurrentInstance().update(this.selPuxador);
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Puxador alterado com sucesso!"));
        
        return "ApresentaPuxador";
        
    }
    
    public void deletar(){
        ManagerDao.getCurrentInstance().delete(this.selPuxador);
    
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Puxador deletado com sucesso!"));
    }

    public Puxador getPuxador() {
        return puxador;
    }

    public void setPuxador(Puxador puxador) {
        this.puxador = puxador;
    }

    public Puxador getSelPuxador() {
        return selPuxador;
    }

    public void setSelPuxador(Puxador selPuxador) {
        this.selPuxador = selPuxador;
    }   
}
