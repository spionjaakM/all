import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ReadFile extends JFrame{
	
	JTextField addresBar;
	JEditorPane display;
	
	public ReadFile() {
		super("SPIONJAAAKM BROWSER");
		
		addresBar = new JTextField("enter a URL");
		addresBar.addActionListener(
			(ActionListener) new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					loadCrap(event.getActionCommand());
				}

				private void loadCrap(String actionCommand) {
					// TODO Auto-generated method stub
					
				}
			}
		);
	}
	

}
