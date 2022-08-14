
package view;

import controller.Controller;
import util.JDBCUtilities;


public class Test {
    
    private JDBCUtilities jdbc;
    
    public Test(){
        this.jdbc= new JDBCUtilities();
    }
    public void lideres(){
        Controller c = new Controller(jdbc);
        
    }
}
