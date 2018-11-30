package GUI;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class FourLabels extends JFrame {

	public static void main(String[] args) {
		new FourLabels();
	}

	public FourLabels() {
		Dimension d = new Dimension(80, 20);
		JPanel Panel = new JPanel();
		setSize(1000, 1000);
		setContentPane(Panel);
		JLabel red = new JLabel();
		red.setBackground(Color.RED);
		red.setOpaque(true);
		red.setSize(d);
		red.setText("Red Label");
		red.setLocation(100, 40);
		red.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel blue = new JLabel();
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);
		blue.setSize(d);
		blue.setText("Blue Label");
		blue.setLocation(200, 40);
		blue.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel yellow = new JLabel();
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		yellow.setSize(d);
		yellow.setText("Yellow Label");
		yellow.setLocation(100, 80);
		yellow.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel green = new JLabel();
		green.setBackground(Color.GREEN);
		green.setOpaque(true);
		green.setSize(d);
		green.setText("Green Label");
		green.setLocation(200, 80);
		green.setHorizontalAlignment(SwingConstants.CENTER);
		// left right
		// up down
		red.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		blue.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		yellow.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		green.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Panel.add(green);
		Panel.add(yellow);
		Panel.add(blue);
		Panel.add(red);
		setVisible(true);
	}
}
