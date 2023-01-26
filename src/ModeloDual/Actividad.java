package ModeloDual;

public class Actividad {

    //Atributos de la clase actividad.
    private int id;
    private String nombre, descripcion;
    private double horas, calificacion;

    /**
     * Constructor de la clase que almacena calificaciones.
     * @param id
     * @param nombre
     * @param horas
     * @param calificacion
     * @param descripcion
     */
    public Actividad (int id, String nombre, double horas, double calificacion, String descripcion){
        this.nombre = nombre;
        this.id = id;
        this.horas = horas;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
    }

    /**
     * Contructor de la clase por defecto.
     * @param id
     * @param nombre
     * @param horas
     * @param descripcion
     */
    public Actividad (int id, String nombre, double horas, String descripcion){
        this.nombre = nombre;
        this.id = id;
        this.horas = horas;
        this.descripcion = descripcion;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
