import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	int border,contact,grid,rGlavaBoja,gGlavaBoja,bGlavaBoja,rTijeloBoja,gTijeloBoja,bTijeloBoja,glavaRGB,tijeloRGB;
	
	GameFrame(int border,int contact,int grid,int rGlavaBoja,int gGlavaBoja,int bGlavaBoja,int rTijeloBoja,int gTijeloBoja,int bTijeloBoja,int glavaRGB,int tijeloRGB){
		this.border = border;
		this.contact = contact;
		this.grid = grid;
		this.glavaRGB = glavaRGB;
		this.tijeloRGB = tijeloRGB;
		this.rGlavaBoja = rGlavaBoja;
		this.gGlavaBoja = gGlavaBoja;
		this.bGlavaBoja = bGlavaBoja;
		this.rTijeloBoja = rTijeloBoja;
		this.gTijeloBoja = gTijeloBoja;
		this.bTijeloBoja = bTijeloBoja;
		
		this.add(new GamePanel(border,contact,grid,rGlavaBoja,gGlavaBoja,bGlavaBoja,rTijeloBoja,gTijeloBoja,bTijeloBoja,glavaRGB,tijeloRGB));
		this.pack();
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	

}
