package com.data;

import com.domain.Track;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TrackData {

    DbConnection con = new DbConnection();
    UserData data = new UserData();
    
    public ArrayList<Track> selectPlayList(String name) throws SQLException{    
       ArrayList<Track> list = new ArrayList<Track>();
       Connection dbConn = null;
       int id = data.selectUserId(name);
       String query = "select * from rockoladb.playlist where usuario_idUsuario = '"+id+"'";
        try {
            dbConn = con.getCon();
            Statement stat = dbConn.prepareStatement(query);
            ResultSet rst = stat.executeQuery(query);
            while(rst.next()){
                Track track = new Track(rst.getInt(1),rst.getString(2));
                list.add(track);
            }
            rst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(dbConn != null)
                dbConn.close();
        }
       return list; 
    }
    
    public boolean addSongToPlayList(Track track) throws SQLException{
        boolean flag = false;
        Connection dbConn = null;
        String query = "insert into rockoladb.playlist (name,usuario_idUsuario) values (?,?);";
        try {
            dbConn = con.getCon();
            PreparedStatement stm = dbConn.prepareStatement(query);
            stm.setString(1, track.getName());
            stm.setInt(2, track.getUserID());
            stm.executeUpdate();
            flag=true;
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(dbConn != null)
                dbConn.close();
        }
        return flag;
    }
}
