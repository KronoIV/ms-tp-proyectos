package co.edu.uco.taskpeak.proyectos.domain;

public interface DomainRule<T> {

    void validate(T Data);
}
