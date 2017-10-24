
package igl;

/**
   * <b> SommeException permet de lancer des Exception  </b>
   * @author  Ould Ali Ahlem et Legat Asmaa
   */ 
public class SommeException extends Exception{
    
     /**
   * cette methode permet d'afficher le message lors du 
   * lancement d'une Exception de type SommeException 
   * dans le cas ou les deux vecteurs ayant des tailles differentes
   */

    public SommeException() {
    
    System.out.println("the two vectors must have the same length");
    }
    
    
}
