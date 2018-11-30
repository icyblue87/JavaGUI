package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
@SuppressWarnings("serial")
public class Windmill extends JFrame {

	public static void main(String[] args) throws IOException {
		new Windmill();
	}

	public Windmill() {
		setTitle("Windmill");
		setSize(1000, 1000);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) (g);
		g2.draw(new Ellipse2D.Double(100, 100, 100, 100));
		g2.setColor(Color.BLUE);
		g2.fill(new Ellipse2D.Double(100, 100, 100, 100));
		g2.draw(new Arc2D.Double(100, 100, 100, 100, 0, 45, Arc2D.PIE));
		g2.draw(new Arc2D.Double(100, 100, 100, 100, 90, 45, Arc2D.PIE));
		g2.draw(new Arc2D.Double(100, 100, 100, 100, 180, 45, Arc2D.PIE));
		g2.draw(new Arc2D.Double(100, 100, 100, 100, 270, 45, Arc2D.PIE));
		g2.setPaint(Color.GREEN);
		g2.fill(new Arc2D.Double(100, 100, 100, 100, 0, 45, Arc2D.PIE));
		g2.fill(new Arc2D.Double(100, 100, 100, 100, 90, 45, Arc2D.PIE));
		g2.fill(new Arc2D.Double(100, 100, 100, 100, 180, 45, Arc2D.PIE));
		g2.fill(new Arc2D.Double(100, 100, 100, 100, 270, 45, Arc2D.PIE));
	}
}
