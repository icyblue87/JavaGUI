package GUI;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
public class JavaGui {

	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame("Test Frame 1");
		MyFrame frame2 = new MyFrame("Frame with label");
		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame2.setSize(300, 200);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

class MyFrame extends JFrame {
//	public void paint(Graphics g) {
//		g.drawString("A MyFrame object", 20, 50);
//	}
	MyFrame(String title) {
		super(title);
		JLabel aLabel = new JLabel("Hello World!");
		this.getContentPane().add(aLabel);
	}
}
