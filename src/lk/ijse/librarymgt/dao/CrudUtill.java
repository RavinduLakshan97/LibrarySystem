
package lk.ijse.librarymgt.dao;

import lk.ijse.librarymgt.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CrudUtill {
    private static PreparedStatement getPreparedSatement(String sql,Object...data)throws ClassNotFoundException,SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=connection.prepareStatement(sql);
        
        for (int i = 0; i < data.length; i++) {
            pstm.setObject(i + 1, data[i]);
        }
        return pstm;
    }
    public static boolean executeUpdate(String sql,Object...data)throws ClassNotFoundException,SQLException{
        return getPreparedSatement(sql, data).executeUpdate() > 0;
        
    }
    public static ResultSet executeQuery(String sql, Object...data)throws ClassNotFoundException,SQLException{
        return getPreparedSatement(sql, data).executeQuery();
        
    }
    
    
}
