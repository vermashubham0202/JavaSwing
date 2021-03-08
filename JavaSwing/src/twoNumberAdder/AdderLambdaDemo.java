package twoNumberAdder;
/*
 * 07-Program to add two numbers using Java Swing and ActionListener with Lambda expression.
*/ 

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdderLambdaDemo {

	public static void main(String[] args) {
		new AdderL();

	}

}

class AdderL extends JFrame {
	
	JTextField t1, t2;
	JLabel l;
	JButton b;
	
	public AdderL() {
		
		//Text fields to take user's input
		t1 = new JTextField(5);
		t2 = new JTextField(5);
		
		//Label to print result
		l = new JLabel("Sum : ");
		
		//Button for addition
		b = new JButton("Add");
		
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		//Lambda expression : works on Functional Interface (interface with only one method declaration)
		b.addActionListener(/*(ActionEvent*/ arg0 /*)*/ -> {
				
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				
				//Adding numbers
				int sum = num1 + num2;
				
				//Setting text to label
				l.setText("Sum : " + sum);
			});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}