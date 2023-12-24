package com.mycompany.proyecto.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Medico implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private String nombre_med;
    private String apellido_med;
    private String genero_med;
    private String email_med;
    private String direccion_med;
    private String telefono;
    private Boolean activo;
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    
    @OneToOne
    private Especialidad esp;

    public Medico() {
    }

    public Medico(int id, String nombre_med, String apellido_med, String genero_med, String email_med, String direccion_med, String telefono, Boolean activo, Date fechanacimiento, Date fecharegistro, Especialidad esp) {
        this.id = id;
        this.nombre_med = nombre_med;
        this.apellido_med = apellido_med;
        this.genero_med = genero_med;
        this.email_med = email_med;
        this.direccion_med = direccion_med;
        this.telefono = telefono;
        this.activo = activo;
        this.fechanacimiento = fechanacimiento;
        this.fecharegistro = fecharegistro;
        this.esp = esp;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public String getApellido_med() {
        return apellido_med;
    }

    public void setApellido_med(String apellido_med) {
        this.apellido_med = apellido_med;
    }

    public String getGenero_med() {
        return genero_med;
    }

    public void setGenero_med(String genero_med) {
        this.genero_med = genero_med;
    }

    public String getEmail_med() {
        return email_med;
    }

    public void setEmail_med(String email_med) {
        this.email_med = email_med;
    }

    public String getDireccion_med() {
        return direccion_med;
    }

    public void setDireccion_med(String direccion_med) {
        this.direccion_med = direccion_med;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public Especialidad getEsp() {
        return esp;
    }

    public void setEsp(Especialidad esp) {
        this.esp = esp;
    }

    @Override
    public String toString() {
        return "Medico{" + "id=" + id + ", nombre_med=" + nombre_med + ", apellido_med=" + apellido_med + ", genero_med=" + genero_med + ", email_med=" + email_med + ", direccion_med=" + direccion_med + ", telefono=" + telefono + ", activo=" + activo + ", fechanacimiento=" + fechanacimiento + ", fecharegistro=" + fecharegistro + ", esp=" + esp + '}';
    }

   

    
}
