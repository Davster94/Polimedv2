package com.mycompany.proyecto;


import com.mycompany.proyecto.logica.Controladora;
import com.mycompany.proyecto.logica.Paciente;
import java.util.Date;



public class Proyecto {

    public static void main(String[] args) {
       /*ControladoraPersistencia controlPersis = new ControladoraPersistencia();*/
       Controladora control = new Controladora();
       //Paciente
       
       Paciente pac = new Paciente(1, "Javier", "Garmendia", "Masculino", "javier@gmail.com", "Las abras", "023545469", "", "", "", Boolean.TRUE, new Date(), new Date());
       control.crearPaciente(pac);
    }
}
