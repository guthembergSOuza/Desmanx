package com.devdesp.controllers;

import com.devdesp.model.dao.ManagerDao;
import com.devdesp.model.negocio.Peca;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author guthemberg.interamin
 */
public class PecaController {
    private Peca peca;
    private Peca selPeca;
    
    @PostConstruct
    public void init(){
        this.peca = new Peca();
    }
    
    public String inserir(){
        
        ManagerDao.getCurrentInstance().insert(this.peca);
        
        this.peca = new Peca();
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Peca cadastrado com sucesso!"));
        
        return "ApresentaPeca";
    }
    
    public List<Peca> readAllPeca(){
        
        List<Peca> tipos = ManagerDao.getCurrentInstance()
                .read("select tv from Peca tv", 
                        Peca.class);
        return tipos;
    }
    
    public String alterar(){
        
        ManagerDao.getCurrentInstance().update(this.selPeca);
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Peca alterado com sucesso!"));
        
        return "ApresentaPeca";
        
    }
    
    public void deletar(){
        ManagerDao.getCurrentInstance().delete(this.selPeca);
    
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Peca deletado com sucesso!"));
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public Peca getSelPeca() {
        return selPeca;
    }

    public void setSelPeca(Peca selPeca) {
        this.selPeca = selPeca;
    }   
}
