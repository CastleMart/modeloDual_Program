package Graficos;
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

}
