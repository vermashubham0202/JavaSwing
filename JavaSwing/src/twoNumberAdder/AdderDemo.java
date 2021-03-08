package twoNumberAdder;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * 04-Program to add two numbers using Java Swing.
*/


public class AdderDemo {

	public static void main(String[] args) {
		Frame obj = new Frame();
	}

}

class Frame extends JFrame implements ActionListener{
	
	JTextField t1, t2;
	JLabel l;
	JButton b;
	
	public Frame() {
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
		b.addActionListener(this); 	//'this' is an object of our class Frame and also an
									//object of ActionListner.
									//Because our class is a child class of ActionListner so
									//our class's objects indirectly becomes object of ActionListner
		//Remember we can create reference of super class and object of child class.
		
		/*addActionListener() require an object of ActionListener
		 * but ActionListener is an interface.
		 * So, we can either search for a class which implements ActionListener
		 * or we need to create our own class which implements ActionListener.
		*/
		
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