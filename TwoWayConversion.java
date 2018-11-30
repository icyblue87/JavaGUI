package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class TwoWayConversion extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		new TwoWayConversion();
	}

	JTextField Celsius, Fahrenheit;
	DecimalFormat df = new DecimalFormat(".##");

	public TwoWayConversion() {
		Dimension d = new Dimension(200, 200);
		setSize(1000, 1000);
		setTitle("Two Way Conversion");
		JPanel Panel = new JPanel();
		JPanel PanelL = new JPanel();
		JPanel PanelR = new JPanel();
		Panel.add(PanelL);
		Panel.add(PanelR);
		PanelL.setLayout(new BoxLayout(PanelL, BoxLayout.Y_AXIS));
		PanelR.setLayout(new BoxLayout(PanelR, BoxLayout.Y_AXIS));
		Panel.setLayout(new FlowLayout());
		JButton FtoC = new JButton("F->C");
		JButton CtoF = new JButton("C->F");
		JLabel Flabel = new JLabel("Fahrenheit");
		JLabel Clabel = new JLabel("Celsius");
		PanelL.add(Flabel);
		PanelR.add(Clabel);
		PanelL.add(FtoC);
		PanelR.add(CtoF);
		JButton clear = new JButton("Clear");
		clear.setOpaque(true);
		clear.setSize(d);
		clear.addActionListener(this);
		clear.setActionCommand("clear");
		Celsius = new JTextField(10);
		Fahrenheit = new JTextField(10);
		Celsius.addActionListener(this);
		Fahrenheit.addActionListener(this);
		PanelL.add(Fahrenheit);
		PanelR.add(Celsius);
		FtoC.setSize(d);
		CtoF.setSize(d);
		FtoC.setOpaque(true);
		CtoF.setOpaque(true);
		FtoC.addActionListener(this);
		CtoF.addActionListener(this);
		FtoC.setActionCommand("F->C");
		CtoF.setActionCommand("C->F");
		Panel.add(clear);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(Panel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	String copyText(int x) {
		if (x == 1) {
			String text = Celsius.getText();
			return text;
		} else {
			String text = Fahrenheit.getText();
			return text;
		}
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getActionCommand().equals("F->C")) {
				int temp = Integer.parseInt(copyText(2));
				double x = (temp - 32) * (5.0 / 9.0);
				String s = df.format(x);
				Celsius.setText(s);
			} else if (e.getActionCommand().equals("C->F")) {
				int temp = Integer.parseInt(copyText(1));
				double x = (temp - 32) * (5.0 / 9.0);
				String s = df.format(x);
				Fahrenheit.setText(s);
			} else {
				Celsius.setText("");
				Fahrenheit.setText("");
			}
		} catch (NumberFormatException a) {
			JOptionPane.showMessageDialog(new TwoWayConversion(), "Incorrect Input", "Wrong.",
					JOptionPane.ERROR_MESSAGE);
			Celsius.setText("");
			Fahrenheit.setText("");
		}
	}

}
