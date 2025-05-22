public class BankAccount {

    private String accountNumber;
    private String name;
    private double sold;

    BankAccount(String accountNumber, String name, double initialSold){
        this.accountNumber=accountNumber;
        this.name=name;
        this.sold=initialSold;
    }

    public void deposit(double sum){
        sold+=sum;
    }

    public void withdraw(double sum) throws Exception{
        if(sum>sold){
            throw new Exception("Not enough funds");
        }
        sold-=sum;
    }

    public double getBalance(){
        return sold;
    }

    public String toString(){
        return "The account "+accountNumber+" of owner "+name+" has the sold "+sold;
    }
}
