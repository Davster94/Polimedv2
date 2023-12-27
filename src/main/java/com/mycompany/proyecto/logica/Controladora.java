package com.mycompany.proyecto.logica;

import com.mycompany.proyecto.persistencia.ControladoraPersistencia;
import java.util.ArrayList;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    //Paciente
    public void crearPaciente(Paciente pac){
    controlPersis.crearPaciente(pac);
    }
    public void eliminarPaciente(int id){
      controlPersis.eliminarPaciente(id);
    }
    public void editarPaciente(Paciente pac){
    controlPersis.editarPaciente(pac);
    }
    public Paciente traerPaciente(int id){
    return controlPersis.traerPaciente(id);
    }
    public ArrayList<Paciente> traerListaPacientes(){
      return controlPersis.traerListaPacientes();
    }
    //Usuario
    public void crearUsuario(Usuario usu){
    controlPersis.crearUsuario(usu);
    }
     public void eliminarUsuario(int id){
      controlPersis.eliminarUsuario(id);
    }
    public void editarUsuario(Usuario usu){
    controlPersis.editarUsuario(usu);
    }
    public Paciente traerUsuario(int id){
    return controlPersis.traerUsuario(id);
    }
    public ArrayList<Usuario> traerListaUsuarios(){
      return controlPersis.traerListaUsuarios();
    }
    //Especailidad
     public void crearEspecialidad(Especialidad esp){
    controlPersis.crearEspecialidad(esp);
    }
     public void eliminarEspecialidad(int id){
      controlPersis.eliminarEspecialidad(id);
    }
    public void editarEspecialidad(Especialidad esp){
    controlPersis.editarEspecialidad(esp);
    }
    public Especialidad traerEspecialidad(int id){
    return controlPersis.traerEspecialidad(id);
    }
    public ArrayList<Especialidad> traerListaEspecialidades(){
      return controlPersis.traerListaEspecialidades();
    }
    //Medico
     public void crearMedico(Medico med){
    controlPersis.crearMedico(med);
    }
    public void eliminarMedico(int id){
      controlPersis.eliminarMedico(id);
    }
    public void editarMedico(Medico med){
    controlPersis.editarMedico(med);
    }
    public Medico traerMedico(int id){
    return controlPersis.traerMedico(id);
    }
    public ArrayList<Medico> traerListaMedicos(){
      return controlPersis.traerListaMedicos();
    }
    //Reservacion
     public void crearReservacion(Reservacion res){
    controlPersis.crearReservacion(res);
    }
    public void eliminarReservacion(int id){
      controlPersis.eliminarReservacion(id);
    }
    public void editarReservacion(Reservacion res){
    controlPersis.editarReservacion(res);
    }
    public Reservacion traerReservacion(int id){
    return controlPersis.traerReservacion(id);
    }
    public ArrayList<Reservacion> traerListaReservaciones(){
      return controlPersis.traerListaReservaciones();
    }
    
}
