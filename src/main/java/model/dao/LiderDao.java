package model.dao;

import java.sql.*;

public class LiderDao {

    
    
    public static ResultSet getLider(Connection conn) {
        ResultSet result = null;

        try {
            String query = "SELECT l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Segundo_Apellido, l.Ciudad_Residencia FROM Lider l ORDER BY l.Ciudad_Residencia ";
            Statement pst = conn.createStatement();
            result = pst.executeQuery(query);
            
            
        } catch (SQLException e) {
            e.printStackTrace();
                    
        }

        return result;
    }
}
