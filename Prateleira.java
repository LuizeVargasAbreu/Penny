package penny;
import java.util.List;
public class Prateleira extends Sapatos {

    private String letra;
    private List<Sapatos> sapato;
    
    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public List<Sapatos> getSapato() {
        return sapato;
    }

    public void setSapato(List<Sapatos> sapato) {
        this.sapato = sapato;
    }

    public Prateleira() {
        this.letra = null;
        this.sapato = null;
    }
    
    public String mostrarTudo ()
    {
        String a = "Prateleira " + letra + "\n";
        a = a + "Sapatos \n";
        
        for (Sapatos sapatos : sapato) {
           a = a + sapatos.resumo_sapato() + "\n";
        }
        return a;
    }
    
}
