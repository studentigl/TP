
package igl;
import java.util.Scanner;

/*la classe VectorHelper contient des methodes qui font des operations sur les vecteurs.*/

public class VectorHelper {
    int []vector;
    int i;
/*--------------------------------------------------------------------------------------*/
                   /*la fonction "CreatVector"qui a comme parametre 
                      la taille du vecteur à créer et le retourne */
/*--------------------------------------------------------------------------------------*/
    
    public int[] CreatVetor(int size){
       int j;
      //l'initialisation du vecteur crée//
       vector=new int[size]; 
      //remplir les elements du tableau//
       for (j=0;j<size;j++) 
       {
           System.out.println("enter element " +j+" of the vector");
           Scanner e=new Scanner(System.in);
           int element=e.nextInt();
           vector[j]=element;
       }
       //le retour du vecteur crée//
       return(vector);
    }
    
/*--------------------------------------------------------------------------------------*/
        /*la fonction "ShowVector" a comme paremetre un vecteur à afficher  */
/*--------------------------------------------------------------------------------------*/
    public void showVector(int vector[]){
        /*Ecriture des elements du Vecteur*/
        for (int j=0;j<vector.length;j++){
            System.out.println("|"+vector[j] +"|");
         }
    }
        
/*--------------------------------------------------------------------------------------*/
                             /*la fonction "decSortVector" 
         a comme parametre un vecteur à trier d'une façon descendante*/
/*--------------------------------------------------------------------------------------*/

    public int[] decSortVector(int vector[]){
     //une variable intermidiaire //
     int x;
     /*deux boucles imbriquées pour parcourir 
     et comparer simultanement deux elements d'un vecteur*/
    
     for (int j=0;j<vector.length;j++){
         for (int n=j+1;n<vector.length;n++){
          /*comparer le premier elments avec les
             autres elements qui le suivent*/
             if (vector[j] <vector[n]){
                             
                            /* Si la condition est vérifiée 
                             faire une permutaton des deux elements*/
                             x=vector[j];
                             vector[j]=vector[n];
                             vector[n]=x;                
                               }
         }
     }
        showVector(vector);/*Afficher le Vecteur trié*/
    return(vector);
    }
    
/*--------------------------------------------------------------------------------------*/
                             /*la fonction "CcSortVector" 
         a comme parametre un vecteur à trier d'une façon croissante*/
/*--------------------------------------------------------------------------------------*/
    
    public int[] CrSortVector(int vector[]){
     //une variable intermidiaire //
     int x;
     /*deux boucles imbriquées pour parcourir 
     et comparer simultanement deux elements d'un vecteur*/
     
     for (int j=0;j<vector.length;j++){
         for (int n=j+1;n<vector.length;n++){
             /*comparer le premier elments avec les
             autres elements qui le suivent*/
             if (vector[j]>vector[n]){
                          
                             /* Si la condition est vérifiée 
                             faire une permutaton des deux elements*/
                             x=vector[j];
                             vector[j]=vector[n];
                             vector[n]=x;
                             
                               }}
     }
     showVector(vector);/*Afficher le Vecteur trié*/
    return(vector);
    }
 
/*--------------------------------------------------------------------------------------*/
    
    /*la fonction "reverseVector"à comme parametre un vecteur à afficher son inverse */
    
/*--------------------------------------------------------------------------------------*/ 
 
    public void reverseVector(int vector[]){
       /*créer un vecteur de la meme taille du vecteur 
        en entrée qui va recevoir ces elements eninversés*/
        
        int []v=new int [vector.length];
        int j=0;
        /*une boucle qui parccours 
        le vecteur du dernier element jsq premier element*/
     for (int i=vector.length-1;i>=0;i--){      
        v[j] =vector[i];
         j++;}
     showVector(v);/*afficher le vecteur inversé*/
 }
    
/*--------------------------------------------------------------------------------------*/
                     /*la fonction"minMaxVector" permet 
            d'afficher le min et le max d'un vecteur simultanement */
/*--------------------------------------------------------------------------------------*/
    public void minMaxVector(int vector[]){
      
        int min,max,i,j;
        /*Initialisation du Min et de Max*/
        min=vector[0];
        max=vector[0];
         /*boucle imbriquée pour parcourir le vecteur*/
       for(i=0;i<vector.length;i++){
         for (j=i;j<vector.length;j++){
          /*comparaison de la valeur du Min avec les elements du vecteur */
           if (min>vector[j])
               /*permutation si l'element de la case est inferieur à Min*/
             {min=vector[j];}
            /*comparaison de la valeur du Max avec les elements du vecteur */
           if(max<vector[j])
               /*permutation si l'element de la case est superieur à Max*/
             {max=vector[j];}
                                      }
                                    }
       /*Afficher le min et le max*/
        System.out.println("max is "+max +"and min is "+min);
 }

/*--------------------------------------------------------------------------------------*/
    
         /*la fonction "AddVector" permet d'addionner les elements de deux vecteurs*/
    
/*--------------------------------------------------------------------------------------*/
    public int[] AddVector(int T[],int size1) throws SommeException{
        /*propager l'Exception pour la traiter au niveau du Main */
     
        int taille1=T.length;
        /*la comparaison des tailles des deux vecteurs*/
        if (taille1 != size1){
        /*lancer une Exception si les deux tailles sont differentes*/ 
        throw new SommeException();
    } 
        /*sommer les elements si y a pas une differance entre les deux taille*/
    else{
        System.out.println("Enter the second Vector");
        int V[]=CreatVetor(size1);
        for (int i=0;i<taille1;i++){
            T[i]=T[i]+V[i];
        }
        //Afficher la soome des deux vecteurs//
        showVector(T);
    }
 return T;
 
 }
 
 /*--------------------------------------------------------------------------------------*/
    
                         /*la fonction "parityVector" 
            permet de nous indiquer la parité des elements d"un vecteur*/
    
/*--------------------------------------------------------------------------------------*/
    
 public String [] parityVector(int T[]){
    /*creation d'un vecteur de type String de meme taille du vecteur en entrée */
     String V[]=new String[T.length];
     for(int i=0;i<T.length;i++){
         /*ecrir Pair*/
         if(T[i]%2==0){ 
             V[i]="pair";
         }
         else{/*Ecrire Impair*/
             V[i]="impair";
         }
         /*Afficher un tableau de chaines de caracteres*/
         System.out.println(V[i]);
     }
     
 return V;
 }
}
