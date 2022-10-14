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
public class Puxador {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    public String cpf;
    public String nome;
    public String sobrenome;
    public String telefone;
    public String endereco;
    public String enderecoMae;
    public Integer quantidadePrisoes;
    public String especialidadeRoubo;
    public Long anosExperiencia;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEnderecoMae() {
        return enderecoMae;
    }

    public void setEnderecoMae(String enderecoMae) {
        this.enderecoMae = enderecoMae;
    }

    public Integer getQuantidadePrisoes() {
        return quantidadePrisoes;
    }

    public void setQuantidadePrisoes(Integer quantidadePrisoes) {
        this.quantidadePrisoes = quantidadePrisoes;
    }

    public String getEspecialidadeRoubo() {
        return especialidadeRoubo;
    }

    public void setEspecialidadeRoubo(String especialidadeRoubo) {
        this.especialidadeRoubo = especialidadeRoubo;
    }

    public Long getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(Long anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    
}
