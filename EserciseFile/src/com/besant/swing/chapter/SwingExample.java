package com.besant.swing.chapter;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class SwingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Billing System");

		TextField admin = new TextField();
		admin.setBounds(200, 50, 150, 20);
		TextField password = new TextField();
		password.setBounds(200, 100, 150, 20);

		JLabel adminLabel = new JLabel("User Name");
		adminLabel.setBounds(120, 50, 100, 20);
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(120, 100, 100, 20);

		Button button = new Button("Click Me");
		button.setBounds(150, 150, 100, 20);
		JLabel loginLabel = new JLabel("Value will change");
		loginLabel.setBounds(200, 200, 180, 20);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(admin.getText().toString().equalsIgnoreCase("admin") && password.getText().toString().equalsIgnoreCase("admin"))
				{
					System.out.println("Welcome Logic");
					
					loginLabel.setText("Login Successful");
					
					
				}

				if(admin.getText()=="admin" && password.getText()==("admin"))
				{
					System.out.println("Welcome Logic");
					
					loginLabel.setText("Login Successful");
					
					
				}

			}
		});

		frame.add(admin);
		frame.add(password);
		frame.add(adminLabel);
		frame.add(passwordLabel);
		frame.add(button);
        frame.add(loginLabel);
		frame.setSize(600, 600);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
