package com.fatec.prova.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_EMPRESA")


public class Empresa implements Serializable {

    @Id
    
    private Integer id;

    private String name;
    
    @Column(unique = true)
     private String email;


    private Integer qnt;
    private Integer contato;

    public Empresa() {
    }

    public Empresa(int id, String name, String email, int qnt, int contato) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.qnt = qnt;
        this.contato = contato;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getQnt() {
        return qnt;
    }
    public void setQnt(Integer qnt) {
        this.qnt = qnt;
    }
    public Integer getContato() {
        return contato;
    }
    public void setContato(Integer contato) {
        this.contato = contato;
    }

    public Empresa getEmpresaById(int id2) {
        return null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((qnt == null) ? 0 : qnt.hashCode());
        result = prime * result + ((contato == null) ? 0 : contato.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empresa other = (Empresa) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (qnt == null) {
            if (other.qnt != null)
                return false;
        } else if (!qnt.equals(other.qnt))
            return false;
        if (contato == null) {
            if (other.contato != null)
                return false;
        } else if (!contato.equals(other.contato))
            return false;
        return true;
    }

   

    
    

    
}
