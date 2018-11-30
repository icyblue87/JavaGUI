package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class GuessingGame extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		new GuessingGame();
	}

	int x;
	JTextField TextCorrect, Text;
	int count;

	public GuessingGame() {
		Text = new JTextField(10);
		JLabel label = new JLabel("Enter a number between (1-5):");
		count = 3;
		TextCorrect = new JTextField(20);
		Random rand = new Random();
		x = rand.nextInt(5) + 1;
		setVisible(true);
		setSize(1000, 1000);
		Text.addActionListener(this);
		JPanel Panel = new JPanel();
		Panel.setVisible(true);
		getContentPane().setLayout(new FlowLayout());
		Panel.add(label);
		Panel.add(Text);
		Panel.add(TextCorrect);
		getContentPane().add(Panel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	String copyText() {
		String name = Text.getText();
		return name;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (x == Integer.parseInt(copyText())) {
				JOptionPane.showMessageDialog(new GuessingGame(), "You guessed correctly!", "Win",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			} else {
				count--;
				TextCorrect.setText("Wrong answer. You have " + count + " more tries.");
				Text.setText("");
				if (count == 0) {
					JOptionPane.showMessageDialog(new GuessingGame(), "You lost.", "Lose",
							JOptionPane.QUESTION_MESSAGE);
				}
			}
		} catch (NumberFormatException z) {
			JOptionPane.showMessageDialog(new GuessingGame(), "Incorrect Input", "Wrong.", JOptionPane.ERROR_MESSAGE);
			Text.setText("");
		}
	}
}
