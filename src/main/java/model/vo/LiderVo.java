package model.vo;

// Informe 1
public class LiderVo {

    private int idLider;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String ciudadResidencia;

    public LiderVo() {

    }

    public LiderVo(int idLider, String nombre, String primerApellido, String segundoApellido, String ciudadResidencia) {
        this.idLider = idLider;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.ciudadResidencia = ciudadResidencia;
    }

    public int getIdLider() {
        return idLider;
    }

    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    @Override
    public String toString() {
        return "ProyectosVo{" + "idLider=" + idLider + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", ciudadResidencia=" + ciudadResidencia + '}';
    }

}
