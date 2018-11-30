package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class ColorCycles extends JFrame implements ActionListener {
	public static void main(String[] args) throws IOException {
		new ColorCycles();
	}

	JButton Button;

	public ColorCycles() {
		JPanel Panel = new JPanel();
		Button = new JButton("Click");
		setTitle("Change Background");
		setVisible(true);
		setSize(1000, 1000);
		Button.setOpaque(true);
		Button.addActionListener(this);
		Button.setActionCommand("1");
		Button.setSize(300, 300);
		Button.setLocation(200, 200);
		Panel.add(Button);
		getContentPane().add(Panel);
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("1")) {
			getContentPane().setBackground(Color.RED);
			Button.setActionCommand("2");
		}
		if (e.getActionCommand().equals("2")) {
			getContentPane().setBackground(Color.YELLOW);
			Button.setActionCommand("3");
		}
		if (e.getActionCommand().equals("3")) {
			getContentPane().setBackground(Color.GREEN);
			Button.setActionCommand("4");
		}
		if (e.getActionCommand().equals("4")) {
			getContentPane().setBackground(Color.BLUE);
			Button.setActionCommand("1");
		}
		repaint();
	}
}
