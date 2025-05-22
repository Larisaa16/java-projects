import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        BankAccount account=new BankAccount("R0123","Larisa",300.70);
        int option;

        do{
            System.out.println("\n---- Menu ----");
            System.out.println("1. Create your account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Show the sold");
            System.out.println("5. Show info about the account");
            System.out.println("0. Exit");
            System.out.println("Choose a different option: ");
            option=sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Enter your name: ");
                    sc.nextLine();
                    String name=sc.nextLine();

                    System.out.println("Enter the number: ");
                    String number = sc.nextLine();

                    System.out.print("Enter the initial sold: ");
                    double initialSold = sc.nextDouble();

                    BankAccount newAccount=new BankAccount(name,number,initialSold);
                    accounts.add(newAccount);
                    System.out.println("Account created successfully");
                    break;

                case 2:
                    System.out.println("Put the sum to deposit: ");
                    double depositSum=sc.nextInt();
                    account.deposit(depositSum);
                    System.out.println("Successful deposit");
                    break;

                case 3:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdrawSum=sc.nextInt();
                    try{
                        account.withdraw(withdrawSum);
                        System.out.println("Withdraw successful");
                    } catch(Exception e){
                        System.out.println("Error "+e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("The sold is "+account.getBalance()); break;

                case 5:
                    System.out.println(account.toString()); break;

                case 0:
                    System.out.println("goodbye"); break;

                default:
                    System.out.println("incorrect option. try again");
            }
        } while(option!=0);
        sc.close();
    }
}