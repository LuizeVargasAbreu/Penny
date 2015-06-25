package penny;

public class Sapatos {

    private String cor;
    private String numeraçao;
    private String modelo;
    private Boolean preferido;

 
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeraçao() {
        return numeraçao;
    }

    public void setNumeraçao(String numeraçao) {
        this.numeraçao = numeraçao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean isPreferido() {
        return preferido;
    }

    public void setPreferido(Boolean preferido) {
        this.preferido = preferido;
    }

    public Sapatos()
    {
        this.cor = null;
        this.numeraçao = null;
        this.modelo = null;
        this.preferido = false;
    }
    
    public String resumo_sapato () {
        return "Modelo: " + modelo + "\nCor: " + cor + "\nNumeração: " + numeraçao;
    }
}
