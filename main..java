package igl;

import java.util.Scanner;
import javax.print.DocFlavor;
/**
 * <b> la classe main represente le programme principal </b>
 *
 */
public class main {

    /**
     *la methode main qui permet d'utiliser les Fonctions et les methodes definies dans la classe VectorHelper
     * et traiter l'exception SommeException si jamais il y a une anomalie.
     * @param args non utilisé 
     */
   
 
    public static void main(String[] args) {

         int A;  
          
         /*Lecture de la taille du vecteur*/
          
       System.out.println("enter the size of the vector");
       Scanner s=new Scanner(System.in);
       int size=s.nextInt();
       
       /*la creation d'un objet de la classe VectorHelper*/
       VectorHelper objet=new VectorHelper();
       /*Initialissation du vecteur*/
       int []vector=objet.CreatVetor(size);
       
       System.out.println("here is the vector");
       /*Afficher le Vecteur crée*/
       objet.showVector(vector);
       
       /*Le menu qui contient les operations que l'utilisateur peut effectuer*/
    
        
       
       String repeat="Y";
       while(repeat.equals("Y")){
       System.out.println("choose the operation you want to apply to the vector \n "
               + "* 1 for a sorting in a descending order \n *2 for a sorting in ascending order "
               + "\n *3 to Add two vectors \n *4 to inverse the vector \n *5 to show the MinMax element \n"
               + " *6 to test parity of elements. ");
       
       Scanner sa=new Scanner(System.in);
       A=sa.nextInt();
       
       switch (A){
                    /*1:trier le vecteur d'une façon descendante*/
               case 1:objet.decSortVector(vector);
                     break;
                   /*2:trier le vecteur d'une façon croissante*/
               case 2:objet.CrSortVector(vector);
                   break;
                   /*3:sommer deux vecteurs*/
               case 3:{
                  System.out.println("enter the size of the second vector");
                   Scanner s2=new Scanner(System.in);
                   int size1=s2.nextInt();
                   System.out.println("enter elements of the second vector");
                    Scanner s3=new Scanner(System.in);
                   int[]T=new int[size1];
                   for(int i=0;i<T.length;i++)
                   {
                       T[i]=s3.nextInt();
                   }
                   /*instructions pouvant générer des exceptions*/
                   try{
                       objet.AddVector(vector,T);
                   }
                   /*Les instructions qui traitent l'exception*/
                   catch(SommeException E){
                       System.err.println( E);
                       
                   }
                   }
               break;
                   /*inverser un vecteur*/
                  
               case 4:objet.reverseVector(vector);
                   break;
                   /*afficher le min et le max d'un vecteur*/
               case 5:objet.minMaxVector(vector);
                   break;
               
               /*tester le parité des elements d'un vecteur*/
               case 6:objet.parityVector(vector);
                   break;
               
                   
                          
       }
              System.out.println("if you want to apply another function enter Y Else enter N ");
              Scanner s4=new Scanner(System.in);
              String Decission=s4.next();
              repeat=Decission;
       }
    }
}
