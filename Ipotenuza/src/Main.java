
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double x, y, z;

        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        x=scanner.nextDouble();
        System.out.print("y: ");
        y=scanner.nextDouble();

        z=Math.sqrt((x*x)+(y*y));
        System.out.println("Ipotenuza e "+z);

        scanner.close();
    }
}