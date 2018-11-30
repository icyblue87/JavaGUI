package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ExpandShrinkButtons extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		new ExpandShrinkButtons();
	}

	int x = 1000;
	int y = 1000;
	JPanel Panel;

	public ExpandShrinkButtons() {
		Dimension d = new Dimension(200, 200);
		setSize(x, y);
		setVisible(true);
		setTitle("Expand and Shrink");
		Panel = new JPanel();
		JButton expand = new JButton("Expand");
		JButton shrink = new JButton("Shrink");
		Panel.add(expand);
		Panel.add(shrink);
		expand.setSize(d);
		shrink.setSize(d);
		expand.setLocation(100, 100);
		shrink.setLocation(400, 100);
		expand.setOpaque(true);
		shrink.setOpaque(true);
		expand.addActionListener(this);
		shrink.addActionListener(this);
		expand.setActionCommand("expand");
		shrink.setActionCommand("shrink");
		getContentPane().add(Panel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("expand")) {
//			x += (int) Math.ceil(x * 0.1);
//          y += (int) Math.ceil(y * 0.1);
			this.setSize((int) (this.getSize().width * 1.1), (int) (this.getSize().height * 1.1));
		} else {
//			x -= (int) Math.ceil(x * 0.1);
//			y -= (int) Math.ceil(y * 0.1);
			this.setSize((int) (this.getSize().width * 0.9), (int) (this.getSize().height * 0.9));
		}
	}
}
