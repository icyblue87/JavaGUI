package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
@SuppressWarnings("serial")
public class cardgame extends JFrame implements ActionListener {
	JButton Deal;
	JLabel name1, name2, amount, c1, c2;
	Card A, B;
	DeckofCards d;
	int cards;

	public static void main(String[] args) throws IOException {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new cardgame();
			}
		});
	}

	public cardgame() {
		setSize(1000, 1000);
		Dimension ddd = new Dimension(50, 100);
		Dimension dd = new Dimension(70, 100);
		d = new DeckofCards(true);
		setTitle("Deck of Cards");
		cards = 52;
		Deal = new JButton("DEAL");
		name1 = new JLabel("Nothing");
		name2 = new JLabel("Nothing");
		amount = new JLabel(cards + " cards left in the deck.");
		JPanel LeftT = new JPanel();
		JPanel RightT = new JPanel();
		JPanel Seperate = new JPanel();
		Seperate.setSize(dd);
		Seperate.setMinimumSize(ddd);
		Seperate.setMaximumSize(dd);
		Seperate.setPreferredSize(dd);
		Card A = new Card();
		Card B = new Card();
		ImageIcon Card1 = A.getImage();
		ImageIcon Card2 = B.getImage();
		c1 = new JLabel();
		c1.setIcon(Card1);
		c2 = new JLabel();
		c2.setIcon(Card2);
		LeftT.setLayout(new BoxLayout(LeftT, BoxLayout.Y_AXIS));
		RightT.setLayout(new BoxLayout(RightT, BoxLayout.Y_AXIS));
		LeftT.setOpaque(true);
		RightT.setOpaque(true);
		JPanel Top = new JPanel();
		Top.setOpaque(true);
		LeftT.add(c1);
		LeftT.add(name1);
		RightT.add(c2);
		RightT.add(name2);
		Top.add(LeftT);
		Top.add(Seperate);
		Top.add(RightT);
		JPanel Bottom = new JPanel();
		Bottom.setOpaque(true);
		Bottom.add(Deal);
		Bottom.add(amount);
		JPanel Large = new JPanel();
		Large.setOpaque(true);
		Large.add(Top);
		Large.add(Bottom);
		Large.setLayout(new BoxLayout(Large, BoxLayout.Y_AXIS));
		Deal.addActionListener(this);
		Deal.setActionCommand("Deal");
		getContentPane().add(Large);
		pack();
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Deal")) {
			if (cards == 0) {
				JOptionPane.showMessageDialog(null, "Out of Cards :(", "No more cards!", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			A = d.dealCard();
			B = d.dealCard();
			c1.setIcon(A.getImage());
			c2.setIcon(B.getImage());
			String s = "<html>" + A.getName() + " of<br/>" + A.getSuit() + "</html>";
			String s1 = "<html>" + B.getName() + " of<br/>" + B.getSuit() + "</html>";
			name1.setText(s);
			name2.setText(s1);
			cards -= 2;
			amount.setText(cards + " cards left in the deck.");
			pack();
		}
	}
}
