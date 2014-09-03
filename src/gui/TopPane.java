package gui;
import java.awt.FlowLayout; 
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Creates and draws logo and instructions
 */

public class TopPane extends JPanel {
	
	private static final long serialVersionUID = -6829988544381790419L;

	public TopPane(){
		setLayout(new FlowLayout());
	}
	
	public void paintComponent(Graphics g){
		try{
			System.out.println("Hey, I tried!");
			// Create and draw logo
			String filename = "logo.jpg";
			Image image = ImageIO.read(new File(filename));
			g.drawImage(image, 45, -10, null);
		
			// Put instructions into strings.
			String intro = "Program by Matthew Page\n";
			String intro2 =	"The purpose of this program is to make the process of creating a solution";
			String intro3 = "less painful by performing the calculations for how much solute needs to be\n";
			String intro4 = "added to the solvent.  Miscellanious additional information will also be provided.\n";
			String intro5 = "\n";
			String intro6 = "Please enter infromation in the following format:\n";
			String intro7 = "<volume> <molarity> <compound>\n";
			String intro8 = "For example:";
			String intro9 = "5mL 5M H2SO4";
			
			//Draw instructions onto pane
			g.drawString(intro, 30, 70);
			g.drawString(intro2, 30, 95);
			g.drawString(intro3, 30, 110);
			g.drawString(intro4, 30, 125);
			g.drawString(intro5, 30, 140);
			g.drawString(intro6, 30, 155);
			g.drawString(intro7, 30, 170);
			g.drawString(intro8, 30, 195);
			g.drawString(intro9, 30, 210);
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Program Error: Terminate.");
		}
	}
}