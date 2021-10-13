import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	
	
	GameFrame(){
		
		setSize(1080,720);
		setVisible(true);
		setBackground(Color.black);
		setResizable(false);
		add(new GamePanel());
		
		
	}

}
