package com.mycompany.proyecto.persistencia;

import com.mycompany.proyecto.logica.Especialidad;
import com.mycompany.proyecto.logica.Paciente;
import com.mycompany.proyecto.logica.Usuario;


public class ControladoraPersistencia {
    PacienteJpaController pacJpa = new PacienteJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    EspecialidadJpaController espJpa = new EspecialidadJpaController();
    EstatusJpaController estJpa = new EstatusJpaController();

    public void crearPaciente(Paciente pac) {
      pacJpa.create(pac);
    }

   /* public void crearUsuario(Usuario usu) {
      usuJpa.create(usu);
    }

    public void crearEspecialidad(Especialidad esp) {
        espJpa.create(esp);
    }*/
}
