package util;

import java.sql.*;

public class JDBCUtilities {

    private static final String UBICACION_BD = "ProyectosConstruccion.db";

    public static Connection getConnection() {
        Connection conexion = null;
        try {
            String url = "jdbc:sqlite:" + UBICACION_BD;
            conexion = DriverManager.getConnection(url);
            return conexion;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }
}
