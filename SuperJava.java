package GUI;

import java.awt.Dimension;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class SuperJava extends JFrame {

	public static void main(String[] args) throws IOException {
		new SuperJava();
	}

	public SuperJava() throws IOException {
		Dimension d = new Dimension(300, 300);
		setSize(1000, 1000);
		setVisible(true);
		JPanel Panel = new JPanel();
		JLabel label = new JLabel();
		ImageIcon image = new ImageIcon(ImageIO.read(SuperJava.class.getResourceAsStream("/dices.png")));
		label.setSize(d);
		label.setLocation(200, 200);
		label.setIcon(image);
		label.setOpaque(true);
		Panel.add(label);
		setContentPane(label);
		// pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
