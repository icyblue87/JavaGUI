package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class frog extends Rectangle {

	public frog(int x0, int y0, int width0, int height0) {
		super(x0, y0, width0, height0);
	}

	void down() {
		y += 40;
	}

	void up() {
		y -= 40;
	}

	void left() {
		x -= 40;
	}

	void right() {
		x += 40;
	}

	void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) (g);
		g2.setColor(Color.RED);
		g2.fillOval(x, y, width, height);
	}
}
