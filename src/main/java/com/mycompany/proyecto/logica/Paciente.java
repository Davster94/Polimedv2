
package com.mycompany.proyecto.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Paciente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private String nombrepac;
    private String apellidopac;
    private String genero;
    private String email;
    private String direccion;
    private String telefono;
    private String enfermedad;
    private String alergia;
    private String medicamento;
    private Boolean activo;
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;

    public Paciente() {
    }

    public Paciente(int id, String nombrepac, String apellidopac, String genero, String email, String direccion, String telefono, String enfermedad, String alergia, String medicamento, Boolean activo, Date fechanacimiento, Date fecharegistro) {
        this.id = id;
        this.nombrepac = nombrepac;
        this.apellidopac = apellidopac;
        this.genero = genero;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.enfermedad = enfermedad;
        this.alergia = alergia;
        this.medicamento = medicamento;
        this.activo = activo;
        this.fechanacimiento = fechanacimiento;
        this.fecharegistro = fecharegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrepac() {
        return nombrepac;
    }

    public void setNombrepac(String nombrepac) {
        this.nombrepac = nombrepac;
    }

    public String getApellidopac() {
        return apellidopac;
    }

    public void setApellidopac(String apellidopac) {
        this.apellidopac = apellidopac;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    
    

    
}
