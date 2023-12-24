package com.mycompany.proyecto.persistencia;

import com.mycompany.proyecto.logica.Especialidad;
import com.mycompany.proyecto.logica.Paciente;
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
    EstatusJpaController estJpa = new EstatusJpaController();
    MedicoJpaController medJpa = new MedicoJpaController();
    ReservacionJpaController resJpa = new ReservacionJpaController();

    //Paciente
    public void crearPaciente(Paciente pac) {
      pacJpa.create(pac);
    }
    
     public void eliminarPaciente(int id) {
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
      public Paciente traerPaciente(int id) {
        return pacJpa.findPaciente(id);
    }
      public ArrayList<Paciente> traerListaPacientes() {
       
          List<Paciente> lista = pacJpa.findPacienteEntities();
          ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>(lista);
          return  listaPacientes;
    }

   /* 
      //Usuario
      public void crearUsuario(Usuario usu) {
      usuJpa.create(usu);
    }
     
      public void eliminarUsuario(int id) {
        try {
            usuJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public Paciente traerUsuario(int id) {
        return pacJpa.findUsuario(id);
    }
      public ArrayList<Usuario> traerListaUsuarios() {
       
          List<Usuario> listaus = usuJpa.findUsuarioEntities();
          ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>(listausu);
          return  listaUsuarios;
    }
      //Especialidad

    public void crearEspecialidad(Especialidad esp) {
        espJpa.create(esp);
    }
      public void eliminarEspecialidad(int id) {
        try {
            espJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public Especialidad traerEspecialidad(int id) {
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
    
     public void eliminarMedico(int id) {
        try {
            medJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public Medico traerMedico(int id) {
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
    
     public void eliminarReservacion(int id) {
        try {
            resJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public Reservacion traerReservacion(int id) {
        return resJpa.findReservacion(id);
    }
      public ArrayList<Reservacion> traerListaReservaciones() {
       
          List<Reservacion> listares = resJpa.findReservacionEntities();
          ArrayList<Reservacion> listaReservaciones = new ArrayList<Reservacion>(listares);
          return  listaReservaciones;
    }
     */

    

   

   
}
