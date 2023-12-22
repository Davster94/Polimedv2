package com.mycompany.proyecto.logica;

import com.mycompany.proyecto.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    //Paciente
    public void crearPaciente(Paciente pac){
    controlPersis.crearPaciente(pac);
    }
    //Usuario
   /* public void crearUsuario(Usuario usu){
    controlPersis.crearUsuario(usu);
    }
    //Especailidad
     public void crearEspecialidad(Especialidad esp){
    controlPersis.crearEspecialidad(esp);
    }*/
}
