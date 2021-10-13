import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TextEditor extends JFrame implements ActionListener{
	
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("File");
	JMenuItem exit = new JMenuItem("Exit & Save");
	JMenuItem saveAs = new JMenuItem("Save as...");
	JMenuItem save = new JMenuItem("Save");
	JMenuItem open = new JMenuItem("Open");
	
	FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File","txt");
	
	
	JFileChooser odabirFilea = new JFileChooser();
	File file;
	
	JFileChooser openFilea = new JFileChooser();
	File openFile;
	
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane;
	JSpinner spinner = new JSpinner();
	JComboBox fontStyle;
	JLabel fontLabel = new JLabel("Font: ");
	JButton colorButton = new JButton("COLOR");
	JButton boldButton = new JButton("BOLD");
	JButton italicButton = new JButton("ITALIC");
	
	String openText = "";
	
	
	
	Boolean bold = false;
	Boolean italic = false;
	
	Boolean saveaniFile = false;
	

	
	
	
	
	TextEditor(){
		
		odabirFilea.setFileFilter(filter);
		odabirFilea.setSelectedFile(new File("Export - Text editor by spionjaakM"+".txt"));
		
		open.addActionListener(this);
		save.addActionListener(this);
		saveAs.addActionListener(this);
		exit.addActionListener(this);
		
		menu.add(open);
		menu.add(save);
		menu.add(saveAs);
		menu.add(exit);
		
		menuBar.add(menu);
		
			
		textArea.setFont(new Font("Ink Free",Font.PLAIN,20));
		textArea.setForeground(Color.black);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(450,400));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		spinner.setValue(20);
		spinner.addChangeListener(new ChangeListener() {

			   

			@Override
			public void stateChanged(ChangeEvent e) {
				if(bold&&italic) textArea.setFont(new Font(textArea.getFont().getFamily(),(Font.BOLD|Font.ITALIC),(int) spinner.getValue())); 
				else if(bold) textArea.setFont(new Font(textArea.getFont().getFamily(),(Font.BOLD),(int) spinner.getValue())); 
				else if(italic) textArea.setFont(new Font(textArea.getFont().getFamily(),(Font.ITALIC),(int) spinner.getValue())); 
				else textArea.setFont(new Font(textArea.getFont().getFamily(),(Font.PLAIN),(int) spinner.getValue())); 
				
			}
			   
			  });
		
		colorButton.setFocusable(false);
		colorButton.addActionListener(this);
		
		String[] dostupniFontovi = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		fontStyle = new JComboBox(dostupniFontovi);
		fontStyle.addActionListener(this);
		fontStyle.setSelectedItem("Ink Free");
		
		boldButton.addActionListener(this);
		boldButton.setFocusable(false);
		
		italicButton.addActionListener(this);
		italicButton.setFocusable(false);
		
		this.setJMenuBar(menuBar);
		
		this.add(fontLabel);
		this.add(spinner);
		this.add(colorButton);
		this.add(fontStyle);
		this.add(boldButton);
		this.add(italicButton);
		
		this.add(scrollPane);
		
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setTitle("Text editor by spionjaakM");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==colorButton) {
			JColorChooser colorChoose = new JColorChooser(); 

			 Color color = colorChoose.showDialog(null, "Choose a color", Color.black);
			 
			 textArea.setForeground(color);
			 
		}
		
		if(e.getSource()==fontStyle) {
			
			if(bold&&italic) textArea.setFont(new Font((String) fontStyle.getSelectedItem(),(Font.BOLD|Font.ITALIC),textArea.getFont().getSize())); 
			else if(bold) textArea.setFont(new Font((String) fontStyle.getSelectedItem(),(Font.BOLD),textArea.getFont().getSize())); 
			else if(italic) textArea.setFont(new Font((String) fontStyle.getSelectedItem(),(Font.ITALIC),textArea.getFont().getSize())); 
			else textArea.setFont(new Font((String) fontStyle.getSelectedItem(),(Font.PLAIN),textArea.getFont().getSize())); 
		}
		
		if(e.getSource()==boldButton) {
			if(!bold) {
				bold=true;
				boldButton.setBackground(Color.green);
			}
			else if(bold) {
				bold=false;
				boldButton.setBackground(null);
			}
			
		}
		
		if(e.getSource()==italicButton) {
			if(!italic) {
				italic=true;
				italicButton.setBackground(Color.green);
			}
			else if(italic) {
				italic=false;
				italicButton.setBackground(null);
			}
		
			
		}
		
		if(bold&&italic) textArea.setFont(new Font(textArea.getFont().getFamily(),(Font.BOLD|Font.ITALIC),textArea.getFont().getSize())); 
		else if(bold) textArea.setFont(new Font(textArea.getFont().getFamily(),(Font.BOLD),textArea.getFont().getSize())); 
		else if(italic) textArea.setFont(new Font(textArea.getFont().getFamily(),(Font.ITALIC),textArea.getFont().getSize())); 
		else textArea.setFont(new Font(textArea.getFont().getFamily(),(Font.PLAIN),textArea.getFont().getSize())); 
		
		
		if(e.getSource()==exit) {
		
			
			
			
			
			
			
			
			
			if(!saveaniFile) {
				
				odabirFilea.showDialog(null,"Save");
				
				file = (odabirFilea.getSelectedFile());
				
				
				
				
				try {
					FileWriter writer = new FileWriter(file);
					writer.write(textArea.getText());
					writer.close();
					

					
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			
				saveaniFile = true;
				
				System.out.print("saveaniFile:");
				System.out.println(saveaniFile);
			}
				
				
				else {
					
					try {
						FileWriter writer = new FileWriter(file);
						writer.write(textArea.getText());
						writer.close();
						

						
						
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
				}
		
			System.exit(0);
			
			
		}
		
		if(e.getSource()== saveAs) {
			
			
			
			odabirFilea.showDialog(null,"Save");
			
			file = odabirFilea.getSelectedFile();
			
			
			
			
			try {
				FileWriter writer = new FileWriter(file);
				writer.write(textArea.getText());
				writer.close();
				

				
				
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		
			saveaniFile = true;
			
			System.out.print("saveaniFile:");
			System.out.println(saveaniFile);
		}
		
		
		if(e.getSource()== save) {
			
			if(!saveaniFile) {
			
			odabirFilea.showDialog(null,"Save");
			
			file = odabirFilea.getSelectedFile();
			
			
			
			
			try {
				FileWriter writer = new FileWriter(file);
				writer.write(textArea.getText());
				writer.close();
				

				
				
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		
			saveaniFile = true;
			
			System.out.print("saveaniFile:");
			System.out.println(saveaniFile);
		}
			
			
			else {
				
				try {
					FileWriter writer = new FileWriter(file);
					writer.write(textArea.getText());
					writer.close();
					

					
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		
		
	}
		
		
		
		if(e.getSource()==open) {
			
			openFilea.showDialog(null, "Open");
			openFile = openFilea.getSelectedFile();
			
			try {
				Scanner scanner = new Scanner(openFile);
				
				while(scanner.hasNextLine()) {
				
					openText = openText + scanner.nextLine()+"\n";
					
					
				}
				scanner.close();
				textArea.setText(openText);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		
		
	
	}
	

}
