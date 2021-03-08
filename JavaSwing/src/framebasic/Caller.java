package framebasic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/*
 * 14-(Caller Part) Program to demonstrate JFrame calling Another JFrame in Java Swing.
*/

public class Caller {

	public static void main(String[] args) {
		
		new Frame();

	}

}

class Frame  extends JFrame implements ActionListener {
	
	int i = 0;
	JProgressBar p;
	JButton b;
	Timer t;
	
	public Frame() {
		
		//We are adding a progress bar also
		p = new JProgressBar(0, 20);
		
		int i = 0;
		
		t = new Timer(500, this);	/* 't' is a timer which will perform its event after 500 ms
					this is the object of ActionListener which which call actionPerformed() after every 500 ms
					initially the value of i is 0, so it will increment i's value and when i's value becomes 20 (which is our 
					JProgressBar's step value) it will perform the code written in if() { ... } */
		
		b = new JButton("click");
		
		add(b);
		add(p);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				t.start();
				
			}
			
		});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(i == 20) {
			t.stop();	//Stop timer, other wise it will run in background
			new FrameCallingFrame(); //Terminate this frame.
			//System.exit(); will close all the frames.
			dispose();
		}
		i++;
		System.out.println(i);
		p.setValue(i);
	}
	
}