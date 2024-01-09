package com.mycompany.proyecto.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    @Id
   // @GeneratedValue(strategy=GenerationType.AUTO)
    //private int id;
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String username;
    private String password;
    private String nombre_user;
    private String apellido_usuario;
    @Column(unique=true)
    private String email_user;
    private Boolean activo=true;
    private Boolean admi=false;
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fecharegistro;

    public Usuario() {
    }
    
    

   /* public Usuario(int id, String username, String password, String nombre_user, String apellido_usuario, String email_user, Boolean activo, Boolean admi, Date fecharegistro) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombre_user = nombre_user;
        this.apellido_usuario = apellido_usuario;
        this.email_user = email_user;
        this.activo = activo;
        this.admi = admi;
        this.fecharegistro = fecharegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getEmail_user() {
        return email_user;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getAdmi() {
        return admi;
    }

    public void setAdmi(Boolean admi) {
        this.admi = admi;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", username=" + username + ", password=" + password + ", nombre_user=" + nombre_user + ", apellido_usuario=" + apellido_usuario + ", email_user=" + email_user + ", activo=" + activo + ", admi=" + admi + ", fecharegistro=" + fecharegistro + '}';
    }*/

    public Usuario(Long id, String username, String password, String nombre_user, String apellido_usuario, String email_user, Date fecharegistro) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombre_user = nombre_user;
        this.apellido_usuario = apellido_usuario;
        this.email_user = email_user;
        this.fecharegistro = fecharegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getEmail_user() {
        return email_user;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getAdmi() {
        return admi;
    }

    public void setAdmi(Boolean admi) {
        this.admi = admi;
    }

    public java.util.Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(java.util.Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", username=" + username + ", password=" + password + ", nombre_user=" + nombre_user + ", apellido_usuario=" + apellido_usuario + ", email_user=" + email_user + ", activo=" + activo + ", admi=" + admi + ", fecharegistro=" + fecharegistro + '}';
    }
    
    
    
}
