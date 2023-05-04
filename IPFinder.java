package Pratice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class IPFinderDemo extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JLabel label;
	JTextField field;
	JButton button;

	IPFinderDemo() {
		super(" IP Finder ");
		label = new JLabel("Enter URL:");
		label.setBounds(85, 80, 150, 20);

		field = new JTextField();
		field.setBounds(85, 110, 200, 20);

		button = new JButton("Find IP");
		button.setBounds(140, 150, 80, 30);
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.white);
		button.addActionListener(this);
		add(label);
		add(field);
		add(button);
		setResizable(false);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String url = field.getText();
		try {
			InetAddress ia = InetAddress.getByName(url);
			String ip = ia.getHostAddress();
			JOptionPane.showMessageDialog(this, ip);
		} catch (UnknownHostException e1) {
			JOptionPane.showMessageDialog(this,"Opps..Ip address not found..");
		}
	}
}

public class IPFinder {

	public static void main(String[] args) {
		new IPFinderDemo();
	}

}
