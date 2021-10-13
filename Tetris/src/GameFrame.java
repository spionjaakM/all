import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setSize(337,700);
		add(new GamePlay());
	}

}
