package view;

import javax.swing.table.DefaultTableModel;

public class TablaLideres extends DefaultTableModel {

    String[] titulos;
    Object[][] datos;

    public TablaLideres(Object[][] datos, String[] titulos) {
        super();
        this.titulos = titulos;
        this.datos = datos;
        setDataVector(datos, titulos);
    }
    
    public TablaLideres(){
        
    }
}
