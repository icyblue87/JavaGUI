package GUI;

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
public class CombinationLock extends JFrame implements ActionListener {
	public static void main(String[] args) throws IOException {
		new CombinationLock();
	}

	int a, b, c;

	public CombinationLock() {
		Dimension d = new Dimension(100, 100);
		setSize(1000, 1000);
		setVisible(true);
		setTitle("Combination");
		Random rand = new Random();
		a = rand.nextInt(9);
		b = rand.nextInt(9);
		c = rand.nextInt(9);
		System.out.println(a + " " + b + " " + c);
		if (b == a) {
			b = rand.nextInt(9);
		}
		if (c == b) {
			c = rand.nextInt(9);
		}
		JPanel Panel = new JPanel();
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		zero.setLocation(100, 100);
		zero.setSize(d);
		one.setSize(d);
		two.setSize(d);
		three.setSize(d);
		four.setSize(d);
		five.setSize(d);
		six.setSize(d);
		seven.setSize(d);
		eight.setSize(d);
		nine.setSize(d);
		Panel.add(zero);
		Panel.add(one);
		Panel.add(two);
		Panel.add(three);
		Panel.add(four);
		Panel.add(five);
		Panel.add(six);
		Panel.add(seven);
		Panel.add(eight);
		Panel.add(nine);
		zero.addActionListener(this);
		zero.setActionCommand("0");
		one.addActionListener(this);
		one.setActionCommand("1");
		two.addActionListener(this);
		two.setActionCommand("2");
		three.addActionListener(this);
		three.setActionCommand("3");
		four.addActionListener(this);
		four.setActionCommand("4");
		five.addActionListener(this);
		five.setActionCommand("5");
		six.addActionListener(this);
		six.setActionCommand("6");
		seven.addActionListener(this);
		seven.setActionCommand("7");
		eight.addActionListener(this);
		eight.setActionCommand("8");
		nine.addActionListener(this);
		nine.setActionCommand("9");
		zero.setOpaque(true);
		one.setOpaque(true);
		two.setOpaque(true);
		three.setOpaque(true);
		four.setOpaque(true);
		five.setOpaque(true);
		six.setOpaque(true);
		seven.setOpaque(true);
		eight.setOpaque(true);
		nine.setOpaque(true);
		getContentPane().add(Panel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (Integer.parseInt(e.getActionCommand()) == a) {
			if (Integer.parseInt(e.getActionCommand()) == b) {
				if (Integer.parseInt(e.getActionCommand()) == c) {
					JOptionPane.showMessageDialog(new CombinationLock(), "Unlocked", "Nice",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		} else {
			JOptionPane.showMessageDialog(new CombinationLock(), "Wrong.", "Bad", JOptionPane.WARNING_MESSAGE);
		}
	}
}
