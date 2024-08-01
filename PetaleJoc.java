<<<<<<< HEAD
//cat de mult te iubeste cineva pe baza unui numar de petale introdus de utilizator

import java.util.Scanner;

public class PetaleJoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dati nr de petale: ");
        int x = scanner.nextInt();

        String[] raspunsuri = {"deloc", "putin", "mult", "cu pasiune", "la nebunie", "foarte mult"};
        String rsp = raspunsuri[x % 6];

        System.out.println("el ma iubeste " + rsp);

        scanner.close();
   }
=======
//cat de mult te iubeste cineva pe baza unui numar de petale introdus de utilizator

import java.util.Scanner;

public class PetaleJoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dati nr de petale: ");
        int x = scanner.nextInt();

        String[] raspunsuri = {"deloc", "putin", "mult", "cu pasiune", "la nebunie", "foarte mult"};
        String rsp = raspunsuri[x % 6];

        System.out.println("el ma iubeste " + rsp);

        scanner.close(); 
   }
>>>>>>> de0d29561db95237957aa63e13e4d3887d9253f6
}