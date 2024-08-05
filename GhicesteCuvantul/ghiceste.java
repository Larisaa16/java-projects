package GhicesteCuvantul;
import java.util.Scanner;
public class ghiceste {
  public static void main(String[] args) {
    String cuvant;
    System.out.println("Incearca sa ghicesti cuvantul (fenomen al naturii)");
    Scanner scanner=new Scanner(System.in);

    cuvant=scanner.nextLine();

   while( cuvant.compareTo("ploaie")!=0){
    System.out.println("Incearca din nou :(");
    cuvant=scanner.nextLine();
   }
   System.out.println("Ai ghicit :D");
   scanner.close();
  }

}
