package Integrantes;

import java.time.LocalDate;

public class Alumno extends Persona{

    private int noControl;
    private double promedioEscuela, promedioDual;
    private String escuela;

    public Alumno(int noControl, String nombres, String apellidoP, String apellidoM, LocalDate fechaNac, char sexo, double promedioEscuela, double promedioDual, String escuela){
        super(nombres, apellidoP, apellidoM, fechaNac, sexo);
        this.promedioEscuela = promedioEscuela;
        this.promedioDual = promedioDual;
        this.noControl = noControl;
        this.escuela = escuela;

    }

    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }

    public double getPromedioEscuela() {
        return promedioEscuela;
    }

    public void setPromedioEscuela(double promedioEscuela) {
        this.promedioEscuela = promedioEscuela;
    }

    public double getPromedioDual() {
        return promedioDual;
    }

    public void setPromedioDual(double promedioDual) {
        this.promedioDual = promedioDual;
    }
}
