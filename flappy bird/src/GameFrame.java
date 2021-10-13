import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){
		
		
		add(new GamePlay());
		setVisible(true);
		setSize(800,500);
		setResizable(false);
	}

}
