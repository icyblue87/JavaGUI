package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class ThreeButtonMonty extends JFrame implements ActionListener {
	public static void main(String[] args) throws IOException {
		new ThreeButtonMonty();
	}

	JButton Button1, Button2, Button3;

	public ThreeButtonMonty() {
		Random rand = new Random();
		int x = rand.nextInt(3) + 1;
		Dimension d = new Dimension(200, 200);
		JPanel Panel = new JPanel();
		Button1 = new JButton("Button 1");
		Button2 = new JButton("Button 2");
		Button3 = new JButton("Button 3");
		setVisible(true);
		setSize(1000, 1000);
		if (x == 1) {
			Button1.addActionListener(this);
			Button1.setActionCommand("yes");
			Button2.addActionListener(this);
			Button1.setActionCommand("no");
			Button3.addActionListener(this);
			Button1.setActionCommand("no");
		}
		if (x == 2) {
			Button1.addActionListener(this);
			Button1.setActionCommand("no");
			Button2.addActionListener(this);
			Button2.setActionCommand("yes");
			Button3.addActionListener(this);
			Button3.setActionCommand("no");
		}
		if (x == 3) {
			Button1.addActionListener(this);
			Button1.setActionCommand("no");
			Button2.addActionListener(this);
			Button2.setActionCommand("no");
			Button3.addActionListener(this);
			Button3.setActionCommand("yes");
		}
		Button1.setSize(d);
		Button2.setSize(d);
		Button3.setSize(d);
		Button1.setOpaque(true);
		Button2.setOpaque(true);
		Button3.setOpaque(true);
		Panel.add(Button1);
		Panel.add(Button2);
		Panel.add(Button3);
		getContentPane().add(Panel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("yes")) {
			getContentPane().setBackground(Color.GREEN);
			repaint();
			JOptionPane.showMessageDialog(new ThreeButtonMonty(), "You win!", " ", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(new ThreeButtonMonty(), "You lose!", " ", JOptionPane.ERROR_MESSAGE);

		}
	}
}
