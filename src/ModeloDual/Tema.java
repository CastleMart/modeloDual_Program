package ModeloDual;

public class Tema extends Actividad{

    private int actividades[];

    public Tema (int id, String nombre, int horas, int calificacion, String descripcion){

        super(id, nombre, horas, calificacion, descripcion);
    }


    public int[] getActividades() {
        return actividades;
    }

    public void setActividades(int[] actividades) {
        this.actividades = actividades;
    }


    public double horasTotales(){
        return 0.0;
    }

    private void promediar(){

    }
}
