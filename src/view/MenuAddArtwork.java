package view;


import view.ArtworkList;
import model.classes.DatabaseHandler;
import controller.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAddArtwork extends JFrame {
    private JFileChooser UploadImage;
    public MenuAddArtwork() {
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Add Artwork Menu");

        JLabel title = new JLabel("Add Artwork Menu");
        title.setBounds(490, 20, 700, 60);
        title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(100, 60, 1080, 600);

        //title karya seni
        JLabel TitleKaryaSeni = new JLabel("Title Karya Seni");
        TitleKaryaSeni.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        TitleKaryaSeni.setBounds(200, 110, 220, 30);
        panel.add(TitleKaryaSeni);

        JTextArea TitleKaryaSeniField = new JTextArea();
        TitleKaryaSeniField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        TitleKaryaSeniField.setBounds(510, 110, 220, 30);
        panel.add(TitleKaryaSeniField);

        //deskripsi karya seni
        JLabel Description = new JLabel("Deskripsi Karya seni : ");
        Description.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        Description.setBounds(200, 160, 220, 30);
        panel.add(Description);

        JTextField DescriptionField = new JTextField(20);
        DescriptionField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        DescriptionField.setBounds(510, 160, 220, 30);
        panel.add(DescriptionField);


        JButton UploadImage = new JButton("Upload Image");
        UploadImage.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        UploadImage.setBounds(200, 210, 220, 30);
        panel.add(UploadImage);

        

        JButton submit = new JButton("Add ArtWork");
        submit.setBounds(440, 260, 440, 40);
        panel.add(submit);

        submit.addActionListener(e ->  {
           
        });

        JButton back = new JButton("Back to Main Menu");
        back.setBounds(440, 310, 440, 40);
        panel.add(back);

        back.addActionListener(e ->  {
            this.dispose();
            new ArtworkList();
        });

        this.add(title);
        this.add(panel);
    }
}