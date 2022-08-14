package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.dao.ComprasDao;
import model.dao.LiderDao;
import model.dao.ProyectosDao;
import util.JDBCUtilities;

public class Controller {

    private JDBCUtilities jdbc;

    public Controller(JDBCUtilities jdbc) {
        this.jdbc = jdbc;

    }
    
    public ResultSet getLider(){
        return LiderDao.getLider(jdbc.getConnection());
    }

    public ResultSet getProyecto(){
        return ProyectosDao.getProyecto(jdbc.getConnection());
    }

    public ResultSet getCompra(){
        return ComprasDao.getCompras(jdbc.getConnection());
    }
}
