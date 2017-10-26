
package igl;
import java.util.Scanner;


/**
 *<b> la classe VectorHelper contient des methodes qui font des operations sur les vecteurs</b>

 */

public class VectorHelper {
 /**
* <ul>
* <li>Un Vecteur des entiers qui va etre utiliser dans les differentes methodes </li>
* </ul>
  */
    public int []vector;
 /**
  * <ul>
* <li>Une valeur entiere qui va etre utiliser dans les differentes methodes comme compteur des boucles </li>
* </ul>
  */
    
    public int i;
/**
  * <ul>
* <li> le constructeur de la classe VectorHelper qui va etre utiliser dans le programme principal MAIN   </li>
* </ul>
* 
  */    
    public VectorHelper(){
        
    }
    /**
     *la fonction "CreatVector" permet de creer un Vecteur des entiers
     * @param size represente la taille du vecteur qu'on veut créer
     * @return retourner le vecteur crée.
     */

    /*--------------------------------------------------------------------------------------*/
                   /*la fonction "CreatVector"qui a comme parametre 
                      la taille du vecteur à créer et le retourne */
/*--------------------------------------------------------------------------------------*/
    
public int[] CreatVetor(int size){
       int j;
       /*Initialisation du vecteur*/
       if(size>0){
       vector=new int[size];
       /*Boucle pour remplir le  vecteur */
       for (j=0;j<size;j++){
               System.out.println("enter element " +j+" of the vector");
               Scanner e=new Scanner(System.in);
               int element=e.nextInt();
               vector[j]=element;  
         }}
       /*Le retour du vecteur crée*/
       return(vector);
       
    }
    
    /**
     *la fonction "ShowVector" permet d'afficher un Vecteur
     * @param vector c'est le vecteur qu'on veut afficher ses elements.
     * 
     */
/*--------------------------------------------------------------------------------------*/
        /*la fonction "ShowVector" a comme paremetre un vecteur à afficher  */
/*--------------------------------------------------------------------------------------*/
    public void showVector(int vector[]){
        /*Ecriture des elements du Vecteur*/
        for (int j=0;j<vector.length;j++){
            System.out.println("|"+vector[j] +"|");
         }
    }
        /**
         *la fonction "decSortVector" permet de trier un vecteur d'une façon descendante et l'afficher
         * @param vector c'est le vecteur qu'on veut trier
         * @return retourne le vecteur trié de la plus grande valeur vers la plus petite.
         */
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
    
    /**
         *la fonction "CrSortVector" permet de trier un vecteur d'une façon croissante et l'afficher
         * @param vector le vecteur qu'on veut trier
         * @return retourne le vecteur trié de la plus petite valeur vers la plus grande.
         */
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
 
    /**
         *la fonction "reverseVector" permet d'inverser et afficher un vecteur 
         * @param vector le vecteur qu'on veut inverser. 
         */
/*--------------------------------------------------------------------------------------*/
    
    /*la fonction "reverseVector"à comme parametre un vecteur à afficher son inverse */
    
/*--------------------------------------------------------------------------------------*/ 
 
    /**
     * la fonction "reverseVector" permet d'inverser et afficher un vecteur
     * @param vector le vecteur qu'on veut inverser.
     * @return retourne le vecteur inversé
     */
    public int[] reverseVector(int vector[]) {
     /*créer un nouveau vecteur de la memme taille du vecteur en entrée qui va reçevoir
     ces elements inversés*/
    int []v=new int [vector.length];
    int j=0;
    /*Une boucle pour parcourir le vecteur commençant du dernier element jusq'au 1er element*/
    for (int i=vector.length-1;i>=0;i--) {     
         v[j] =vector[i];
         j++;
    }
    /*Afficher le vecteur inversé*/
    return(v);
 }
    
    /**
     *la fonction"minMaxVector" permet 
     *d'afficher le min et le max d'un vecteur simultanement
     *@param vector le vecteur dont lequel on va afficher son MAX et MIN 
     * @return  rrtourne un vecteur de deux elements qui contients le min et le max
     * 
     */
/*--------------------------------------------------------------------------------------*/
                     /*la fonction"minMaxVector" permet 
            d'afficher le min et le max d'un vecteur simultanement */
/*--------------------------------------------------------------------------------------*/
    public int[] minMaxVector(int vector[]){
         int [] vector1=new int[2];
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
       vector1[0]=min;
       vector1[1]=max;
       /*Afficher le min et le max*/
        System.out.println("max is "+max +"and min is "+min);
       return vector1;
 }

    /**
     *la fonction "AddVector" permet d'addionner les elements de deux vecteurs et lancer 
     * une Exception s'il y a une anomalie des deux tailles
     * 
     * @param T2
     * @throws SommeException Si jamais la taille des deux vecteurs est differente.
     * @param T le premier Vecteur.
     * @param T2 le deuxieme Vecteur.
     * @return retourner la somme des deux vecteurs s'il n'existe aucune anomalie de taille.
     *
     */
/*--------------------------------------------------------------------------------------*/
    
         /*la fonction "AddVector" permet d'addionner les elements de deux vecteurs*/
    
/*--------------------------------------------------------------------------------------*/
    public int[] AddVector(int T[],int T2[]) throws SommeException{
     /*Propager l'exception pour la traiter au niveau du main*/
     int taille1=T.length; 
     int size2=T2.length;
     /*comparaison des tailles des deux vecteurs*/
     if (taille1 != size2){
         /*Lancer une exception si les deux tailles sont différentes*/
          throw new SommeException(); 
     }
     else{/*sommer les elements si les deux tailles sont égaux*/
        
        
        for (int i=0;i<taille1;i++){
              T[i] += T2[i];
        }
        /*Afficher la somme des deux vecteurs*/
        showVector(T);
     }
     return T;
 }
 /**
  *la fonction "parityVector" 
  *permet de nous indiquer la parité des elements d"un vecteur
  * @param T le vecteur en entrée qu'on veulent savoir la parité de ses valeurs.
  * 
  * @return retourne un vecteur de chaine de caratere  
  * PAIR pour les nombres pairs et IMPAIR pour les nombres impairs
  * 
  */
    
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
