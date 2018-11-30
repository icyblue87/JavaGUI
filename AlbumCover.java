package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
@SuppressWarnings("serial")
public class AlbumCover extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		new AlbumCover();
	}

	ImageIcon img;
	JRadioButton EDEN, JeremyZucker, Stephen, OhWonder;
	JLabel picture;
	JButton Clear, Exit;
	ButtonGroup Buttons;

	public AlbumCover() throws IOException {
		setSize(1000, 1000);
		JPanel Large = new JPanel();
		JPanel PanelB = new JPanel();
		JPanel PanelL = new JPanel();
		JPanel PanelR = new JPanel();
		JPanel Largest = new JPanel();
		Largest.add(Large);
		Largest.add(PanelB);
		Largest.setLayout(new BoxLayout(Largest, BoxLayout.Y_AXIS));
		img = new ImageIcon(ImageIO.read(AlbumCover.class.getResourceAsStream("/invisible.png")));
		picture = new JLabel();
		picture.setIcon(img);
		PanelR.add(picture);
		Clear = new JButton("Clear");
		Exit = new JButton("Exit");
		PanelB.add(Clear);
		PanelB.add(Exit);
		Clear.addActionListener(this);
		Exit.addActionListener(this);
		Clear.setActionCommand("Clear");
		Exit.setActionCommand("Exit");
		JLabel Label = new JLabel("Select an Album:");
		Buttons = new ButtonGroup();
		EDEN = new JRadioButton("EDEN: Vertigo");
		JeremyZucker = new JRadioButton("Jeremy Zucker: Summer");
		Stephen = new JRadioButton("Stephen: Sincerely");
		OhWonder = new JRadioButton("Oh Wonder: Oh Wonder");
		EDEN.addActionListener(this);
		JeremyZucker.addActionListener(this);
		Stephen.addActionListener(this);
		OhWonder.addActionListener(this);
		Buttons.add(EDEN);
		Buttons.add(JeremyZucker);
		Buttons.add(Stephen);
		Buttons.add(OhWonder);
		PanelL.add(Label);
		PanelL.add(EDEN);
		PanelL.add(JeremyZucker);
		PanelL.add(Stephen);
		PanelL.add(OhWonder);
		Large.add(PanelL);
		Large.add(PanelR);
		PanelL.setLayout(new BoxLayout(PanelL, BoxLayout.Y_AXIS));
		getContentPane().add(Largest);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (EDEN.isSelected()) {
				img = new ImageIcon(ImageIO.read(AlbumCover.class.getResourceAsStream("/vertigo.jpg")));
				picture.setIcon(img);
			} else if (JeremyZucker.isSelected()) {
				img = new ImageIcon(ImageIO.read(AlbumCover.class.getResourceAsStream("/summer.jpg")));
				picture.setIcon(img);
			} else if (Stephen.isSelected()) {
				img = new ImageIcon(ImageIO.read(AlbumCover.class.getResourceAsStream("/sincerely.jpg")));
				picture.setIcon(img);
			} else if (OhWonder.isSelected()) {
				img = new ImageIcon(ImageIO.read(AlbumCover.class.getResourceAsStream("/ohwonder.jpg")));
				picture.setIcon(img);
			}
			if (e.getActionCommand().equals("Clear")) {
				img = new ImageIcon(ImageIO.read(AlbumCover.class.getResourceAsStream("/invisible.png")));
				picture.setIcon(img);
				Buttons.clearSelection();
			}
			if (e.getActionCommand().equals("Exit")) {
				Object[] choices = { "No", "Yes" };
				int a = JOptionPane.showOptionDialog(new AlbumCover(), "Are you sure you want to exit?", "Confirm Exit",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, null);
				if (a == 0) {
					JOptionPane.getRootFrame().dispose();
				} else {
					System.exit(0);
				}
			}
		} catch (IOException a) {
			System.out.println("Image not found.");
		}
	}
}
