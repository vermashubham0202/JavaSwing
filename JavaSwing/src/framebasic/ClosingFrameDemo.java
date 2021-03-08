package framebasic;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 03-Program to enable our frame's close button while clicking on it.
*/

public class ClosingFrameDemo {

	public static void main(String[] args) {
		
		new Frame3();

	}

}

class Frame3 extends JFrame {
	public Frame3() {
		
		JLabel l  = new JLabel("Hello Akki!");
		add(l);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		/* To enable close button we have to use a 
		constant of JFrame class with below method. */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}