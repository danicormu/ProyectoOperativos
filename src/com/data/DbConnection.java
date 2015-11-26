

package com.data;


import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnection {
    public static Connection getCon(){
            
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String server = "jdbc:mysql://localhost/rockoladb";
            String dbUser="root";
            String password="corrales";
            con= DriverManager.getConnection(server,dbUser,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Conecte con exito");
        return con;
    }
    
 
}
