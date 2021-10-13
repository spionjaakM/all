import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;

public class GamePlay extends JPanel implements ActionListener{
	
	Graphics g;
	Random random = new Random();
	int tijelo;
	
	boolean[][] Tijelo = {{false,false,false},
            		  {false,false,false},
            		  {false,false,false}};
	
	
	GamePlay(){
		
		
		
	}
	
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		Tijelo[0][0] = true;
		
	}
	
	public void stvaranjeOblika() {
//		while(tijelo==0) tijelo = random.nextInt(1);
		
		
		
			
			
		
		
	}
	
public void paint(Graphics g) {
		
	System.out.println(Tijelo[0][0]);
		g.setColor(Color.gray);
		g.fillRect(0, 0, 350, 700);
		g.setColor(Color.red);
		for(int i = 0; i<=330;i+=20) {
//			g.drawString(String.valueOf(i), i, 250);
			g.drawLine(i, 0, i, 700);
		}
		
		for(int i = 0; i<=700;i+=20) {
//			g.drawString(String.valueOf(i), 175, i);
			g.drawLine(0, i, 330, i);
		}
		
		g.setColor(Color.gray);
		g.fillRect(0, 0, 350, 40);
		
		
		g.setColor(Color.red);
		
//		for(int i = 0; i < 700; i+=10) {
//			if(Tijelo[0][0]) {
				g.fillRect(120, 40, 20, 20);
				
//			}
			
			
//		}
		
			repaint();
		
	}

}
