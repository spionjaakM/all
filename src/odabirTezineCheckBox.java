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
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Random;


public class odabirTezineCheckBox extends Canvas implements ActionListener{
	
	JFrame frame = new JFrame();
	
	JLabel titleLabel = new JLabel();
	
	
	JLabel glavaRandom = new JLabel();
	JLabel tijeloRandom = new JLabel();
	
	JLabel glavaLabel = new JLabel();
	JLabel tijeloLabel = new JLabel();
	
	JPanel titlePanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	
	JCheckBox border = new JCheckBox();
	JCheckBox contact = new JCheckBox();
	JCheckBox grid = new JCheckBox();
	
	JCheckBox glavaRGB = new JCheckBox();
	JCheckBox tijeloRGB = new JCheckBox();
	
	JButton submitButton = new JButton();
	JButton refreshButton = new JButton();
	
	JButton randomBojaGlava = new JButton();
	JButton randomBojaTijelo = new JButton();
	
	JButton glava = new JButton();
	JLabel rGlava = new JLabel();
	JLabel gGlava = new JLabel();
	JLabel bGlava = new JLabel();
	
	
	JButton tijelo = new JButton();
	JLabel rTijelo = new JLabel();
	JLabel gTijelo = new JLabel();
	JLabel bTijelo = new JLabel();
	
	JSlider sliderRGlava = new JSlider();  
	JSlider sliderGGlava = new JSlider();  
	JSlider sliderBGlava = new JSlider();  
	
	JSlider sliderRTijelo = new JSlider();  
	JSlider sliderGTijelo = new JSlider();  
	JSlider sliderBTijelo = new JSlider();
	
	Random random = new Random();
	
	int rGlavaBoja,gGlavaBoja,bGlavaBoja;
	int rTijeloBoja,gTijeloBoja,bTijeloBoja;
	
	int borderStatus = 0;
	int contactStatus = 0;
	int gridStatus = 0;
	int glavaRGBStatus = 0;
	int tijeloRGBStatus = 0;
	
	odabirTezineCheckBox(){
		
		rGlavaBoja = (int) (sliderRGlava.getValue() * 2.55);
		gGlavaBoja = (int) (sliderGGlava.getValue() * 2.55);
		bGlavaBoja = (int) (sliderBGlava.getValue() * 2.55);
		
		rTijeloBoja = (int) (sliderRTijelo.getValue() * 2.55);
		gTijeloBoja = (int) (sliderGTijelo.getValue() * 2.55);
		bTijeloBoja = (int) (sliderBTijelo.getValue() * 2.55);
		 
			sliderRGlava.setBounds(350, 120, 100, 10);
			sliderGGlava.setBounds(350, 150, 100, 10);
			sliderBGlava.setBounds(350, 180, 100, 10);
			
			rGlava.setText("CRVENA");
			rGlava.setBounds(375, 100, 100, 20);
			
			gGlava.setText("ZELENA");
			gGlava.setBounds(375, 130, 100, 20);
			
			bGlava.setText("PLAVA");
			bGlava.setBounds(375, 160, 100, 20);
			
			glavaRGB.setText("Rainbow");
			glavaRGB.setFont(new Font(null, Font.BOLD,13));
			glavaRGB.setBounds(270,200,85,35);
			glavaRGB.addActionListener(this);
			glavaRGB.setFocusable(false);
			glavaRGB.setBackground(Color.gray);
			
			randomBojaGlava.setText("Random");
			randomBojaGlava.setFont(new Font(null, Font.BOLD,13));
			randomBojaGlava.setBounds(360,200,96,35);
			randomBojaGlava.addActionListener(this);
			randomBojaGlava.setFocusable(false);
			
			randomBojaTijelo.setText("Random");
			randomBojaTijelo.setFont(new Font(null, Font.BOLD,13));
			randomBojaTijelo.setBounds(360,330,96,35);
			randomBojaTijelo.addActionListener(this);
			randomBojaTijelo.setFocusable(false);

			
			glavaRandom.setText("");
			glavaRandom.setFont(new Font(null, Font.BOLD,13));
			glavaRandom.setBounds(200, 157, 100, 35);
			glavaRandom.setBackground(Color.gray);
			
			tijeloRGB.setText("Rainbow");
			tijeloRGB.setFont(new Font(null, Font.BOLD,13));
			tijeloRGB.setBounds(270,330,85,35);
			tijeloRGB.addActionListener(this);
			tijeloRGB.setFocusable(false);
			tijeloRGB.setBackground(Color.gray);
			
			tijeloRandom.setText("");
			tijeloRandom.setFont(new Font(null, Font.BOLD,13));
			tijeloRandom.setBounds(200, 287, 100, 35);
			tijeloRandom.setBackground(Color.gray);
			
			sliderRTijelo.setBounds(350, 250, 100, 10);
			sliderGTijelo.setBounds(350, 280, 100, 10);
			sliderBTijelo.setBounds(350, 310, 100, 10);
			
			rTijelo.setText("CRVENA");
			rTijelo.setBounds(375, 230, 100, 20);
			
			gTijelo.setText("ZELENA");
			gTijelo.setBounds(375, 260, 100, 20);
			
			bTijelo.setText("PLAVA");
			bTijelo.setBounds(375, 290, 100, 20);
			
			
			
			
			titleLabel.setText("Odabir tezinu");
			titleLabel.setFont(new Font(null,Font.BOLD,35));
			titleLabel.setForeground(Color.red);
			titleLabel.setBounds(120,35,250,30);
			
			glavaLabel.setText("Boja glave: ");
			glavaLabel.setFont(new Font(null, Font.BOLD,15));
			glavaLabel.setBounds(180, 137, 100, 35);
			glavaLabel.setFocusable(false);
			glavaLabel.setBackground(Color.gray);
			
			tijeloLabel.setText("Boja tijela: ");
			tijeloLabel.setFont(new Font(null, Font.BOLD,15));
			tijeloLabel.setBounds(180, 267, 100, 35);
			tijeloLabel.setFocusable(false);
			tijeloLabel.setBackground(Color.gray);
			
			glava.setEnabled(false);
			glava.setBackground(new Color(rGlavaBoja,gGlavaBoja,bGlavaBoja));
			glava.setBounds(270,120,70,70);
			
			tijelo.setEnabled(false);
			tijelo.setBackground(new Color(rTijeloBoja,gTijeloBoja,bTijeloBoja));
			tijelo.setBounds(270,250,70,70);

//			rPlusGlava.setText("+");
//			rPlusGlava.setFont(new Font(null, null,5));
//			rPlusGlava.setBounds(350, 120, 25, 25);
//			rPlusGlava.addActionListener(this);
//			rPlusGlava.setFocusable(false);
//			rPlusGlava.setBackground(Color.gray);
			
			border.setText("Border");
			border.setFont(new Font(null, Font.BOLD,15));
			border.setBounds(20, 120, 100, 35);
			border.addActionListener(this);
			border.setFocusable(false);
			border.setBackground(Color.gray);
			
			contact.setText("Contact");
			contact.setFont(new Font(null, Font.BOLD,15));
			contact.setBounds(20, 170, 100, 50);
			contact.addActionListener(this);
			contact.setFocusable(false);
			contact.setBackground(Color.gray);
			
			grid.setText("Grid");
			grid.setFont(new Font(null, Font.BOLD,15));
			grid.setBounds(20, 220, 80, 50);
			grid.addActionListener(this);
			grid.setFocusable(false);
			grid.setBackground(Color.gray);
			
			submitButton.setText("SUMBIT");
			submitButton.setFont(new Font(null,Font.BOLD,15));
			submitButton.setBounds(50, 400, 150, 50);
			submitButton.setFocusable(false);
			submitButton.addActionListener(this);
			submitButton.setOpaque(true);
			
			refreshButton.setText("REFRESH");
			refreshButton.setFont(new Font(null,Font.BOLD,15));
			refreshButton.setBounds(300, 400, 150, 50);
			refreshButton.setFocusable(false);
			refreshButton.addActionListener(this);
			
			
			
			titlePanel.add(titleLabel);
			titlePanel.setBounds(0, 0, 500, 100);
			titlePanel.setBackground(new Color(25,25,25));
			titlePanel.setLayout(null);
			
			buttonPanel.setBounds(0,100,250,200);
			buttonPanel.setBackground(Color.gray);
			buttonPanel.add(border);
			buttonPanel.add(contact);
			buttonPanel.add(grid);
			buttonPanel.add(submitButton);
			buttonPanel.add(refreshButton);
			buttonPanel.add(glavaLabel);
			buttonPanel.add(glava);
			buttonPanel.add(rGlava);
			buttonPanel.add(gGlava);
			buttonPanel.add(bGlava);
			buttonPanel.add(sliderRGlava);
			buttonPanel.add(sliderGGlava);
			buttonPanel.add(sliderBGlava);	
			buttonPanel.add(tijeloLabel);
			buttonPanel.add(tijelo);
			buttonPanel.add(rTijelo);
			buttonPanel.add(gTijelo);
			buttonPanel.add(bTijelo);
			buttonPanel.add(sliderRTijelo);
			buttonPanel.add(sliderGTijelo);
			buttonPanel.add(sliderBTijelo);	
			buttonPanel.add(glavaRGB);
			buttonPanel.add(tijeloRGB);
			buttonPanel.add(glavaRandom);
			buttonPanel.add(tijeloRandom);
			buttonPanel.add(randomBojaGlava);
			buttonPanel.add(randomBojaTijelo);
			buttonPanel.setLayout(null);
			
			
			frame.add(titlePanel);
			frame.add(buttonPanel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500,500);
			frame.setResizable(false);
			frame.setVisible(true);
			frame.setLayout(null);
		
			
			
			//new GameFrame();
			
			
			
	}


	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		rGlavaBoja = (int) (sliderRGlava.getValue() * 2.55);
		gGlavaBoja = (int) (sliderGGlava.getValue() * 2.55);
		bGlavaBoja = (int) (sliderBGlava.getValue() * 2.55);
		
		rTijeloBoja = (int) (sliderRTijelo.getValue() * 2.55);
		gTijeloBoja = (int) (sliderGTijelo.getValue() * 2.55);
		bTijeloBoja = (int) (sliderBTijelo.getValue() * 2.55);
		
			
		glava.setBackground(new Color(rGlavaBoja,gGlavaBoja,bGlavaBoja));
		tijelo.setBackground(new Color(rTijeloBoja,gTijeloBoja,bTijeloBoja));
		
		if(e.getSource()==randomBojaGlava) {
			sliderRGlava.setValue(random.nextInt(100));
			sliderGGlava.setValue(random.nextInt(100));
			sliderBGlava.setValue(random.nextInt(100));
			rGlavaBoja = (int) (sliderRGlava.getValue() * 2.55);
			gGlavaBoja = (int) (sliderGGlava.getValue() * 2.55);
			bGlavaBoja = (int) (sliderBGlava.getValue() * 2.55);
			glava.setBackground(new Color(rGlavaBoja,gGlavaBoja,bGlavaBoja));
			glavaRGB.setSelected(false);
		}
		
		if(e.getSource()==randomBojaTijelo) {
			sliderRTijelo.setValue(random.nextInt(100));
			sliderGTijelo.setValue(random.nextInt(100));
			sliderBTijelo.setValue(random.nextInt(100));
			rTijeloBoja = (int) (sliderRTijelo.getValue() * 2.55);
			gTijeloBoja = (int) (sliderGTijelo.getValue() * 2.55);
			bTijeloBoja = (int) (sliderBTijelo.getValue() * 2.55);
			tijelo.setBackground(new Color(rTijeloBoja,gTijeloBoja,bTijeloBoja));
			tijeloRGB.setSelected(false);
		}
		
		if(glavaRGB.isSelected()) {
			glavaRandom.setText("rainbow");
			sliderRGlava.setValue(50);
			sliderGGlava.setValue(50);
			sliderBGlava.setValue(50);
			sliderRGlava.setEnabled(false);
			sliderGGlava.setEnabled(false);
			sliderBGlava.setEnabled(false);
			rGlavaBoja = (int) (sliderRGlava.getValue() * 2.55);
			gGlavaBoja = (int) (sliderGGlava.getValue() * 2.55);
			bGlavaBoja = (int) (sliderBGlava.getValue() * 2.55);
			glava.setBackground(new Color(rGlavaBoja,gGlavaBoja,bGlavaBoja));
		}
		else {
			glavaRandom.setText("");
			sliderRGlava.setEnabled(true);
			sliderGGlava.setEnabled(true);
			sliderBGlava.setEnabled(true);
		}
		
		if(tijeloRGB.isSelected()) {
			tijeloRandom.setText("rainbow");
			sliderRTijelo.setValue(50);
			sliderGTijelo.setValue(50);
			sliderBTijelo.setValue(50);
			sliderRTijelo.setEnabled(false);
			sliderGTijelo.setEnabled(false);
			sliderBTijelo.setEnabled(false);
			rTijeloBoja = (int) (sliderRGlava.getValue() * 2.55);
			gTijeloBoja = (int) (sliderGGlava.getValue() * 2.55);
			bTijeloBoja = (int) (sliderBGlava.getValue() * 2.55);
			tijelo.setBackground(new Color(rTijeloBoja,gTijeloBoja,bTijeloBoja));
		}
		else {
			tijeloRandom.setText("");
			sliderRTijelo.setEnabled(true);
			sliderGTijelo.setEnabled(true);
			sliderBTijelo.setEnabled(true);
		}
		
		if(e.getSource()==submitButton) {
			if(border.isSelected()) borderStatus = 1;
			if(contact.isSelected()) contactStatus = 1;
			if(grid.isSelected()) gridStatus = 1;
			if(glavaRGB.isSelected()) glavaRGBStatus = 1;
			if(tijeloRGB.isSelected()) tijeloRGBStatus = 1;
			frame.dispose();
			new GameFrame(borderStatus,contactStatus,gridStatus,rGlavaBoja,gGlavaBoja,bGlavaBoja,rTijeloBoja,gTijeloBoja,bTijeloBoja,glavaRGBStatus,tijeloRGBStatus);
		}
}
	
	
	


	

}