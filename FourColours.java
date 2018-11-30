package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class FourColours extends JFrame implements ActionListener {
	public static void main(String[] args) throws IOException {
		new FourColours();
	}

	JButton Red;
	JButton Green;
	JButton Blue;
	JButton Yellow;

	public FourColours() {
		Red = new JButton("Red Button");
		Green = new JButton("Green Button");
		Blue = new JButton("Blue Button");
		Yellow = new JButton("Yellow Button");
		Red.setBackground(Color.RED);
		Green.setBackground(Color.GREEN);
		Blue.setBackground(Color.BLUE);
		Yellow.setBackground(Color.YELLOW);
		Red.setBorderPainted(false);
		Green.setBorderPainted(false);
		Blue.setBorderPainted(false);
		Yellow.setBorderPainted(false);
		setSize(1000, 1000);
		Dimension d = new Dimension(200, 200);
		setVisible(true);
		Red.setPreferredSize(d);
		Green.setPreferredSize(d);
		Yellow.setPreferredSize(d);
		Blue.setPreferredSize(d);
		JPanel Panel = new JPanel();
		getContentPane().add(Panel);
		getContentPane().setLayout(new FlowLayout());
		Red.setActionCommand("red");
		Green.setActionCommand("green");
		Blue.setActionCommand("blue");
		Yellow.setActionCommand("yellow");
		Panel.add(Red);
		Panel.add(Green);
		Panel.add(Blue);
		Panel.add(Yellow);
		Red.addActionListener(this);
		Green.addActionListener(this);
		Blue.addActionListener(this);
		Yellow.addActionListener(this);
		Red.setOpaque(true);
		Green.setOpaque(true);
		Blue.setOpaque(true);
		Yellow.setOpaque(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("red")) {
			getContentPane().setBackground(Color.RED);
		} else if (e.getActionCommand().equals("green")) {
			getContentPane().setBackground(Color.GREEN);
		} else if (e.getActionCommand().equals("blue")) {
			getContentPane().setBackground(Color.BLUE);
		} else if (e.getActionCommand().equals("yellow")) {
			getContentPane().setBackground(Color.YELLOW);
		}
		repaint();
	}
}
