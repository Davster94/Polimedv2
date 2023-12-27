package com.mycompany.proyecto.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservacion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String titulo;
    private String nota;
    private String mensaje;
    private String sintomas;
    private String enfermedad;
    private String medicamento;
    private Boolean conectado;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    
    @OneToOne
    private Estatus est;
    @ManyToOne
    private Usuario usu;
    @ManyToOne
    private Medico med;
    @ManyToOne
    private Paciente pac;

    public Reservacion() {
    }

    public Reservacion(int id, String titulo, String nota, String mensaje, String sintomas, String enfermedad, String medicamento, Boolean conectado, Date fecha, Date hora, Date fechacreacion, Estatus est, Usuario usu, Medico med, Paciente pac) {
        this.id = id;
        this.titulo = titulo;
        this.nota = nota;
        this.mensaje = mensaje;
        this.sintomas = sintomas;
        this.enfermedad = enfermedad;
        this.medicamento = medicamento;
        this.conectado = conectado;
        this.fecha = fecha;
        this.hora = hora;
        this.fechacreacion = fechacreacion;
        this.est = est;
        this.usu = usu;
        this.med = med;
        this.pac = pac;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public Boolean getConectado() {
        return conectado;
    }

    public void setConectado(Boolean conectado) {
        this.conectado = conectado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Estatus getEst() {
        return est;
    }

    public void setEst(Estatus est) {
        this.est = est;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public Medico getMed() {
        return med;
    }

    public void setMed(Medico med) {
        this.med = med;
    }

    public Paciente getPac() {
        return pac;
    }

    public void setPac(Paciente pac) {
        this.pac = pac;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "id=" + id + ", titulo=" + titulo + ", nota=" + nota + ", mensaje=" + mensaje + ", sintomas=" + sintomas + ", enfermedad=" + enfermedad + ", medicamento=" + medicamento + ", conectado=" + conectado + ", fecha=" + fecha + ", hora=" + hora + ", fechacreacion=" + fechacreacion + ", est=" + est + ", usu=" + usu + ", med=" + med + ", pac=" + pac + '}';
    }

   
    
    
}
