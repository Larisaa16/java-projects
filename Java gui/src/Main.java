import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        new MyFrame(); // Creează un obiect al clasei MyFrame
    }
}

class MyFrame extends JFrame { // Schimbă numele clasei pentru a evita conflictele
    MyFrame() { // Constructorul clasei MyFrame

        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false);
        this.setSize(420, 420); // sets the x-dim and the y dim
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("images (1).png"); // create a image icon
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(0x8B0000));
    }
}
