package com.mycompany.proyecto;


import com.mycompany.proyecto.logica.Controladora;
import com.mycompany.proyecto.logica.Especialidad;
import com.mycompany.proyecto.logica.Medico;
import com.mycompany.proyecto.logica.Paciente;
import com.mycompany.proyecto.logica.Reservacion;
import static com.mycompany.proyecto.logica.Reservacion_.est;
import static com.mycompany.proyecto.logica.Reservacion_.med;
import com.mycompany.proyecto.logica.Usuario;
import java.sql.Time;
import java.util.Date;



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
       Reservacion res1= new Reservacion(1, "ResOdon1", "El paciente sufre de fuerte dolor de muela", "", "Fiebre,dolor de cabeza,mareo,vomito", "", "", Boolean.TRUE, new Date(),Time(""), new Date(),med,est , usu, pac);
       Reservacion res2= new Reservacion(2, "ResOdon2", "El paciente sufre de fuerte dolor de muela", "", "Fiebre,dolor de cabeza,mareo,vomito", "", "", Boolean.TRUE, new Date(),Time(""), new Date(),med,est , usu, pac);
       Reservacion res3= new Reservacion(3, "ResOdon3", "El paciente sufre de fuerte dolor de muela", "", "Fiebre,dolor de cabeza,mareo,vomito", "", "", Boolean.TRUE, new Date(),Time(""), new Date(),med,est , usu, pac);
       
//Guardar en bd
       control.crearReservacion(res);
        
     //Creacion de especialidad
     Especialidad esp1 = new Especialidad(001, "Odontologia");
     Especialidad esp2 = new Especialidad(002, "Fisioterapia");
     Especialidad esp3 = new Especialidad(003, "Medicina General");
     
     //Guardar Especialidades en base de datos
     control.crearEspecialidad(esp1);
     control.crearEspecialidad(esp2);
     control.crearEspecialidad(esp3);
     
     //Registro de medicos con especialidad
     Medico med= new Medico(1, "Alfred", "Bonifaz", "Masculino", "bifaz72@gmail.com", "Barrio nuevo", "099542234", Boolean.TRUE, new Date(), new Date(), esp4, listaReservaciones);
    }
}
