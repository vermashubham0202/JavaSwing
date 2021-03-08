package adderSubtractor;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * 08-Program to add or subtract two numbers using Java Swing.
*/ 

public class AddSubDemo {

	public static void main(String[] args) {
		new AddSubFrame();
	}

}

class AddSubFrame extends JFrame implements ActionListener {
	
	JTextField field1, field2;
	JLabel label;
	JButton add, sub;
	
	public AddSubFrame() {
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
		
		add.addActionListener(this);
		sub.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(120, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		int num1 = Integer.parseInt(field1.getText());
		int num2 = Integer.parseInt(field2.getText());
		int result;
		
		if(arg0.getSource() == add) {
			result = num1 + num2;
		} else {
			result = num1 - num2;
		}
		
		label.setText("Result : " + result);
		
	}
}