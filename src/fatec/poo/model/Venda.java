
package fatec.poo.model;

public class Venda {
    private int codigo;
    private String descricao;
    private double precUnit;
    private int qtdeVendida;

    public Venda(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setPrecUnit(double precUnit) {
        this.precUnit = precUnit;
    }

    public void setQtdeVendida(int qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecUnit() {
        return precUnit;
    }

    public int getQtdeVendida() {
        return qtdeVendida;
    }
    
    public double calcValorPagar(){
        return precUnit * qtdeVendida;
    }
}
