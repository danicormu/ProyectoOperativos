/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockolaso;

import GUI.frmLogin;
import com.data.DbConnection;
import com.data.TrackData;
import com.data.UserData;
import com.domain.Track;
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
        frmLogin fr = new frmLogin();
        fr.setVisible(true);
    }
    
}
