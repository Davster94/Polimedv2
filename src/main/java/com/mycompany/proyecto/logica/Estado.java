package com.mycompany.proyecto.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;

@Entity
@Table(name="estado")
public class Estado implements Serializable {
    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    //private int id;
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Basic
    @Column(name="tipo")
    private String tipo;

    public Estado() {
    }

    /*public Estado(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estatus{" + "id=" + id + ", estado=" + estado + '}';
    }*/

    public Estado(String tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static List<Estado> obtenerTiposDeEstados(EntityManager entityManager) {
        Query query = entityManager.createQuery("SELECT e FROM Estado e");
        return query.getResultList();
    }

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
    
    
    
}
