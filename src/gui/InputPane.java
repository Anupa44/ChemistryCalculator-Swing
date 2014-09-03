package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Creates the area where the user provides input
 */

@SuppressWarnings("serial")
public class InputPane extends JPanel {
	public InputPane(){
		// Text field
		final JTextField text = new JTextField(35);
		add(text);
		text.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        Listener.calc(text.getText());
		    }
		});
		
		// Button
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Listener.calc(text.getText());
			}
		});
		add(submit);
	}
}