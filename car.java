package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class car extends Rectangle {
	int speed, direction;
	Color color;

	public car(int x, int y, int width, int height, int speed, int direction, Color color) {
		super(x, y, width, height);
		this.speed = speed;
		this.direction = direction;
		this.color = color;

	}

	void move() {

		if (direction == 1) {
			x += speed;
			if (x > 1029) {
				x = 0;
			}
		} else {
			x -= speed;
			if (x < -29) {
				x = 1000;
			}
		}
	}

	void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) (g);
		g2.setColor(color);
		g2.fill(new Rectangle(x, y, width, height));
	}
}
