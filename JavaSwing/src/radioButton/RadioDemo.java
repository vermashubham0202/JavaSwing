package radioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * 10-Program to demonstrate JRadioButton.
 * -> In below example we will ask user's gender using radio button.
*/

public class RadioDemo {

	public static void main(String[] args) {
		new Radio();
	}

}

class Radio extends JFrame implements ActionListener{
	
	JTextField t;
	JButton b;
	JRadioButton rm, rf;
	JLabel l;
	
	public Radio() {
		
		t = new JTextField(15);
		b = new JButton("Ok");
		rm = new JRadioButton("Male");
		rf = new JRadioButton("Female");
		l = new JLabel("Greeting");
		
		//Grouping radio button (Logical group)
		ButtonGroup bg = new ButtonGroup();
		bg.add(rm);
		bg.add(rf);
		
		add(t);
		add(rm);
		add(rf);
		add(b);
		add(l);
		
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String name = t.getText();
		if(rm.isSelected()) {
			name = "Mr. " + name;
		} else {
			name = "Ms. " + name;
		}
		
		l.setText(name);
	}
	
}