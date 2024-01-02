package com.mycompany.proyecto;

import com.mycompany.proyecto.logica.Controladora;
import com.mycompany.proyecto.logica.Especialidad;
import com.mycompany.proyecto.logica.Medico;
import com.mycompany.proyecto.logica.Paciente;
import com.mycompany.proyecto.logica.Reservacion;
import static com.mycompany.proyecto.logica.Reservacion_.est;
import static com.mycompany.proyecto.logica.Reservacion_.med;
import com.mycompany.proyecto.logica.Usuario;
import java.util.Date;
import java.util.LinkedList;



public class Proyecto {

    public static void main(String[] args) {
       Controladora control = new Controladora();
       //Crear usuario
       Usuario usu= new Usuario(1, "admin", "admin@2023", "DavBla", "BriPro", "admin23@gmail.com", Boolean.TRUE, Boolean.TRUE, new Date());
       //Guardar usuario en bd
       control.crearUsuario(usu);
       //Crear Paciente
       Paciente pac = new Paciente(001, "Javier", "Rodriguez", "Masculino", "rod6@gmail.com", "Colta", "03264587", "", "", "Paracetamol", Boolean.TRUE, new Date(), new Date());
       //Guardar paciente en bd
       control.crearPaciente(pac);
       //Crear Reservacion
       Reservacion res1= new Reservacion(0001, "Odontología", "", "", "Fuerte dolor de muela del juicio", "", "", Boolean.TRUE, new Date(), new Date(), est, usu, med, pac);
       Reservacion res2= new Reservacion(0002, "", "", "", "", "", "", Boolean.TRUE, new Date(), new Date(), est, usu, med, pac);
       Reservacion res3= new Reservacion(0003, titulo, nota, mensaje, sintomas, enfermedad, medicamento, Boolean.TRUE, new Date(), new Date(), est, usu, med, pac);
 
       
//Guardar en bd
       control.crearReservacion(res1);
       control.crearReservacion(res2);
       control.crearReservacion(res3);
       //Creacion de lista de reservaciones
       LinkedList<Reservacion> listaReservacion = new LinkedList<Reservacion>();
        listaReservacion.add(res1);
        listaReservacion.add(res2);
        listaReservacion.add(res3);
     //Creacion de especialidad
     Especialidad esp = new Especialidad(001, "Odontologia");
     
     //Guardar Especialidades en base de datos
     control.crearEspecialidad(esp);
     
     
     //Registro de medicos con especialidad
     Medico med= new Medico(1, "Alfred", "Bonifaz", "Masculino", "bifaz72@gmail.com", "Barrio nuevo", "099542234", Boolean.TRUE, new Date(), new Date(), esp, listaReservacion);
     //Guardar medico en base de datos
     control.crearMedico(med);
    }
}
