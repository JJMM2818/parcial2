
package controller;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class Mysql {
    
    Connection con = null;
    static final String url ="jdbc:mysql://localhost:3306/comida";
    static final String user = "root";
    static final String pass = "";
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion aceptada");
            
        }catch(Exception e){
            System.out.println("Error: "+e);
            JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }
        return con;
    }
    
}
