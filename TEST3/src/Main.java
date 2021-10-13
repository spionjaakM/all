import java.awt.Desktop;
import java.io.IOException;

import javax.swing.JOptionPane;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		
		
		
		
		
		File file = new File("C:\\Users\\spionjaakM\\OneDrive\\Radna površina\\test.txt");
		
		
		
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file);
		
		Scanner fileRead = new Scanner(file);
		
	
		writer.write("test1\n");
		writer.write("test2");
		
		writer.close();
		
		
		
		
		
	
		
	
			String unosRead = fileRead.nextLine();
			System.out.println(unosRead);
			String unosRead2 = fileRead.nextLine();
			System.out.println(unosRead2);
		
		
		
		
		

	}

}
