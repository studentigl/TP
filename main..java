package igl;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int A;
       /*Lecture de la taille du vecteur*/ 
       System.out.println("enter the size of the vector");
       Scanner s=new Scanner(System.in);
       int size=s.nextInt();
       /*Création d'un objet de la classe vectorHelper*/
       VectorHelper objet=new VectorHelper();
       /*Initialisation du vecteur*/
       int []vector=objet.CreatVetor(size);
       /*Afficher le vecteur*/
       System.out.println("here is the vector");
       objet.showVector(vector);
       
       /*Le menu qui contient les opération que l'utilisateur peut effectuer*/
       
       System.out.println("choose the operation you want to apply to the vector \n "
               + "1 for a sorting in a descending order \n 2 for a sorting in ascending order "
               + "\n 3 to Add two vectors \n 4 to inverse the vector \n 5 to show the MinMax element \n"
               + " 6 to test parity of elements. ");
       Scanner sa=new Scanner(System.in);
       A=sa.nextInt();

       switch (A){
               /*1:trier le vecteur d'une façon decsendante*/
               case 1:objet.decSortVector(vector);
                     
                /* 2:trier le vecteur d'une façon croissante*/   
               case 2:objet.CrSortVector(vector);
                   
                   /*Sommer deux vecteur*/
               case 3:{
                   System.out.println("enter the size of the second vector");
                   Scanner s2=new Scanner(System.in);
                   int size1=s2.nextInt();
                   int [] vector1=new int[size1];
              
           
                   }
               break;
                   /*4:inverser le vecteur*/
               case 4:objet.reverseVector(vector);
                   
                   /*5:Afficher le min et le max*/
               case 5:objet.minMaxVector(vector);
                  
                   /*6:Tester la paeité des éléments*/
               case 6:objet.parityVector(vector);
                   
                          
       }
               
           
       }
    }