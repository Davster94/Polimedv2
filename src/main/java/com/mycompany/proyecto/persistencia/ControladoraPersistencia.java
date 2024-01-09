package com.mycompany.proyecto.persistencia;

import com.mycompany.proyecto.logica.Especialidad;
import com.mycompany.proyecto.logica.Estado;
import com.mycompany.proyecto.logica.Medico;
import com.mycompany.proyecto.logica.Paciente;
import com.mycompany.proyecto.logica.Reservacion;
import com.mycompany.proyecto.logica.Usuario;
import com.mycompany.proyecto.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    PacienteJpaController pacJpa = new PacienteJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    EspecialidadJpaController espJpa = new EspecialidadJpaController();
    EstadoJpaController estJpa = new EstadoJpaController();
    MedicoJpaController medJpa = new MedicoJpaController();
    ReservacionJpaController resJpa = new ReservacionJpaController();

    //Paciente
    public void crearPaciente(Paciente pac) {
      pacJpa.create(pac);
    }
    
     public void eliminarPaciente(long id) {
        try {
            pacJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void editarPaciente(Paciente pac){
       try{
           pacJpa.edit(pac);
       }catch(Exception ex){
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
       }
      }
      public Paciente traerPaciente(long id) {
        return pacJpa.findPaciente(id);
    }
      public ArrayList<Paciente> traerListaPacientes() {
       
          List<Paciente> lista = pacJpa.findPacienteEntities();
          ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>(lista);
          return  listaPacientes;
      
    }
    

   
      //Usuario
      public void crearUsuario(Usuario usu) {
      usuJpa.create(usu);
    }
     
      public void eliminarUsuario(long id) {
        try {
            usuJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void editarUsuario(Usuario usu) {
        try{
           usuJpa.edit(usu);
       }catch(Exception ex){
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
       }
    }
      public Usuario traerUsuario(long id) {
        return usuJpa.findUsuario(id);
    }
      public ArrayList<Usuario> traerListaUsuarios() {
       
          List<Usuario> listaus = usuJpa.findUsuarioEntities();
          ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>(listaus);
          return  listaUsuarios;
    }
       
      //Especialidad

    public void crearEspecialidad(Especialidad esp) {
        espJpa.create(esp);
    }
      public void eliminarEspecialidad(long id) {
        try {
            espJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void editarEspecialidad(Especialidad esp) {
        try{
           espJpa.edit(esp);
       }catch(Exception ex){
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
       }
    }
      public Especialidad traerEspecialidad(long id) {
        return espJpa.findEspecialidad(id);
    }
      public ArrayList<Especialidad> traerListaEspecialidades() {
       
          List<Especialidad> listaesp = espJpa.findEspecialidadEntities();
          ArrayList<Especialidad> listaEspecialidades = new ArrayList<Especialidad>(listaesp);
          return  listaEspecialidades;
    }
    
      //Medico
       public void crearMedico(Medico med) {
      medJpa.create(med);
    }
    
     public void eliminarMedico(long id) {
        try {
            medJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void editarMedico(Medico med) {
       try{
           medJpa.edit(med);
       }catch(Exception ex){
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
       }
    }
      public Medico traerMedico(long id) {
        return medJpa.findMedico(id);
    }
      public ArrayList<Medico> traerListaMedicos() {
       
          List<Medico> listamed = medJpa.findMedicoEntities();
          ArrayList<Medico> listaMedicos = new ArrayList<Medico>(listamed);
          return  listaMedicos;
    }
       
      //Reservacion
       public void crearReservacion(Reservacion res) {
      resJpa.create(res);
    }
    
     public void eliminarReservacion(long id) {
        try {
            resJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void editarReservacion(Reservacion res) {
       try{
           resJpa.edit(res);
       }catch(Exception ex){
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
       }
    }
     
      public Reservacion traerReservacion(long id) {
        return resJpa.findReservacion(id);
    }
      public ArrayList<Reservacion> traerListaReservaciones() {
       
          List<Reservacion> listares = resJpa.findReservacionEntities();
          ArrayList<Reservacion> listaReservaciones = new ArrayList<Reservacion>(listares);
          return  listaReservaciones;
    } 
      // Estado
    public void crearEstado(Estado estado) {
        estJpa.create(estado);
    }

    public void eliminarEstado(long id) {
        try {
            estJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEstado(Estado estado) {
        try {
            estJpa.edit(estado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Estado traerEstado(long id) {
        return estJpa.findEstado(id);
    }

    public ArrayList<Estado> traerListaEstados() {
        List<Estado> listaEstados = estJpa.findEstadoEntities();
        return new ArrayList<>(listaEstados);
    }
     
}
