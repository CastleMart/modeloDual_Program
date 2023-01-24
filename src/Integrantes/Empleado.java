package Integrantes;

import java.time.LocalDate;

public class Empleado extends Persona{

    private int noEmpleado;
    private String cargo;

    public Empleado(int noEmpleado, String nombres, String apellidoP, String apellidoM, LocalDate fechaNac, char sexo, String cargo){
        super(nombres, apellidoP, apellidoM, fechaNac, sexo);

        this.noEmpleado = noEmpleado;
        this.cargo = cargo;
    }

    public int getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
