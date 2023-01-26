package Graficos;
import ModeloDual.Actividad;

import javax.swing.*;
import java.sql.*;



public class ConexionBD {

    //Guardando en constrantes la información para iniciar sesión en MySql.
    public static final String URL = "jdbc:mysql://localhost:3306/modelodual_db";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    /**
     * Constructor de la clase conexión.
     */
    public ConexionBD(){
        getConnection();
    }


    /**
     * Método que realiza la conexión de la base de datos.
     * @return
     */
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch (Exception e){
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(null,"Conexión exitosa");
        return con;
    }


    /**
     * Método que inserta un valor nuevo en la tabla Actividades de la base de datos.
     * @param nuevaActividad
     * @param tema
     */
    public void insertarActividad(Actividad nuevaActividad, int tema){
        Connection con = null;
        PreparedStatement ps ;


        try{
            con = getConnection();
            //Guardando la sentencia SQL.
            ps = con.prepareStatement("INSERT INTO `modelodual_db`.`actividad` " +
                    "(`idActividad`," +
                    "`nombreAct`," +
                    "`Horas`," +
                    "`descripcion`," +
                    "`idTema`) " +
                    "VALUES" +
                    "(?,?,?,?,?);");

            //Insertando valores a la variable de preparación.
            ps.setInt(1, nuevaActividad.getId());
            ps.setString(2, nuevaActividad.getNombre());
            ps.setDouble(3,nuevaActividad.getHoras());
            ps.setString(4,nuevaActividad.getDescripcion());
            ps.setInt(5, tema);

            //Ejecución de la sentencia.
            int res = ps.executeUpdate();

            //Comprobación de la sentencia que se haya realizado correctamente.
            if(res > 0)
                JOptionPane.showMessageDialog(null, "Persona guardada.");
            else
                JOptionPane.showMessageDialog(null, "No se pudo guardar.");


        }catch (Exception e){

            System.out.println(e);

        }
    }

}
