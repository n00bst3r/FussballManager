package de.danielrajic.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 * @author Daniel 
 * Class for startteaser of the Managergame.
 *
 */
public class StartScreen {
	private JFrame frame;
	private JPanel backgroundPanel;
	private JButton startButton;
	private JPanel buttonPanel;
	private JLabel bildLabel;
	private JPanel bildPanel;
	/**
	 * method that initializes the startscreen.
	 */
	public void intitialize(){
		frame = new JFrame("JFußballmanager v1.0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 620);
		frame.setLocationRelativeTo(null);
		//Backgroundpanel: 
		backgroundPanel = new JPanel();
		backgroundPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		frame.add(backgroundPanel); 
		BoxLayout boxLayout = new BoxLayout(backgroundPanel, BoxLayout.Y_AXIS);
		backgroundPanel.setLayout(boxLayout);
		
		//BildLabel erstellen: 
		URL pic = StartScreen.class.getResource("/de/danielrajic/images/startTeaser.jpg");
		Icon startbild = new ImageIcon(pic);
		bildLabel = new JLabel(startbild);
		//BildPanel erstellen: 
		bildPanel = new JPanel();
		bildPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		//BildLabel in BildPanel:
		bildPanel.add(bildLabel);
		//BildPanel in BackgroundPanel: 
		backgroundPanel.add(bildPanel);
		//Button + ButtonPanel
		startButton = new JButton("Starte Spiel");
		startButton.setActionCommand("start");
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(startButton);
		backgroundPanel.add(buttonPanel);
		frame.setVisible(true);
		
	}
	/**
	 * 
	 * @author Daniel
	 * StartbuttonListener that links the startscreen to the main menu
	 *
	 */
	class StartbuttonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand()=="start"){
				frame.dispose();
				// TODO Objekt von Hauptmenü erstellen. 
			}
			
		}
	}

	public static void main(String[] args) {
		StartScreen start = new StartScreen();
		start.intitialize();
		
		

	}

}
