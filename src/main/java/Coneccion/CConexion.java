/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo
 */
public class CConexion {
    
    Connection conectar = null;
    
    String usuario ="Juan";
    String password ="123";
    String bd ="Pruebas_tokio";
    String ip = "localhost";
    String puerto ="1433";
    
    public  Connection establecerConexion(){
        
        try{
            String cadena ="jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+bd;
            conectar= DriverManager.getConnection(cadena, usuario, password);
            //JOptionPane.showMessageDialog(null, "Coneccion Hecha");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar base de datos:" + 
                    e.toString());
        }
        return conectar;
    }
}
