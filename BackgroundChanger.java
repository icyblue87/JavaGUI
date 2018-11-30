package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BackgroundChanger extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		new BackgroundChanger();
	}

	boolean isRed;

	public BackgroundChanger() {
		Dimension d = new Dimension(300, 300);
		JButton bChange = new JButton("Click Me!");
		setSize(1000, 1000);
		setVisible(true);
		bChange.setLocation(200, 200);
		bChange.setOpaque(true);
		bChange.setSize(d);
		bChange.addActionListener(this);
		getContentPane().setLayout(new FlowLayout());
		setTitle("My First Button");
		getContentPane().add(bChange);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent evt) {
		if (isRed) {
			getContentPane().setBackground(Color.BLUE);
			isRed = false;
		} else {
			getContentPane().setBackground(Color.RED);
			isRed = true;
		}
		repaint();
	}
}
