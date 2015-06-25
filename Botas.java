package penny;

public class Botas extends Sapatos {
    
    private String tipo_solado;
    private String altura_cano;

    public String getTipo_solado() {
        return tipo_solado;
    }

    public void setTipo_solado(String tipo_solado) {
        this.tipo_solado = tipo_solado;
    }

    public String getAltura_cano() {
        return altura_cano;
    }

    public void setAltura_cano(String altura_cano) {
        this.altura_cano = altura_cano;
    }

    public Botas()
    {
        this.tipo_solado = null;
        this.altura_cano = null;
    }
    
    public String resumo_salto ()
    {
        return super.resumo_sapato() + "\nTipo de Solado: " + tipo_solado + "\nAltura do Cano: " + altura_cano;
    }
    
}
