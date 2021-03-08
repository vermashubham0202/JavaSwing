package checkBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * 12-Program to demonstrate handling events on JCheckBox.
*/

public class CheckBoxDemo2 {

	public static void main(String[] args) {
		
		new CBox();

	}

}

class CBox extends JFrame implements ActionListener, ItemListener {

	JTextField t;
	JButton b;
	JCheckBox cmusic, cplay, cdance;
	JLabel l;
	
	public CBox() {
		
		t = new JTextField(15);
		b = new JButton("Ok");
		l = new JLabel(":)");
		cmusic = new JCheckBox("Music");
		cplay = new JCheckBox("Playing");
		cdance = new JCheckBox("Dance");
		
		add(t);
		add(cmusic);
		add(cplay);
		add(cdance);
		add(b);
		add(l);
		
		//Events on JCheckBox
		cmusic.addItemListener(this);
		
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(450, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String name = t.getText() + " likes";
		if(cmusic.isSelected()) {
			name = name + " music";
		}
		if(cplay.isSelected()) {
			name = name + " playing";
		}
		if(cdance.isSelected()) {
			name = name + " dance";
		}
		
		l.setText(name);
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		
		System.out.println("Atif");
		
	}
}