import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class Kalkulator implements ActionListener {
	
	JFrame frame = new JFrame();
	JLabel naslovLabel = new JLabel();
	JPanel gornjiPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel donjiPanel = new JPanel();
	JTextField text = new JTextField();
	JButton brojeviButton[] = new JButton[10];
	JButton[] operatori = new JButton[4];
	JButton dec = new JButton();
	JButton jednako = new JButton();
	JButton del = new JButton();
	JButton clr = new JButton();
	Double prviBroj=0.0,drugiBroj=0.0,rezultat=0.0;
	char operator;
	
	
	String unos;
	
	Font naslovFont = new Font("MV Boli",Font.BOLD,50);		//font za brojeve MV Boli
	Font brojeviFont = new Font("Ink free",Font.ITALIC,50);	//font za naslov  Ink free
	
	
	
	
	
	


	
	Kalkulator(){
		
		
		
		naslovLabel.setVerticalAlignment(JLabel.TOP);
		naslovLabel.setFont(naslovFont);
		naslovLabel.setText("KALKULATOR");
		naslovLabel.setBounds(0, 0, 500, 100);
		
		
		text.setFont(brojeviFont);
		text.setEditable(false);
		text.setBounds(0, 100, 800, 100);
		
		gornjiPanel.add(naslovLabel);
		gornjiPanel.add(text);
		gornjiPanel.setLayout(new BorderLayout());
		gornjiPanel.setBounds(0, 0,  800, 200);
		
		for(int i = 0; i < 10; i++) {
			
			brojeviButton[i] = new JButton();
			brojeviButton[i].setFont(brojeviFont);
			brojeviButton[i].setText(String.valueOf(i));
			brojeviButton[i].addActionListener(this);
		}
		
		for(int i = 0; i  < 4; i++) {
			operatori[i] = new JButton();
			operatori[i].setFont(brojeviFont);
			operatori[i].addActionListener(this);
			
		}
		
		
		brojeviButton[1].setBounds(200,0,200,100);
		brojeviButton[2].setBounds(200,200,200,100);
		brojeviButton[3].setBounds(200,400,200,100);
		
		operatori[0].setText("+");
		
		
		panel.add(brojeviButton[1]);
		panel.add(brojeviButton[2]);
		panel.add(brojeviButton[3]);
		panel.add(operatori[0]);
		
		brojeviButton[4].setBounds(400,0,200,100);
		brojeviButton[5].setBounds(400,200,200,100);
		brojeviButton[6].setBounds(400,400,200,100);
		
		operatori[1].setText("-");
		
		
		panel.add(brojeviButton[4]);
		panel.add(brojeviButton[5]);
		panel.add(brojeviButton[6]);
		panel.add(operatori[1]);
		
		brojeviButton[7].setBounds(600,0,200,100);
		brojeviButton[8].setBounds(600,200,200,100);
		brojeviButton[9].setBounds(600,400,200,100);
		
		operatori[2].setText("*");
		
		
		panel.add(brojeviButton[7]);
		panel.add(brojeviButton[8]);
		panel.add(brojeviButton[9]);
		panel.add(operatori[2]);
		
		brojeviButton[0].setBounds(800,0,200,100);
		
		operatori[3].setText("/");
		
		dec.setFont(brojeviFont);
		dec.addActionListener(this);
		jednako.setFont(brojeviFont);
		jednako.addActionListener(this);
		dec.setText(".");
		jednako.setText("=");
		
		
		
		panel.add(brojeviButton[0]);
		panel.add(dec);
		panel.add(jednako);
		panel.add(operatori[3]);
		
		
		
		
		
		panel.setLayout(new GridLayout(4,4));
		panel.setFont(brojeviFont);
		panel.setBounds(0, 200, 800, 400);
		
		
		del.setText("DELETE");
		del.setFont(brojeviFont);
		del.addActionListener(this);
		
		clr.setText("CLEAR");
		clr.setFont(brojeviFont);
		clr.addActionListener(this);
		
		
		
		
		donjiPanel.add(clr);
		donjiPanel.add(del);
		donjiPanel.setLayout(new GridLayout(1,2));
		donjiPanel.setFont(brojeviFont);
		donjiPanel.setBounds(0, 600, 800, 100);
		
		
		
		frame.add(gornjiPanel);
		frame.add(panel);
		frame.add(donjiPanel);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,735);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	for(int i = 0; i < 10; i++) {
		if(e.getSource()==brojeviButton[i]) {
			text.setText(text.getText().concat(String.valueOf(i)));;
			
			
		}
	}
	
	for(int i = 0; i < 4; i++) {
		
		if(e.getSource()==operatori[i]) {
			prviBroj = Double.parseDouble((text.getText()));
			text.setText("");
			switch(i) {
			
			case 0:
				operator = '+';
				break;
			case 1:
				operator = '-';
				break;
			case 2:
				operator = '*';
				break;
			case 3:
				operator = '/';
				break;
			
			}
		}
	}
	
	if(e.getSource()==jednako) {
		drugiBroj = Double.parseDouble((text.getText()));
		switch(operator) {
		
		case '+':
			rezultat = prviBroj + drugiBroj;
			break;
		case '-':
			rezultat = prviBroj - drugiBroj;
			break;
		case '*':
			rezultat = prviBroj * drugiBroj;
			break;
		case '/':
			rezultat = prviBroj / drugiBroj;
			break;
		}
		
		text.setText(String.valueOf(rezultat));
		prviBroj = rezultat;
		
		
		
	}
	
	if(e.getSource()==dec)  text.setText(text.getText().concat("."));
	
	if(e.getSource()==clr) text.setText("");
	
	if(e.getSource()==del) {
		
		unos = text.getText();
		text.setText("");
		
		for(int i = 0; i < unos.length()-1; i++) {
			
			text.setText(text.getText()+unos.charAt(i));;
			
			
			
			
		}
		
	}
		
	}
	

}
