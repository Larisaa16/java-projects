//Joc in care utilizatorul ghiceste nr de la 1 pana la 100
import java.util.Scanner;

public class GhicesteNumarul {

   public static void main(String[] args){
       ghicesteNumar();
   }
   
   public static void ghicesteNumar(){
       Scanner sc = new Scanner(System.in);
       
       int nr = 1+(int)(100*Math.random());
       int K=5;
       int i, guess;
       
       System.out.println("Ghiceste un numar de la 1 la 100. Ai doar 5 incercari.");
       
       for(i=0; i<K; i++){
           System.out.print("Ghiceste numarul: ");
           guess = sc.nextInt();
           
           if(nr==guess){
               System.out.println("Ai ghicit :D ");
               break;
           } else if(nr> guess && i!=K-1){
               System.out.println("Numarul e mai mare decat " + guess);
           } else if (nr<guess && i != K - 1){
               System.out.println("Numarul e mai mic decat " + guess);
           }
           
       }
       
       if(i==K){
           System.out.println("Ai epuizat cele " + K +" incercari");
           System.out.println("Numarul era: " + nr);
       }

       sc.close();

   }
   
  } 
