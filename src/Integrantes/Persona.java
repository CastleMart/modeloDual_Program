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

    /**
     * Constructor de la clase persona.
     * @param nombres
     * @param apellidoP
     * @param apellidoM
     * @param fechaNac
     * @param sexo
     */
    public Persona(String nombres, String apellidoP, String apellidoM, LocalDate fechaNac, char sexo){

        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fechaNac = fechaNac;
        this.sexo = sexo;

    }

    /**
     * Getter de los nombres de la persona.
     * @return nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Setter de los nombres de la persona.
     * @param nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Getter del apellido paterno de la persona.
     * @return Apellido paterno.
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * Setter del apellido paterno de persona.
     * @param apellidoP
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * Getter del apellido materno de persona
     * @return apellido materno
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * Setter del apellido materno de persona.
     * @param apellidoM
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * Entrega la fecha de nacimiento de la persona.
     * @return fecha de nacimiento.
     */
    public LocalDate getFechaNac() {
        return fechaNac;
    }


    /**
     * Recibe y guarda la fecha de nacimiento de la persona.
     * @param fechaNac
     */
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * Recibe el día, el mes y el año de nacimiento de la persona
     * y estos son guardados.
     * @param dia
     * @param mes
     * @param anio
     */
    public void setFechaNac(int dia, int mes, int anio){
        LocalDate fecha = LocalDate.of(anio,mes,dia);

        this.fechaNac = fecha;
    }

    /**
     * Getter del sexo de la persona.
     * @return sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * Guarda el sexo de la persona.
     * @param sexo
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    /**
     * Calcula la edad de la persona.
     * @return edad
     */
    public long getEdad(){

        long edad = 0;
        edad = ChronoUnit.YEARS.between(this.fechaNac,LocalDate.now());

        return edad;

    }
}
