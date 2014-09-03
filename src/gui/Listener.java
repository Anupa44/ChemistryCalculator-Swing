package gui;
import javax.swing.JOptionPane; 

import engine.Beginning;

/**
 * Creates output from user input
 */
public class Listener {
	public static void calc(String input){
		try{
			String output = "" + Beginning.analyze(input);
			JOptionPane.showMessageDialog(null, output);
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "ERROR:  Input Invalid\n or Program Failed");
		}
	}
}
