import java.awt.*;

import javax.swing.*;


public class GamePanel extends JPanel{
	

//JLabel rezultatBacanja = new JLabel();
//JButton kockica = new JButton();
	
	
	GamePanel(){
		
//		rezultatBacanja.setBounds(500, 500, 100, 100);
//		rezultatBacanja.setText("0");
//		
//	
//		add(kockica);
//		add(rezultatBacanja);
		
		
		
	}
	
	public void paint(Graphics g) {
		
	//polje za kretanje
	g.setColor(Color.white);
	g.drawLine(0, 0, 0, 720);
	g.drawLine(0, 20, 1080, 20);
	g.drawLine(0, 40, 20, 40);
	g.drawLine(0, 60, 20, 60);
	g.drawLine(0, 80, 20, 80);
	g.drawLine(0, 100, 20, 100);
	g.drawLine(0, 120, 20, 120);
	g.drawLine(0, 140, 20, 140);
	g.drawLine(0, 160, 20, 160);
	g.drawLine(0, 180, 20, 180);
	g.drawLine(0, 200, 20, 200);
	g.drawLine(0, 220, 20, 220);
	g.drawLine(0, 240, 20, 240);
	g.drawLine(0, 260, 20, 260);
	g.drawLine(0, 280, 20, 280);
	g.drawLine(0, 300, 20, 300);
	g.drawLine(0, 320, 20, 320);
	g.drawLine(0, 340, 20, 340);
	g.drawLine(0, 360, 20, 360);
	g.drawLine(0, 380, 20, 380);
	g.drawLine(0, 400, 20, 400);
	g.drawLine(0, 420, 20, 420);
	g.drawLine(0, 440, 20, 440);
	g.drawLine(0, 460, 20, 460);
	g.drawLine(0, 480, 20, 480);
	g.drawLine(0, 500, 20, 500);
	g.drawLine(0, 520, 20, 520);
	g.drawLine(0, 540, 20, 540);
	g.drawLine(0, 560, 20, 560);
	g.drawLine(0, 580, 20, 580);
	g.drawLine(0, 600, 20, 600);
	g.drawLine(0, 620, 20, 620);
	g.drawLine(0, 640, 20, 640);
	
	for(int i = 0; i < 1090; i+=20) g.drawLine(i, 0, i,20);
	for(int i = 0; i < 1090; i+=20) g.drawLine(i, 660, i,680);
	
	g.drawLine(1040, 40, 1060, 40);
	g.drawLine(1040, 60, 1060, 60);
	g.drawLine(1040, 80, 1060, 80);
	g.drawLine(1040, 100, 1060, 100);
	g.drawLine(1040, 120, 1060, 120);
	g.drawLine(1040, 140, 1060, 140);
	g.drawLine(1040, 160, 1060, 160);
	g.drawLine(1040, 180, 1060, 180);
	g.drawLine(1040, 200, 1060, 200);
	g.drawLine(1040, 220, 1060, 220);
	g.drawLine(1040, 240, 1060, 240);
	g.drawLine(1040, 260, 1060, 260);
	g.drawLine(1040, 280, 1060, 280);
	g.drawLine(1040, 300, 1060, 300);
	g.drawLine(1040, 320, 1060, 320);
	g.drawLine(1040, 340, 1060, 340);
	g.drawLine(1040, 360, 1060, 360);
	g.drawLine(1040, 380, 1060, 380);
	g.drawLine(1040, 400, 1060, 400);
	g.drawLine(1040, 420, 1060, 420);
	g.drawLine(1040, 440, 1060, 440);
	g.drawLine(1040, 460, 1060, 460);
	g.drawLine(1040, 480, 1060, 480);
	g.drawLine(1040, 500, 1060, 500);
	g.drawLine(1040, 520, 1060, 520);
	g.drawLine(1040, 540, 1060, 540);
	g.drawLine(1040, 560, 1060, 560);
	g.drawLine(1040, 580, 1060, 580);
	g.drawLine(1040, 600, 1060, 600);
	g.drawLine(1040, 620, 1060, 620);
	g.drawLine(1040, 640, 1060, 640);
	
	g.drawLine(1040, 0, 1040, 720);
	g.drawLine(1060, 0, 1060, 720);
	g.drawLine(0, 660, 1080, 660);
	g.drawLine(0, 680, 1080, 680);
	g.drawLine(20, 0, 20, 720);

	//startne pozicije
		//lijevo gore
	g.drawLine(50, 50, 90, 50);
	g.drawLine(50, 70, 90, 70);
	g.drawLine(50, 90, 90, 90);
	
	g.drawLine(50, 50, 50, 90);
	g.drawLine(70, 50, 70, 90);
	g.drawLine(90, 50, 90, 90);
	
		//lijevo dole
	
	g.drawLine(50, 590, 90, 590);
	g.drawLine(50, 610, 90, 610);
	g.drawLine(50, 630, 90, 630);
	
	g.drawLine(50, 590, 50, 630);
	g.drawLine(70, 590, 70, 630);
	g.drawLine(90, 590, 90, 630);
	
		//desno gore
	g.drawLine(970, 50, 1010, 50);
	g.drawLine(970, 70, 1010, 70);
	g.drawLine(970, 90, 1010, 90);
		
	g.drawLine(970, 50, 970, 90);
	g.drawLine(990, 50, 990, 90);
	g.drawLine(1010, 50, 1010, 90);
		
		//desno dole
		
	g.drawLine(970, 590, 1010, 590);
	g.drawLine(970, 610, 1010, 610);
	g.drawLine(970, 630, 1010, 630);
		
	g.drawLine(970, 590, 970, 630);
	g.drawLine(990, 590, 990, 630);
	g.drawLine(1010, 590, 1010, 630);
	
	}
	
//	@Override
//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		paint(g);
//	}

}
