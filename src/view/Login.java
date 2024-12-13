package view;

import model.classes.DatabaseHandler;
import view.ArtworkList;
import controller.*;


import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
	public Login() {
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		this.setSize(400, 600);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Login");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JLabel title = new JLabel("Login");
		title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
		title.setBounds(143, 22, 200, 51);
		JPanel formLogin = new JPanel();
		formLogin.setLayout(null);
		formLogin.setBounds(44, 111, 300, 150);

		JLabel ProfileUser = new JLabel("Email:");
		ProfileUser.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
		ProfileUser.setBounds(88, 0, 130, 30);
		formLogin.add(ProfileUser);

		JTextField profileField = new JTextField(255);
		profileField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
		profileField.setBounds(0, 33, 298, 30);
		formLogin.add(profileField);

		JLabel passwordUser = new JLabel("Password:");
		passwordUser.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
		passwordUser.setBounds(113, 77, 130, 30);
		formLogin.add(passwordUser);

		JTextField passwordField = new JTextField(255);
		passwordField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
		passwordField.setBounds(0, 110, 298, 30);
		formLogin.add(passwordField);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setBounds(43, 300, 350, 100);

        

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(200, 0, 100, 40);
		buttonPanel.add(loginButton);

        loginButton.addActionListener(e -> {
			this.dispose();
			new ArtworkList();
		});

		add(title);
		add(formLogin);
		add(buttonPanel);

	}
}