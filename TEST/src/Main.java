import java.awt.Desktop;
import java.io.IOException;

import javax.swing.JOptionPane;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		
		String imeFilea;
		String auto;
		int i = 1;
		
		Desktop desktop = Desktop.getDesktop();
		
		imeFilea = JOptionPane.showInputDialog("Unesite zeljeno ime File-a");
		
		File file = new File("C:\\Users\\spionjaakM\\OneDrive\\Radna površina\\"+imeFilea+".txt");
		
		
		
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file);
		
		Scanner fileRead = new Scanner(file);
		
		auto = JOptionPane.showInputDialog("Unesite podatke o "+i+". vozilu: ");
		
		while(!auto.isBlank()) {
			
		if(!auto.isBlank()) {
			
			writer.write(i+". "+auto+"\n");
			i++;
			
		}
		
	
		
		
		auto = JOptionPane.showInputDialog("Unesite podatke o "+i+". vozilu, ako zelis ZAVRSITI unos podataka pritisni ENTER: ");
		
		}
		
		writer.close();
		
		JOptionPane.showMessageDialog(null, "Podaci su spremljeni u fileu "+file.getName()+" na lokaciji "+file.getPath());
		
		
		
		desktop.open(file);
		
		while(fileRead.hasNextLine()){
			String unosRead = fileRead.nextLine();
			System.out.println(unosRead);
		}
		
		
		
		
		

	}

}
