import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class MyFrame extends JFrame  {
    JButton button;
    public MyFrame(){

        ImageIcon icon = new ImageIcon("cat.jpg");
        Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        button = new JButton();
        button.addActionListener(e -> System.out.println("mew"));
        button.setIcon(scaledIcon);
        button.setPreferredSize(new Dimension(100, 100));
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.addActionListener(e->playSound());



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        this.setSize(500, 500);
        this.add(button);
        this.setVisible(true);


    }

    private void playSound() {
        try {
            File file = new File("mixkit-angry-cartoon-kitty-meow-94.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    }




