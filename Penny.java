
package penny;

public class Penny {

    public static void main(String[] args) {

        Prateleira p1 = new Prateleira ();
        p1.setLetra("A");
        
        Sapatos um = new Sapatos ();
        um.setModelo("Confort");
        Sapatos dois  = new Sapatos();
        dois.setModelo("Confort 2");
        
        p1.getSapatos().add(um);
        
        p1.getSapatos().add(dois);
      //  System.out.println(p1.mostrarTudo());
                
        
        
    }
    
}
