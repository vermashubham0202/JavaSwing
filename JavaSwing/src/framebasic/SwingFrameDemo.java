package framebasic;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 01-Program to create a frame and adding a text on it.
*/

public class SwingFrameDemo {

	public static void main(String[] args) {
		new Frame1();
//		Frame1 obj = new Frame1();
//		obj.show(); this method is deprecated, now days we use setVisible
//		obj.setVisible(true);
//		obj.setSize(400, 400);
	}

}

class Frame1 extends JFrame {
	public Frame1() {
		JLabel label = new JLabel("Hello World!");
		add(label);
		setVisible(true);
		setSize(400, 400);
	}
}