import java.util.InputMismatchException;
import java.util.Scanner;
// exception is an event that occurs during the execution of a program that disrupts the normal flow 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a whole number to divide: ");
            int x = sc.nextInt();

            System.out.print("Enter a whole number to divide by: ");
            int y= sc.nextInt();

            int z=x/y;
            System.out.println("Result: " +z);
        }
        catch(ArithmeticException e ){
            System.out.println("You can't divide by 0!");

        }
        catch (InputMismatchException e){
            System.out.println("Enter a number!");
        }
        catch (Exception e){
            System.out.println("Smth went wrong!");
        }
        finally {
            sc.close();
        }



    }
}