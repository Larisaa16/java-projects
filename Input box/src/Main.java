import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age=Integer.parseInt((JOptionPane.showInputDialog("Enter your age: ")));
        JOptionPane.showMessageDialog(null, "You're "+age+" years old");

        String favFood = JOptionPane.showInputDialog("What's your fav food?");
        JOptionPane.showMessageDialog(null, "Your fav food is "+ favFood);
    }
}