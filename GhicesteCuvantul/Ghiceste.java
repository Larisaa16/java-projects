package GhicesteCuvantul;
import java.util.Scanner;
public class Ghiceste {
  public static void main(String[] args) {
    String cuvant;
    boolean ghicit=false;
    System.out.println("Incearca sa ghicesti cuvantul (fenomen al naturii)");
    Scanner scanner=new Scanner(System.in);

    cuvant=scanner.nextLine();

    for(int i=1;i<=3;i++){
      if(cuvant.equals("ploaie")){
        System.out.println("Ai ghicit :D");
        ghicit = true;
        break;
      }
        else{
          if(i<3){
            System.out.println("Incearca din nou :( mai ai "+ (3-i)+" incercari");
            cuvant=scanner.nextLine();
          }
        }  
   
      }
      if (!ghicit) {
        System.out.println("Ai ramas fara incercari, cuvantul era ploaie");
    }
          scanner.close();

    }
  }

