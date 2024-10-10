package co.edu.uco.taskpeak.proyectos.domain.rolProyecto;

import co.edu.uco.taskpeak.proyectos.domain.Domain;

import java.util.UUID;

public class RolProyectoDomain extends Domain {

    private  String nombre;

    public RolProyectoDomain(UUID id, String nombre) {
        super(id);
        setNombre(nombre);
    }

    public final String getNombre() {
        return nombre;
    }

    private final void setNombre(final String nombre) {
        this.nombre = nombre;
    }
}
