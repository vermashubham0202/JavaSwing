package mouse;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

/*
 * 13-Program to demonstrate MouseListener, MouseAdapter and MouseEvent.
*/

public class MouseDemo {

	public static void main(String[] args) {
		
		new Mouse();

	}

}

class Mouse extends JFrame {
	
	public Mouse() {
		
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int xPosition = e.getX();
				int yPosition = e.getY();
				System.out.println("(" + xPosition + ", " + yPosition + ")");
			}
		});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}