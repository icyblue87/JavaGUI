package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class ClicketyClick extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		new ClicketyClick();
	}

	JButton Button;

	public ClicketyClick() {
		Dimension d = new Dimension(200, 200);
		Button = new JButton("Click Me!");
		setVisible(true);
		setSize(1000, 1000);
		Button.setBounds(200, 200, 200, 200);
		Button.setPreferredSize(d);
		Button.setOpaque(true);
		Button.addActionListener(this);
		getContentPane().setLayout(new FlowLayout());
		setTitle("My Second Button");
		getContentPane().add(Button);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public int clicked = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		clicked++;
		if (clicked == 10) {
			JOptionPane.showMessageDialog(new ClicketyClick(), "You are out of clicks.", "Click Overflow!",
					JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
		Button.setText(clicked + " clicks so far.");
	}
}
