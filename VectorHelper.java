
package igl;
import java.util.Scanner;

public class VectorHelper {
    int []vector;
    int i;
    
    public int[] CreatVetor(int size){
       int j;
      
       vector=new int[size];
       for (j=0;j<size;j++)
       {
           System.out.println("enter element " +j+" of the vector");
           Scanner e=new Scanner(System.in);
           int element=e.nextInt();
           vector[j]=element;
           
       }
       return(vector);
    }
    
    public void showVector(int vector[]){
         
         for (int j=0;j<vector.length;j++)
         {System.out.println("|"+vector[j] +"|");}
    
    }
    
    public int[] decSortVector(int vector[]){
     int x;
     for (int j=0;j<vector.length;j++){
         for (int n=j+1;n<vector.length;n++){
             if (vector[j] <vector[n]){
                             x=vector[j];
                             vector[j]=vector[n];
                             vector[n]=x;
                             
                               }
     }
        
     }
        showVector(vector);
    return(vector);
    }
    
    public int[] CrSortVector(int vector[]){
     
     int x;
     for (int j=0;j<vector.length;j++){
         for (int n=j+1;n<vector.length;n++){
     if (vector[j]>vector[n]){
                             x=vector[j];
                             vector[j]=vector[n];
                             vector[n]=x;
                             
                               }}
     }
     showVector(vector);
    return(vector);
    }
    
 public void inverseVector(int vector[]) 
 {int []v=new int [vector.length];
      int j=0;
     for (int i=vector.length-1;i>=0;i--)      
      {  v[j] =vector[i];
         j++;}
     showVector(v);
 }
 public void minMaxVector(int vector[])
 { int min,max,i,j;
 min=vector[0];
 max=vector[0];
 for(i=0;i<vector.length;i++)
 {for (j=i;j<vector.length;j++)
     {
      if (min>vector[j])
      {min=vector[j];}
      if(max<vector[j])
      {max=vector[j];}
     }
 }
 System.out.println("max is "+max +"and min is "+min);
 }
 
 public int[] AddVector(int T[],int size1) throws SommeException{
     int taille1=T.length;
     
    if (taille1 != size1){
        throw new SommeException(); 
    }
    else{
        System.out.println("Enter the second Vector");
        int V[]=CreatVetor(size1);
        for (int i=0;i<taille1;i++){
            T[i]=T[i]+V[i];
        }
        showVector(T);
    }
 return T;
 
 }
 
 public String [] parityVector(int T[]){
     String V[]=new String[T.length];
     for(int i=0;i<T.length;i++){
         if(T[i]%2==0){
             V[i]="paire";
         }
         else{
             V[i]="impaire";
         }
         System.out.println(V[i]);
     }
     
 return V;
 }
}
