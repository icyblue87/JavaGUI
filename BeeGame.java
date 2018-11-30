package GUI;

import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BeeGame extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new BeeGame();
			}
		});
	}

	public BeeGame() {
		setTitle("Bee Game");
		setSize(1000, 650);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}
