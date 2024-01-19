package com.mycompany.proyecto;

import com.mycompany.proyecto.igu.Login;
/*import com.mycompany.proyecto.logica.Controladora;
import com.mycompany.proyecto.logica.Especialidad;
import com.mycompany.proyecto.logica.Estado;
import com.mycompany.proyecto.logica.Medico;
import com.mycompany.proyecto.logica.Paciente;
import com.mycompany.proyecto.logica.Reservacion;
import com.mycompany.proyecto.logica.Usuario;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;*/


public class Proyecto {

    public static void main(String[] args) {
        
        // Controladora controladora = new Controladora();
         Login log=new Login();
         log.setVisible(true);
         log.setLocationRelativeTo(null);
         
    
      // Ejemplo de crear y consultar Pacientes
       /* Paciente nuevoPaciente = new Paciente(Long.MIN_VALUE, "Alejandro", "Macas", "Masculino", "alej@gmail.com", "Quito", "023125469", "", "", "", fechanacimiento, fecharegistro);
        controladora.crearPaciente(nuevoPaciente);

        Paciente pacienteConsultado = controladora.traerPaciente(01); // Ajusta el ID según tu base de datos
        System.out.println("Paciente consultado: " + pacienteConsultado);

        // Ejemplo de crear y consultar Usuarios
        Usuario nuevoUsuario = new Usuario(Long.MIN_VALUE, "useradmin", "admin@24", "David", "Brito", "dav@gmail.com", fecharegistro);
        controladora.crearUsuario(nuevoUsuario);

        Usuario usuarioConsultado = controladora.traerUsuario(01); // Ajusta el ID según tu base de datos
        System.out.println("Usuario consultado: " + usuarioConsultado);

        // Ejemplo de crear y consultar Especialidades
        Especialidad nuevaEspecialidad = new Especialidad(Long.MIN_VALUE, "Odontologia");
        controladora.crearEspecialidad(nuevaEspecialidad);

        Especialidad especialidadConsultada = controladora.traerEspecialidad(01); // Ajusta el ID según tu base de datos
        System.out.println("Especialidad consultada: " + especialidadConsultada);

        // Repite el proceso para las demás entidades (Medico, Reservacion, Estado) según sea necesario.
        // Ejemplo de crear y consultar Medico
        Medico nuevoMedico = new Medico(Long.MIN_VALUE, "Alfredo", "Sanchez", "Masculino", "alfredmed@gmail.com", "Guayaquil", "0231564789", fechanacimiento, fecharegistro, nuevaEspecialidad);
        controladora.crearPaciente(nuevoPaciente);

        Medico medicoConsultado = controladora.traerMedico(01); // Ajusta el ID según tu base de datos
        System.out.println("Medico consultado: " + medicoConsultado);
        
         // Ejemplo de crear y consultar Reservacion
        Reservacion nuevaReservacion = new Reservacion(Long.MIN_VALUE, "Cita odontologica", "", "", "Dolo de muela", "", "", Boolean.TRUE, fecha, hora, fechacreacion, est, nuevoUsuario, nuevoMedico, nuevoPaciente);
        controladora.crearEspecialidad(nuevaEspecialidad);

        Reservacion reservacionConsultada = controladora.traerReservacion(01); // Ajusta el ID según tu base de datos
        System.out.println("Reservacion consultada: " + reservacionConsultada);

         // Ejemplo de crear y consultar Reservacion
        Estado nuevaEstado = new Estado(Long.MIN_VALUE, "Disponible");
        controladora.crearEstado(nuevaEstado);

        Estado estadoConsultada = controladora.traerEstado(01); // Ajusta el ID según tu base de datos
        System.out.println("Estado consultada: " + estadoConsultada);
        
    }*/



       /* // Crear un objeto de tipo Calendar para obtener la fecha actual
        Calendar calendar = Calendar.getInstance();

        // Obtener la fecha actual
        java.util.Date fechaActual = calendar.getTime();

        // Dar valores de fecha a fechanacimiento y fecharegistro
        Date fechaNacimiento = Date.valueOf("1990-01-01"); // Ejemplo de fecha de nacimiento
        java.util.Date fechaRegistro = fechaActual; // Fecha actual como fecha de registro

        // Ejemplo de crear y consultar Pacientes
        Paciente nuevoPaciente = new Paciente(Long.MIN_VALUE, "Marcela", "Guerra", "F", "mar@gmail.com", "Quito", "0231456987", "", "", "", fechaNacimiento, fechaRegistro);
        controladora.crearPaciente(nuevoPaciente);

        Paciente pacienteConsultado = controladora.traerPaciente(1); // Ajusta el ID según tu base de datos
        System.out.println("Paciente consultado: " + pacienteConsultado);

        // Ejemplo de crear y consultar Usuarios
        Usuario nuevoUsuario = new Usuario(Long.MIN_VALUE, "admin", "admin@24", "David", "Brito", "dav@gmail.com", fechaRegistro);
        controladora.crearUsuario(nuevoUsuario);

        Usuario usuarioConsultado = controladora.traerUsuario(1); // Ajusta el ID según tu base de datos
        System.out.println("Usuario consultado: " + usuarioConsultado);

        // Ejemplo de crear y consultar Especialidades
        Especialidad nuevaEspecialidad = new Especialidad(Long.MIN_VALUE, "Odontologia");
        controladora.crearEspecialidad(nuevaEspecialidad);

        Especialidad especialidadConsultada = controladora.traerEspecialidad(1); // Ajusta el ID según tu base de datos
        System.out.println("Especialidad consultada: " + especialidadConsultada);

        // Ejemplo de crear y consultar Medico
        Medico nuevoMedico = new Medico(Long.MIN_VALUE, "María", "Adams", "F", "maradams@gmail.com", "Manabi", "0989452613", fechaNacimiento, fechaRegistro, nuevaEspecialidad);
        controladora.crearMedico(nuevoMedico);

        Medico medicoConsultado = controladora.traerMedico(1); // Ajusta el ID según tu base de datos
        System.out.println("Medico consultado: " + medicoConsultado);

          // Ejemplo de crear y consultar Estado
        Estado nuevoEstado = new Estado("Nuevo Tipo de Estado");
        controladora.crearEstado(nuevoEstado);
        System.out.println("Nuevo estado creado: " + nuevoEstado);

        // Ejemplo de obtener todos los tipos de estados
        List<Estado> tiposDeEstados = controladora.obtenerTiposDeEstados();
        System.out.println("Tipos de Estados: " + tiposDeEstados);
        
        // Ejemplo de crear y consultar Reservacion
        Reservacion nuevaReservacion = new Reservacion(Long.MIN_VALUE, "Odontologia", "Abrir historial medico", "", "Dolor de muela", "", "", Boolean.TRUE, fechaActual, fechaActual, fechaRegistro, nuevoEstado, nuevoUsuario, nuevoMedico, nuevoPaciente);
        controladora.crearReservacion(nuevaReservacion);

        Reservacion reservacionConsultada = controladora.traerReservacion(1); // Ajusta el ID según tu base de datos
        System.out.println("Reservacion consultada: " + reservacionConsultada);

      
*/
    }
}

