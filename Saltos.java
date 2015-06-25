package penny;

public class Saltos extends Sapatos {

 private String tamanho_salto;

    public String getTamanho_salto() {
        return tamanho_salto;
    }

    public void setTamanho_salto(String tamanho_salto) {
        this.tamanho_salto = tamanho_salto;
    }

    public Saltos()
    {
        this.tamanho_salto = null;
    }
 
 public String resumo_sapato ()
 {
     return super.resumo_sapato() + "\nTamanho Salto: " + tamanho_salto;
 }
}
