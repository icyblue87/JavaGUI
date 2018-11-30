package GUI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;
public class MovingCar {
	public static void main(String[] args) {
		// when working with animation start the main program as
		// a separate thread. The code below creates the main frame
		// as a separate thread
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame.setDefaultLookAndFeelDecorated(true);
				JFrame window = new JFrame(); // creates a Frame named window
				window.setTitle("Moving Car");// sets the title for the frame
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setBounds(30, 30, 530, 330);
				window.getContentPane().add(new CarCanvas());
				window.setVisible(true);
			}
		});
	}
}

/* CarCanvas is the component that allows drawing shapes */
class CarCanvas extends JComponent {
	int x = 11;// var used to move the car
	Timer myTimer;// a Timer used to generate action events
	/* CarCanvas constructor is used to make a Timer object */

	public CarCanvas() {
		// A Timer object generates Action events ongoing.
		// If you code an event listener you can invoke certain
		// code ongoing. Here we call repaint() over and over again.
		myTimer = new Timer(2, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				repaint();
			}
		});
		myTimer.start();
	}

	/*
	 * The paint() method runs whenever we call repaint() We can use its parameter, the Graphics object to draw things on it.
	 */
	public void paint(Graphics graphics) {
		Graphics2D g = (Graphics2D) graphics;
		Color backgroundColor = new Color(252, 255, 214);
		g.setColor(backgroundColor);
		g.fillRect(0, 0, getWidth(), getHeight());
		// draw the car
		Color color = new Color(255, 0, 115);// red
		g.setColor(color);
		g.fillRect(x, 200, 100, 20);
		g.fillRect(x + 15, 170, 70, 40);
		// draw the wheels
		color = new Color(77, 66, 66);// black
		g.setColor(color);
		g.fillOval(x + 13, 215, 24, 24);
		g.fillOval(x + 63, 215, 24, 24);
		x = x + 2;
	}
}