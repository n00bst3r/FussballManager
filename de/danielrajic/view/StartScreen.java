package de.danielrajic.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartScreen {
	private JFrame frame;
	private JPanel backgroundPanel;
	
	public void intitialize(){
		frame = new JFrame("Fuﬂballmanager v1.0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 720);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		StartScreen start = new StartScreen();
		start.intitialize();
		
		

	}

}
