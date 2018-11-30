package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.WindowConstants;
@SuppressWarnings("serial")
public class Frogger extends JFrame {
	car[] car;
	Graphics g;
	JLabel label;
	BufferedImage bImage;
	ImageIcon img;
	frog frog;
	static int lives = 3;

	public static void main(String[] args) throws IOException {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Frogger();
			}
		});
	}

	public Frogger() {
		Random rand = new Random();
		setTitle("Frogger");
		setSize(1000, 1000);
		car = new car[16];
		frog = new frog(450, 900, 30, 30);
		for (int i = 0; i < 4; i++) {
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			Color col = new Color(r, g, b);
			car[i] = new car(i * 200, 320, 40, 30, 1, 2, col);
		}
		for (int i = 4; i < 8; i++) {
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			Color col = new Color(r, g, b);
			car[i] = new car((i - 4) * 200, 400, 40, 30, 1, 1, col);
		}
		for (int i = 8; i < 12; i++) {
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			Color col = new Color(r, g, b);
			car[i] = new car((i - 8) * 200, 620, 40, 30, 1, 2, col);
		}
		for (int i = 12; i < 16; i++) {
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			Color col = new Color(r, g, b);
			car[i] = new car((i - 12) * 200, 700, 40, 30, 1, 1, col);
		}
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					frog.down();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					frog.up();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					frog.left();
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					frog.right();
				}
			}
		});
		label = new JLabel();
		bImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
		g = bImage.getGraphics();
		g.setColor(new Color(255, 255, 255));
		g.fillRect(0, 0, getWidth(), getHeight());
		Timer myTimer;
		myTimer = new Timer(2, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawEverything(g);
			}
		});
		myTimer.start();
		img = new ImageIcon(bImage);
		label.setIcon(img);
		this.add(label);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void drawBackground() {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.GREEN);
		g2.fill(new Rectangle(0, 0, 1000, 1000));
		g2.setColor(Color.GRAY);
		g2.fill(new Rectangle(0, 600, 1000, 150));
		g2.setColor(Color.GRAY);
		g2.fill(new Rectangle(0, 300, 1000, 150));
		g2.setColor(Color.YELLOW);
		for (int i = 0; i <= 1000; i += 80) {
			g2.fill(new Rectangle(i, 672, 50, 10));
		}
		for (int i = 0; i <= 1000; i += 80) {
			g2.fill(new Rectangle(i, 372, 50, 10));
		}
		g2.setColor(Color.BLUE);
		g2.fill(new Arc2D.Double(0, -30, 1000, 100, 180, 180, Arc2D.CHORD));
	}

	public void drawEverything(Graphics g) {
		drawBackground();
		for (int i = 0; i < 16; i++) {
			car[i].move();
			car[i].draw(g);
			if (car[i].intersects(frog)) {
				lives--;
				if (lives == 0) {
					JOptionPane.showMessageDialog(null, "You Lost!", "F", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
				frog = new frog(450, 900, 30, 30);
				JOptionPane.showMessageDialog(null, "Lives left: " + lives, "You died!", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		frog.draw(g);
		img = new ImageIcon(bImage);
		label.setIcon(img);
		this.add(label);
		setVisible(true);
	}
}