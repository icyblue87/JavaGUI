package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
@SuppressWarnings("serial")
public class RBC extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		new RBC();
	}

	JTextField User;
	JPasswordField Pass;

	public RBC() throws IOException {
		Dimension d = new Dimension(200, 200);
		setSize(1000, 1000);
		setTitle("Royal Bank of Canada");
		JPanel Panel = new JPanel();
		JPanel PanelL = new JPanel();
		JPanel PanelR1 = new JPanel();
		JPanel PanelR2 = new JPanel();
		JPanel PanelR3 = new JPanel();
		JLabel Picture = new JLabel();
		JLabel Username = new JLabel("Username (Card Number):", JLabel.LEFT);
		JLabel Password = new JLabel("Password", JLabel.LEFT);
		User = new JTextField(10);
		Pass = new JPasswordField(10);
		JButton SignIn = new JButton("SIGN IN");
		JButton Exit = new JButton("EXIT");
		SignIn.addActionListener(this);
		Exit.addActionListener(this);
		SignIn.setActionCommand("SignIn");
		Exit.setActionCommand("Exit");
		ImageIcon image = new ImageIcon(ImageIO.read(RBC.class.getResourceAsStream("/RBC.jpg")));
		Picture.setIcon(image);
		Picture.setOpaque(true);
		PanelR1.add(Username);
		PanelR1.add(User);
		PanelR1.add(Password);
		PanelR1.add(Pass);
		PanelR1.setLayout(new BoxLayout(PanelR1, BoxLayout.Y_AXIS));
		PanelR2.setLayout(new FlowLayout());
		PanelR2.add(SignIn);
		PanelR2.add(Exit);
		PanelR3.setLayout(new BoxLayout(PanelR3, BoxLayout.Y_AXIS));
		PanelR3.add(PanelR1);
		PanelR3.add(PanelR2);
		PanelL.add(Picture);
		Panel.add(PanelL);
		Panel.add(PanelR3);
		this.add(Panel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	String copytext(int a) {
		if (a == 0) {
			String s = User.getText();
			return s;
		}
		String s = new String(Pass.getPassword());
		return s;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getActionCommand().equals("SignIn")) {
				String Username = copytext(0);
				String Password = copytext(1);
				if (Username.length() == 15 && Password.equals("Password")) {
					JOptionPane.showMessageDialog(new RBC(), "Successful Login", "Logged On", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(new RBC(), "Unsuccessful Login", "Error!", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				Object[] Options = { "Cancel", "Yes" };
				int a = JOptionPane.showOptionDialog(new RBC(), "Do you want to close this window?", "Royal Bank of Canada",
						JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Options, null);
				if (a != 0) {
					System.exit(0);
				} else {
					JOptionPane.getRootFrame().dispose();
				}
			}
		} catch (IOException io) {
			System.exit(0);
		}
	}
}
