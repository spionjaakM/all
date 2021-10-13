import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePlay extends JPanel implements KeyListener,ActionListener {
	
	int delay=1;
	
	int xPrvi=500
			,yPrvi=200
			,xDrugi=650
			,yDrugi=200
			,xTreci=800
			,yTreci=200
			,xCetvrti=950
			,yCetvrti=200
			,xPeti=1100
			,yPeti=200
			,xSesti=1250
			,ySesti=200;
	
	int xPtice = 250,
		yPtice = 250;
	
	int displayScore = 0;
	
	Boolean running = false;
	Boolean gameOver = true;
	
	Boolean prosoPrvi = false;
	Boolean prosoDrugi = false;
	Boolean prosoTreci = false;
	Boolean prosoCetvrti = false;
	Boolean prosoPeti = false;
	Boolean prosoSesti = false;
			
	
	Timer timer;
	
	

	
	
	Random random = new Random();
	
	ImageIcon head = new ImageIcon("C:\\Users\\spionjaakM\\Downloads\\flappy.png");
	
	
	
	JLabel label = new JLabel(head);
	JLabel gameOverLabel = new JLabel();
	JLabel scoreLabel = new JLabel();
	
	GamePlay(){
		
		
		
		scoreLabel.setText(String.valueOf(displayScore));
		scoreLabel.setBounds(250,0,500,20);
		
		gameOverLabel.setText("");
		gameOverLabel.setBounds(300,0,500,20);
		gameOverLabel.setFont(new Font(null,Font.BOLD,25));
		
		setLayout(null);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		setBounds(0,0,800,500);
		setBackground(Color.gray);
		
		add(gameOverLabel);
		add(scoreLabel);
		add(label);
		
		label.setBounds(200, 200, 100, 100);
		
		
		
		
	}
	
	public void startGame() {
		System.out.println("PROSLO");
		System.out.println(running);
		
		running = true;
		gameOver = false;
		
		prosoPrvi = true;
		prosoDrugi = true;
		prosoTreci = true;
		prosoCetvrti = true;
		prosoPeti = true;
		prosoSesti = true;
		
		displayScore = 0;
		
		xPtice = 250;
		yPtice = 250;
		
		xPrvi=500;
		yPrvi=200;
		xDrugi=650;
		yDrugi=200;
		xTreci=800;
		yTreci=200;
		xCetvrti=950;
		yCetvrti=200;
		xPeti=1100;
		yPeti=200;
		xSesti=1250;
		ySesti=200;
		
		odredivanjeYDonjihPadova();
		timer = new Timer(delay,this);
		timer.start();
	}
	public void paint(Graphics g) {
		super.paint(g);

		draw(g);
	}
	
	public void draw(Graphics g) {
		
		if(gameOver) gameOverLabel.setText("GAME OVER");
		else gameOverLabel.setText("");
		
			g.setColor(Color.green);
			g.drawLine(0, 20, 800, 20);
			
			
		
			//DONJI PADOVI
			
			g.setColor(Color.green);
			
			g.fillRect(xPrvi, yPrvi, 50, 500);
			
			g.fillRect(xDrugi, yDrugi, 50, 500);
			
			g.fillRect(xTreci, yTreci, 50, 500);
			
			g.fillRect(xCetvrti, yCetvrti, 50, 500);
			
			g.fillRect(xPeti, yPeti, 50, 500);
			
			g.fillRect(xSesti, ySesti, 50, 500);
			
			//GORNJI PADOVI
			g.setColor(Color.green);

			g.fillRect(xPrvi, 20, 50, (yPrvi-100));
			
			g.fillRect(xDrugi, 20, 50, (yDrugi-100));
			
			g.fillRect(xTreci, 20, 50, (yTreci-100));
			
			g.fillRect(xCetvrti, 20, 50, (yCetvrti-100));
			
			g.fillRect(xPeti, 20, 50, (yPeti-100));
			
			g.fillRect(xSesti, 20, 50, (ySesti-100));
			
			//
			
//			g.setColor(Color.red);
//			g.fillOval(xPtice, yPtice, 15, 15);
			label.setBounds(xPtice, yPtice, 50, 50);
			
			
			
			
			repaint();
			
			
		
			
		
		
		}
	
	public void odredivanjeYDonjihPadova() {
		if(prosoPrvi) {yPrvi = 100+random.nextInt(250); prosoPrvi=false;}
		if(prosoDrugi){yDrugi = 100+random.nextInt(250); prosoDrugi=false;}
		if(prosoTreci){yTreci = 100+random.nextInt(250); prosoTreci=false;}
		if(prosoCetvrti){yCetvrti = 100+random.nextInt(250); prosoCetvrti=false;}
		if(prosoPeti){yPeti = 100+random.nextInt(250); prosoPeti=false;}
		if(prosoSesti){ySesti = 100+random.nextInt(250); prosoSesti=false;}
		
		
	}
	
	public void kretanjePadova() {
		
		if(running ) {
		xPrvi-=1;
		xDrugi-=1;
		xTreci-=1;
		xCetvrti-=1;
		xPeti-=1;
		xSesti-=1;
		yPtice+=1;
		}
		
	}
	
	public void vracanjePadova() {
		
		if(xPrvi < -100) {xPrvi=800;prosoPrvi=true;}
		if(xDrugi < -100) {xDrugi=800;prosoDrugi=true;}
		if(xTreci < -100) {xTreci=800;prosoTreci=true;}
		if(xCetvrti < -100) {xCetvrti=800;prosoCetvrti=true;}
		if(xPeti < -100) {xPeti=800;prosoPeti=true;}
		if(xSesti < -100) {xSesti=800;prosoSesti=true;}
		if(yPtice <= 20) yPtice = 20;
		
		
		
		
	}
	
	public void provjeraSudara() {
		
		if(((xPtice+50)  > xPrvi && xPtice < (xPrvi+50)) && (yPtice > yPrvi || yPtice < (yPrvi-95))) {gameOver=true; running=false;}
		if(((xPtice+50)  > xDrugi && xPtice < (xDrugi+50)) && (yPtice > yDrugi || yPtice < (yDrugi-95))) {gameOver=true; running=false;}
		if(((xPtice+50)  > xTreci && xPtice < (xTreci+50)) && (yPtice > yTreci || yPtice < (yTreci-95))) {gameOver=true; running=false;}
		if(((xPtice+50)  > xCetvrti && xPtice < (xCetvrti+50)) && (yPtice > yCetvrti || yPtice < (yCetvrti-95))) {gameOver=true; running=false;}
		if(((xPtice+50)  > xPeti && xPtice < (xPeti+50)) && (yPtice > yPeti || yPtice < (yPeti-95))) {gameOver=true; running=false;}
		if(((xPtice+50)  > xSesti && xPtice < (xSesti+50)) && (yPtice > ySesti || yPtice < (ySesti-95))) {gameOver=true; running=false;}
		
		

		
	}
	
	public void score() {
		
		if(xPtice==xPrvi || xPtice==xDrugi || xPtice==xTreci || xPtice==xCetvrti || xPtice==xPeti || xPtice==xSesti) displayScore++;
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(!running)if(e.getKeyCode()==KeyEvent.VK_ENTER)startGame();
		if(gameOver)if(e.getKeyCode()==KeyEvent.VK_ENTER)new GamePlay();
		
			
		if(running)if(e.getKeyChar()=='w') yPtice-= 35;
		if(running)if(e.getKeyChar()=='s') yPtice+= 35;
		
		if(e.getKeyChar()=='t') {
			running = true;
			gameOver = false;
			}
		
		
	}
	
 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(!gameOver) {
			scoreLabel.setText(String.valueOf(displayScore));
			kretanjePadova();
			vracanjePadova();
			provjeraSudara();
			odredivanjeYDonjihPadova();
			score();
		}
		
		
		
		
	}



	
	
	

}
