package com.mycompany.proyecto;


import com.mycompany.proyecto.logica.Controladora;
import com.mycompany.proyecto.logica.Paciente;
import java.util.Date;



public class Proyecto {

    public static void main(String[] args) {
       /*ControladoraPersistencia controlPersis = new ControladoraPersistencia();*/
       Controladora control = new Controladora();
       //Paciente
       
       /*Paciente pac = new Paciente(1, "Javier", "Garmendia", "Masculino", "javier@gmail.com", "Las abras", "023545469", "", "", "", Boolean.TRUE, new Date(), new Date());
       control.crearPaciente(pac);
       control.eliminarPaciente(1);
       //Busqueda
       Paciente pac = control.traerPaciente(1);
       System.out.println("------------Busqueda Individual-----------");
       System.out.println("El alumno es: "+ pac.toString());
       
       System.out.println("--------Busqueda Conjunto--------");
       ArrayList<Paciente> listaPacientes = control.traerListaPacientes();
       for(Paciente pa : listaPacientes){
          System.out.println("El alumno es: "+pa.toString());
       }
       System.out.println("------------------------------------");
       */
    }
}
