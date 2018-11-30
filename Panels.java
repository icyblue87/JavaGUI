package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Panels extends JFrame {

	public static void main(String[] args) throws IOException {
		new Panels();
	}

	public Panels() {
		Dimension d = new Dimension(55, 20);
		JLabel label = new JLabel();
		label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		label.setText("MonkaS");
		label.setOpaque(true);
		label.setSize(d);
		System.out.println(label.size());
		label.setBackground(Color.CYAN);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(label);
		setContentPane(panel);
		setSize(300, 200);
		setTitle("My First JPanel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
