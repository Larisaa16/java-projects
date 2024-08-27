package Calculator;

//calculator cu 4 operatii
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu primul nr: ");
        double nr1=scanner.nextDouble();
        System.out.print("Introdu al doilea nr: ");
        double nr2=scanner.nextDouble();

        scanner.nextLine();
 
        System.out.print("Ce operatie aritmetica alegi? ");
        String operatie = scanner.nextLine();

        switch (operatie) {
            case "suma":
                System.out.printf("%.2f + %.2f = %.2f", nr1,nr2,nr1+nr2);
                break;
            case "diferenta":
                System.out.printf("%.2f - %.2f = %.2f", nr1,nr2,nr1-nr2);
                break;
            case "inmultire":
             System.out.printf("%.2f * %.2f = %.2f", nr1,nr2,nr1*nr2);
                break;
            case "impartire":
            if(nr2==0)
            {
                System.out.println("numitorul nu poate fi 0");
            } else
            System.out.printf("%.2f / %.2f = %.2f", nr1,nr2,nr1/nr2);
                break;
            default:
                 System.out.println("Nu ai introdus o operatie valida");

        }

    

        scanner.close();
    }
}
