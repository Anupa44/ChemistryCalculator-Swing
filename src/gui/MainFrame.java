package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * Creates the main frame that the user interacts with.
 */

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	public MainFrame(){
		
		// Set frame properties
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Chemistry Lab Assistant");
		setSize(550, 300);
		
		// Create the pane with the logo and instructions
		TopPane topPane = new TopPane();
		add(topPane);
		
		// Create the pane where the user inputs data
		InputPane inputPane = new InputPane();
		add(inputPane, BorderLayout.SOUTH);
	}
}