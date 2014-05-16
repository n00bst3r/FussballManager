package de.danielrajic.view;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class StartMenu {
	
	private JFrame windowMain;
	
	public StartMenu(){
		windowMain = new JFrame("JFuﬂballmanager v1.0");
		windowMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowMain.setIconImage(Toolkit.getDefaultToolkit().getImage(StartScreen.class.getResource("/de/danielrajic/images/frame_icon.png")));
		windowMain.setExtendedState(JFrame.MAXIMIZED_BOTH);
		windowMain.setLocationRelativeTo(null);
		intitialize();
		windowMain.setVisible(true);
	}
	
	public void intitialize(){
		// TODO BackgroundPanel implementieren
	}

}
