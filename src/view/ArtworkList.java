package view;

import javax.swing.*;
import java.awt.*;

import controller.*;
import view.MenuAddArtwork;


public class ArtworkList extends JFrame {
    public ArtworkList() {
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Main Menu");

        JLabel title = new JLabel("Welcome!");
        title.setBounds(530, 55, 700, 60);
        title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(200, 60, 1000, 600);

        JButton MenuArtworkButton = new JButton("Open Add Work");
        MenuArtworkButton.setBounds(400, 150, 440, 40);
        panel.add(MenuArtworkButton);

        MenuArtworkButton.addActionListener(e -> {
            this.dispose();
            new MenuAddArtwork();
        });

        add(title);
        add(panel);
    }

    public static void main(String[] args) {
        new ArtworkList();
    }
}
