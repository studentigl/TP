
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
    
    /*-------------------------------------------------------------------------------------------------------*/
    /*la fonction "showVector" a comme parametre un vecteur a afficher*/
    /*-------------------------------------------------------------------------------------------------------*/
    
    public void showVector(int vector[]){
         /*L'ecriture des elements du vecteur*/
         for (int j=0;j<vector.length;j++){
               System.out.println("|"+vector[j] +"|");
         }
    
    }
    