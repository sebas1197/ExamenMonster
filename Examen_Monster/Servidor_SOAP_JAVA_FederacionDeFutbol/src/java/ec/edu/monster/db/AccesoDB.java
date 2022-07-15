/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SebastianLG
 */
public class AccesoDB {
    
    public static Connection getConecction() throws SQLException
    {
        Connection cn = null;
        try{
            //Datos MySQL
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/federacionfutboldb";
            String user = "root";
            String pass = "12345678";
            //Cargar Driver a Memoria
            Class.forName(driver).newInstance();
            //Obtener el objeto Conecction
            cn = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            throw e;
        }catch (ClassNotFoundException e) {
            throw new SQLException("EEROR, no se encuentra el driver" + e);
        } catch (Exception e) {
            throw new SQLException("EEROR, no tiene acceso al servidor");
        }
        return cn;
    }
    
}
