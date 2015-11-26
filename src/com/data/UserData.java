

package com.data;

import com.domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UserData {
    DbConnection con = new DbConnection();
    
    public boolean addUser(User user) throws SQLException{
        boolean flag = false;
        Connection dbCon= null;
        String query ="insert into rockoladb.usuario (nombreUsuario) values (?);";
        try {
            dbCon = con.getCon();
            PreparedStatement stm = dbCon.prepareStatement(query);
            stm.setString(1, user.getName());
            stm.executeUpdate();
            flag = true;
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(dbCon != null)
                dbCon.close();
        }
        return flag;
    }
    
    public int selectUserId(String name) throws SQLException{
        int id =0;
        Connection dbCon= null;
        String query = "select idUsuario from rockoladb.usuario where nombreUsuario ='"+name+"';";
        try {
            dbCon = con.getCon();
            Statement stat = dbCon.prepareStatement(query);
            ResultSet rst = stat.executeQuery(query);
            rst.next();
            id = rst.getInt("idUsuario");
            rst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(dbCon != null)
                dbCon.close();
        }
        return id;
    }
}
