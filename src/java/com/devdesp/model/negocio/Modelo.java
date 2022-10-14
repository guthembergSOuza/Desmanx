package com.devdesp.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author guthemberg.interamin
 */
@Entity
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    public String nome;
    public String fabricante;
    public String tipo;
    public long potenciaMotor;
    public long cilindradaMotor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(long potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public long getCilindradaMotor() {
        return cilindradaMotor;
    }

    public void setCilindradaMotor(long cilindradaMotor) {
        this.cilindradaMotor = cilindradaMotor;
    }
    
    
}
