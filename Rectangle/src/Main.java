import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;

        System.out.println("Enter the number of rows: ");
        rows= scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        columns= scanner.nextInt();

        System.out.println("Enter the symbol: ");
        symbol=scanner.next();


        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
        System.out.println();
        }
        scanner.close();
    }
}