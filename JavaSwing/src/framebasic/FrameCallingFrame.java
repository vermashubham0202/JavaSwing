package framebasic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * 14-(Called Part) Program to demonstrate JFrame calling Another JFrame in Java Swing.
*/

class FrameCallingFrame extends JFrame implements ActionListener {
	JTextField t1, t2;
	JLabel l;
	JButton b;
	
	public FrameCallingFrame() {
		//Text fields to take user's input
		t1 = new JTextField(5);	//in JTextField brackets we have to mention text field size
		t2 = new JTextField(5);
		
		//Label to print result
		l = new JLabel("Sum : ");
		
		//We require a button (When it will be clicked we perform some action)
		b = new JButton("Add");
		
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		//Adding action listener to add button
		b.addActionListener(this); 	
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		
		//Adding numbers
		int sum = num1 + num2;
		
		//Setting text to label
		l.setText("Sum : " + sum);
	}
}