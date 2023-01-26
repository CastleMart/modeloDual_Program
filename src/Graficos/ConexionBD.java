package Graficos;
import ModeloDual.Actividad;

import javax.swing.*;
import java.sql.*;



public class ConexionBD {

    public static final String URL = "jdbc:mysql://localhost:3306/modelodual_db";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public ConexionBD(){
        getConnection();
    }




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


    public void insertarActividad(Actividad nuevaActividad, int tema){
        Connection con = null;
        PreparedStatement ps ;


        try{
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO `modelodual_db`.`actividad` " +
                    "(`idActividad`," +
                    "`nombreAct`," +
                    "`Horas`," +
                    "`descripcion`," +
                    "`idTema`) " +
                    "VALUES" +
                    "(?,?,?,?,?);");

            ps.setInt(1, nuevaActividad.getId());
            ps.setString(2, nuevaActividad.getNombre());
            ps.setDouble(3,nuevaActividad.getHoras());
            ps.setString(4,nuevaActividad.getDescripcion());
            ps.setInt(5, tema);

            int res = ps.executeUpdate();

            if(res > 0)
                JOptionPane.showMessageDialog(null, "Persona guardada.");
            else
                JOptionPane.showMessageDialog(null, "No se pudo guardar.");


        }catch (Exception e){

            System.out.println(e);

        }
    }

}
