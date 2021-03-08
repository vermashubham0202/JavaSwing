package framebasic;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 02-Program to create a frame and adding a two labels (texts) on it.
*/

public class SwingLabelDemo {

	public static void main(String[] args) {
		
		new Frame2();

	}

}

class Frame2 extends JFrame {
	public Frame2() {
		
		JLabel l1 = new JLabel("Hello World!");
		JLabel l2 = new JLabel("Shubham");
		add(l1);
		add(l2);
		
		//By default JLabel follows Card-Layout
		//(like we can see only top of card stack)
		//Some of the options with setLayout() method -> FlowLayout, GridLayout, Null
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
	}
}