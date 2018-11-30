package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;
@SuppressWarnings("serial")
public class WeightCalculator extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		new WeightCalculator();
	}

	public WeightCalculator() {
		setSize(1000, 1000);
		JPanel Top = new JPanel();
		JPanel PanelL = new JPanel();
		JPanel PanelR = new JPanel();
		PanelR.setLayout(new BoxLayout(PanelR, BoxLayout.Y_AXIS));
		PanelL.setLayout(new BoxLayout(PanelL, BoxLayout.Y_AXIS));
		JLabel gender = new JLabel("Your Gender:");
		JRadioButton Male = new JRadioButton("Male");
		JRadioButton Female = new JRadioButton("Female");
		ButtonGroup Gender = new ButtonGroup();
		JLabel Height = new JLabel("Your Height:");
		JRadioButton one = new JRadioButton("60 to 64 inches");
		JRadioButton two = new JRadioButton("65 to 69 inches");
		JRadioButton three = new JRadioButton("70 to 74 inches");
		JRadioButton four = new JRadioButton("75 to 79 inches");
		JRadioButton five = new JRadioButton("80 to 84 inches");
		ButtonGroup Heights = new ButtonGroup();
		JButton Ok = new JButton("Ok");
		Ok.addActionListener(this);
		Ok.setActionCommand("Ok");
		Heights.add(one);
		Heights.add(two);
		Heights.add(three);
		Heights.add(four);
		Heights.add(five);
		PanelR.add(Height);
		PanelR.add(one);
		PanelR.add(two);
		PanelR.add(three);
		PanelR.add(four);
		PanelR.add(five);
		PanelL.add(gender);
		Gender.add(Male);
		Gender.add(Female);
		PanelL.add(Male);
		PanelL.add(Female);
		Top.add(PanelL);
		Top.add(PanelR);
		getContentPane().add(Top);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Ok")) {

		}
	}
}
