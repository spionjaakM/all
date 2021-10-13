import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Random;


public class odabirTezineCheckBox extends Canvas implements ActionListener{
	JLabel titleLabel = new JLabel();
	JPanel titlePanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JFrame frame = new JFrame();
	JCheckBox border = new JCheckBox();
	JCheckBox contact = new JCheckBox();
	JButton submitButton = new JButton();
	
	Graphics g;
	
	
	int borderStatus = 0;
	int contactStatus = 0;
	
	odabirTezineCheckBox(){
		
			
			this.g = g;
			titleLabel.setText("Odabir tezinu");
			titleLabel.setFont(new Font(null,Font.BOLD,35));
			titleLabel.setForeground(Color.red);
			titleLabel.setBounds(120,35,250,30);
			
			
			
			border.setText("Border");
			border.setFont(new Font(null, Font.BOLD,10));
			border.setBounds(20, 120, 75, 35);
			border.addActionListener(this);
			border.setFocusable(false);
			border.setBackground(Color.gray);
			
			contact.setText("Contact");
			contact.setFont(new Font(null, Font.BOLD,10));
			contact.setBounds(20, 170, 75, 35);
			contact.addActionListener(this);
			contact.setFocusable(false);
			contact.setBackground(Color.gray);
			
			submitButton.setText("SUMBIT");
			submitButton.setFont(new Font(null,Font.BOLD,15));
			submitButton.setBounds(100, 400, 300, 50);
			submitButton.setFocusable(false);
			submitButton.addActionListener(this);
			
			titlePanel.add(titleLabel);
			titlePanel.setBounds(0, 0, 500, 100);
			titlePanel.setBackground(new Color(25,25,25));
			titlePanel.setLayout(null);
			
			buttonPanel.setBounds(0,100,250,200);
			buttonPanel.setBackground(Color.gray);
			buttonPanel.add(border);
			buttonPanel.add(contact);
			buttonPanel.add(submitButton);
			buttonPanel.setLayout(null);
			
			
			frame.add(titlePanel);
			frame.add(buttonPanel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500,500);
			frame.setResizable(false);
			frame.setVisible(true);
			frame.setLayout(null);
		
			
			
			//new GameFrame();
			 g.setColor(Color.red);
			g.drawRect(100, 120, 50, 50);
			
			
	}


	
	 public void paint(Graphics g) {  
		
	          
	    }  
	
	
	
	@Override
	public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.BLUE);
      g.fillRect(0, 0, 100, 100);
    }
	


	

}