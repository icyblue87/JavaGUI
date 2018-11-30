package GUI;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
@SuppressWarnings("serial")
public class Bee extends Rectangle {
	ImageIcon img;

	public Bee(int x, int y, int width, int height, ImageIcon img) {
		super(x, y, width, height);
		this.img = img;
	}

	public void move(int xClick, int yClick) {
		int changeX = xClick - x;
		int changeY = yClick - y;
		while (x != changeX && y != changeY) {
			x += 1;
			y += 1;
		}
	}
}
