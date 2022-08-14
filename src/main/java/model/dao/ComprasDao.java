
package model.dao;

import java.sql.*;

public class ComprasDao {
    public static ResultSet getCompras(Connection conn) {
        ResultSet result = null;

        try {
            String query="SELECT c.ID_Compra, p.Constructora ,p.Banco_Vinculado  FROM Compra c INNER JOIN Proyecto p ON c.ID_Proyecto =p.ID_Proyecto WHERE c.Proveedor ='Homecenter' AND p.Ciudad ='Salento'";
            Statement pst = conn.createStatement();
            result = pst.executeQuery(query);
            
            
        } catch (SQLException e) {
            e.printStackTrace();
                    
        }

        return result;
    }
}
