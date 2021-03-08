package adderSubtractor;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * 09-Program to add or subtract two numbers using Java Swing and Lambda expression.
*/

public class AddSubLambdaDemo {

	public static void main(String[] args) {
		
		new AddSubLambFrame();

	}

}

class AddSubLambFrame extends JFrame {
	
	JTextField field1, field2;
	JLabel label;
	JButton add, sub;
	
	public AddSubLambFrame() {
		field1 = new JTextField(5);
		field2 = new JTextField(5);
		label = new JLabel("Result : ");
		add = new JButton("Add");
		sub = new JButton("Sub");
		
		add(field1);
		add(field2);
		add(label);
		add(add);
		add(sub);
		
		//Using Anonymous object
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				int num1 = Integer.parseInt(field1.getText());
				int num2 = Integer.parseInt(field2.getText());
				
				int result = num1 + num2;
				
				label.setText("Result : " + result);
			
			}
		});
		
		//Using Lambda expression
		sub.addActionListener(ae -> {
			
			int num1 = Integer.parseInt(field1.getText());
			int num2 = Integer.parseInt(field2.getText());
			
			int result = num1 - num2;
			
			label.setText("Result : " + result);
			
		});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(120, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}