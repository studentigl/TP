

package igl;
/*creer une classe SommeException qui genere des Exceptions*/
public class SommeException extends Exception{

    public SommeException() {
        /*le message affiché lors d'une exception*/
    System.out.println("the two vectors must have the same length");
    }
    
    
}
