//Convertirea unui numar din 10 intr o baza data de utilizator

import java.util.Scanner;

public class Converteste {
    public static String converteste(int numar, int baza){
        if(numar==0){
            return "";
        } else {
            int rest = numar%baza;
            int cat = numar/baza;
            return converteste(cat, baza)+Integer.toString(rest);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Spune nr pe care vrei sa l convertesti: ");
        int numarConv=scanner.nextInt();
        
         System.out.print("Spune baza: ");
         int baza = scanner.nextInt();
         
         if(numarConv==0){
             System.out.println("Nr " + numarConv + " in baza " +baza+" este 0");
         } else {
             String rezultat = converteste(numarConv,baza);
             System.out.println("Nr "+ numarConv+" in baza "+baza+" este "+rezultat);
         }
          scanner.close();
    }
}
