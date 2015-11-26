/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockolaso;

import com.data.DbConnection;
import com.data.TrackData;
import com.data.UserData;
import com.domain.User;
import java.sql.SQLException;

/**
 *
 * @author Danicormu
 */
public class RockolaSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        DbConnection con = new DbConnection();
        con.getCon();
        UserData data = new UserData();
        User user = new User(1, "mairon");
        //if(data.addUser(user))
          //  System.out.println("lo hice");
        //System.out.println(data.selectUserId("efdgfd"));
        TrackData tdata= new TrackData();
        
        for(int i =0; i<4; i++)
            System.out.println(tdata.selectPlayList("efdgfd").remove(i).getName());
    }
    
}
