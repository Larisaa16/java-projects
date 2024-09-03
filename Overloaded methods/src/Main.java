import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       /* int a,b;
        System.out.println("dati valori pt a si b");
        a= scanner.nextInt();
        b= scanner.nextInt();
        int x = add(a,b);
        System.out.println(x); */

        int x=add(1,2, 3);
        System.out.println(x);



    }

    static int add(int a, int b){
        System.out.println("method 1");
        return a+b;
    }

    static int add(int a, int b, int c){
        System.out.println("method 2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("method 3");
        return a+b+c+d;
    }



}