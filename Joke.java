package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Joke extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		new Joke();
	}

	JButton Button;
	JLabel label2, label;

	public Joke() {
		Dimension d = new Dimension(200, 200);
		label = new JLabel("Do you want to hear a joke?");
		Button = new JButton("Joke?");
		label2 = new JLabel();
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.CENTER);
		getContentPane().setLayout(fl);
		setVisible(true);
		setSize(1000, 1000);
		Button.setPreferredSize(d);
		Button.setOpaque(true);
		Button.addActionListener(this);
		setTitle("Joke Button");
		getContentPane().add(Button);
		getContentPane().add(label2);
		getContentPane().add(label);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label2.setText("You. LOL");
		label.setText(" ");
		Button.setText("Quit");
		Button.setActionCommand("Quit");
		if (e.getActionCommand().equals("Quit")) {
			JOptionPane.showMessageDialog(new Joke(), "Funny?", "Did you like the Joke?", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
	}
}
