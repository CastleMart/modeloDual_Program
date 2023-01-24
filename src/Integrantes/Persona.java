package Integrantes;

import java.sql.Time;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Persona {

    //Atributos de la clase persona

    private String nombres;
    private String apellidoP;
    private String apellidoM;
    private LocalDate fechaNac;
    private char sexo;

    public Persona(String nombres, String apellidoP, String apellidoM, LocalDate fechaNac, char sexo){

        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fechaNac = fechaNac;
        this.sexo = sexo;

    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }


    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setFechaNac(int dia, int mes, int anio){
        LocalDate fecha = LocalDate.of(anio,mes,dia);

    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public long getEdad(){

        long edad = 0;
        edad = ChronoUnit.YEARS.between(this.fechaNac,LocalDate.now());

        return edad;

    }
}
