package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseClick extends JFrame {
	Graphics g;
	BufferedImage bImage;
	JLabel label;
	ImageIcon iIcon;
	int lastx, lasty;

	public static void main(String[] args) throws IOException {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MouseClick window = new MouseClick();
			}
		});
	}

	public MouseClick() {
		setSize(1000, 1000);
		setTitle("Mouse Pressed");
		lastx = 0;
		lasty = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 30, 430, 430);
		label = new JLabel();
		bImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
		g = bImage.getGraphics();
		g.setColor(new Color(255, 255, 255));
		g.fillRect(0, 0, getWidth(), getHeight());
		iIcon = new ImageIcon(bImage);
		this.add(label);
		setVisible(true);
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Color color = new Color(255, 0, 0);
				g.setColor(color);
				g.drawLine(lastx, lasty, e.getX() - 3, e.getY() - 20);
				lastx = e.getX() - 3;
				lasty = e.getY() - 20;
				iIcon = new ImageIcon(bImage);
				label.setIcon(iIcon);
				label.repaint();
			}
		});
	}
}
