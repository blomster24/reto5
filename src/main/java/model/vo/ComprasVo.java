package model.vo;

// Informe 3
public class ComprasVo {

    private int idCompra;
    private String constructora;
    private String bancoVinculado;

    public ComprasVo() {

    }

    public ComprasVo(int idCompra, String constructora, String bancoVinculado) {
        this.idCompra = idCompra;
        this.constructora = constructora;
        this.bancoVinculado = bancoVinculado;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }

    @Override
    public String toString() {
        return "ComprasVo{" + "idCompra=" + idCompra + ", constructora=" + constructora + ", bancoVinculado=" + bancoVinculado + '}';
    }

}
