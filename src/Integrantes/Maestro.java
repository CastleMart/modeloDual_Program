package Integrantes;

import java.time.LocalDate;

public class Maestro extends Persona{

    private int noMaestro;
    private String escuela;

    public Maestro(int noMaestro, String nombres, String apellidoP, String apellidoM, LocalDate fechaNac, char sexo, String escuela){
        super(nombres, apellidoP, apellidoM, fechaNac, sexo);
        this.noMaestro = noMaestro;
        this.escuela = escuela;
    }

    public int getNoMaestro() {
        return noMaestro;
    }

    public void setNoMaestro(int noMaestro) {
        this.noMaestro = noMaestro;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
}
