package com.mycompany.proyecto.logica;

import com.mycompany.proyecto.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis;

    public Controladora() {
     controlPersis= new ControladoraPersistencia();
    }
       
    
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
    /*public Paciente traerPaciente(int id){
    return controlPersis.traerPaciente(id);
    }
    public ArrayList<Paciente> traerListaPacientes(Paciente pac){
        List<Paciente> lista = controlPersis.traerListaPacientes();
        ArrayList<Paciente> listaPacientes = new ArrayList<>(lista);
        return listaPacientes;
     
// return controlPersis.traerListaPacientes();
    }*/
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
    //public Usuario traerUsuario(int id){
    //return controlPersis.traerUsuario(id);
    //}
    /*public ArrayList<Usuario> traerListaUsuarios(){
        List<Usuario> lista = controlPersis.traerListaUsuarios();
        ArrayList<Usuario> listaUsuarios = new ArrayList<>(lista);
        return listaUsuarios;
      
//return controlPersis.traerListaUsuarios();
    }*/
    public String validarUsuario(String user, String contra) {
       String mensaje="";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
       
        for(Usuario usu: listaUsuarios){
         
         if(usu.getUsername().equals(user)){
           if(usu.getPassword().equals(contra)){
               mensaje="";
               return mensaje;
           }else{
             mensaje="Ingrese la contraseña correcta";
             return mensaje;
           }
         }else{
           mensaje ="Usuario o contraseña son incorrectos";
           return mensaje;
         }
       }return mensaje; 
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
   /* public Especialidad traerEspecialidad(int id){
    return controlPersis.traerEspecialidad(id);
    }
    public ArrayList<Especialidad> traerListaEspecialidades(){
        List<Especialidad> lista = controlPersis.traerListaEspecialidades();
        ArrayList<Especialidad> listaEspecialidades = new ArrayList<>(lista);
        return listaEspecialidades;
      
//return controlPersis.traerListaEspecialidades();
    }*/
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
    /*public Medico traerMedico(int id){
    return controlPersis.traerMedico(id);
    }
    public ArrayList<Medico> traerListaMedicos(){
        List<Medico> lista = controlPersis.traerListaMedicos();
        ArrayList<Medico> listaMedicos = new ArrayList<>(lista);
        return listaMedicos;
      
//return controlPersis.traerListaMedicos();
    }*/
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
    /*public Reservacion traerReservacion(int id){
    return controlPersis.traerReservacion(id);
    }
    public ArrayList<Reservacion> traerListaReservaciones(){
      List<Reservacion> lista = controlPersis.traerListaReservaciones();
        ArrayList<Reservacion> listaReservaciones = new ArrayList<>(lista);
        return listaReservaciones;
//return controlPersis.traerListaReservaciones();
    }*/
    // Estado
    public void crearEstado(Estado estado) {
        controlPersis.crearEstado(estado);
    }

    public void eliminarEstado(long id) {
        controlPersis.eliminarEstado(id);
    }

    public void editarEstado(Estado estado) {
        controlPersis.editarEstado(estado);
    }

   /* public Estado traerEstado(long id) {
        return controlPersis.traerEstado(id);
    }

    public ArrayList<Estado> traerListaEstados() {
        List<Estado> lista = controlPersis.traerListaEstados();
        ArrayList<Estado> listaEstados = new ArrayList<>(lista);
        return listaEstados;
        //return controlPersis.traerListaEstados();
    }
    
     public void mostrarTiposDeEstados() {
        List<Estado> tiposDeEstados = obtenerTiposDeEstados();

        System.out.println("Tipos de Estados:");
        for (Estado estado : tiposDeEstados) {
            System.out.println("ID: " + estado.getId() + ", Tipo: " + estado.getTipo());
        }
    }

    public List<Estado> obtenerTiposDeEstados() {
        return controlPersis.findEstadoEntities(); 
    }*/

    
    
}
