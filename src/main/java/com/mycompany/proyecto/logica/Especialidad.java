package com.mycompany.proyecto.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="especialidad")
public class Especialidad implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    //private int id;
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombespec;
    

    public Especialidad() {
    }

    /*public Especialidad(int id, String nombespec) {
        this.id = id;
        this.nombespec = nombespec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombespec() {
        return nombespec;
    }

    public void setNombespec(String nombespec) {
        this.nombespec = nombespec;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "id=" + id + ", nombespec=" + nombespec + '}';
    }*/

    public Especialidad(Long id, String nombespec) {
        this.id = id;
        this.nombespec = nombespec;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombespec() {
        return nombespec;
    }

    public void setNombespec(String nombespec) {
        this.nombespec = nombespec;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "id=" + id + ", nombespec=" + nombespec + '}';
    }
    
    
    
}
