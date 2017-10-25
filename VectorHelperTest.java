package igl;

import org.junit.Test;

public class VectorHelperTest {
    
 
    public VectorHelperTest() {
    }
 
    /**
     * Test of decSortVector method, of class VectorHelper.*/
   
    @Test
    public void testdecSortVector() {
        System.out.println("decSortVector");
        int[] vector = {1,8,3,4};
        VectorHelper instance = new VectorHelper();
        int[] expResult = {8,4,3,1};
        int[] result = instance.decSortVector(vector);
        assertArrayEquals(expResult, result);
        
    }
    /**
     * Test of CrSortVector method, of class VectorHelper.
     */
      @Test
    public void testCrSortVector() {
        System.out.println("CrSortVector");
        int[] vector = {1,8,3,4};
        VectorHelper instance = new VectorHelper();
        int[] expResult = {1,3,4,8};
        int[] result = instance.CrSortVector(vector);
        assertArrayEquals(expResult, result);
        
    }
    /**
     * Test of minMaxVector method, of class VectorHelper.
     */
    @Test
    public void testMinMaxVector() {
        System.out.println("minMaxVector");
        int[] vector = {1,8,3,4};
        VectorHelper instance = new VectorHelper();
        int[]expResult= {1,8};
        int []result=instance.minMaxVector(vector);
        assertArrayEquals(expResult,result);
        
    }
    
    @Test
    public void testReverseVector() {
        System.out.println("reverseVector");
        int[] vector = {1,2,3};
        int[] expresult={3,2,1};
        VectorHelper instance = new VectorHelper();
        int[] result=instance.reverseVector(vector);
       assertArrayEquals(expresult,result);
    }
     /**
     * Test of AddVector method, of class VectorHelper.
     * @throws java.lang.Exception
     */
    @Test
    public void testAddVector() throws Exception {
        System.out.println("AddVector");
        int[] T = {1,2,3};
        int []T2 = {4,5,6};
        VectorHelper instance = new VectorHelper();
        int[] expResult = {5,7,9};
        int[] result = instance.AddVector(T, T2);
        assertArrayEquals(expResult, result);
        
    }
     
     /**
     * Test of parityVector method, of class VectorHelper.
     */
       @Test
    public void testParityVector() {
        System.out.println("parityVector");
         int[] vector = {1,2,3};
        VectorHelper instance = new VectorHelper();
        String[] expResult = {"impair","pair","impair"};
        String[] result = instance.parityVector(vector);
        assertArrayEquals(expResult, result);
       
    }
   
   
    
}
