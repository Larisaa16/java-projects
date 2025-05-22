import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Animal animal = new Animal();

        System.out.println("What animal do u want?");
        System.out.print("1=dog or 2=cat: ");
        int choice=sc.nextInt();
        if(choice==1){
            animal=new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal=new Cat();
            animal.speak();
        }
        else{
            animal=new Animal();
            System.out.println("That choice is invalid");
            animal.speak();
        }

    }
}