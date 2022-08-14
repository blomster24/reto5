
package controller;

import util.JDBCUtilities;
import view.MenuJframe;


public class MainController {
    public MainController(){
        // Construir conexion DB
        JDBCUtilities jdbc = new JDBCUtilities();
        
        // Construir Controller
        Controller controller = new Controller(jdbc);
        
        MenuJframe mJframe= new MenuJframe(controller);
    }
}
