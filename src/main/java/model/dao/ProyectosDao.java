package model.dao;

import java.sql.*;

// informe 2
public class ProyectosDao {
    

    public static ResultSet getProyecto(Connection conn) {
        ResultSet result = null;

        try {
            String query="SELECT p.ID_Proyecto, p.Constructora ,p.Numero_Habitaciones ,p.Ciudad FROM Proyecto p WHERE p.Clasificacion = 'Casa Campestre' AND p.Ciudad ='Santa Marta' OR p.Ciudad ='Cartagena' OR p.Ciudad ='Barranquilla'";
            Statement pst = conn.createStatement();
            result = pst.executeQuery(query);
            
            
        } catch (SQLException e) {
            e.printStackTrace();
                    
        }

        return result;
    }
}
