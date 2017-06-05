import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panneau extends JPanel implements Observer {

	// public Ticker ticker;
	public static JLabel ticLabelLeft = new JLabel("2");
	public static JLabel ticLabelRight = new JLabel("2");
	static JButton reset = new JButton("reset");

	public Panneau() {
		
		//this.setLayout(new GridBagLayout());
		this.setLayout(null);
		getTicLabelLeft().setLocation(100, 150);
		getTicLabelLeft().setSize(50, 50);
		getTicLabelLeft().setHorizontalAlignment(SwingConstants.CENTER);
		getTicLabelRight().setLocation(250, 150);
		getTicLabelRight().setSize(50, 50);
		getTicLabelRight().setHorizontalAlignment(SwingConstants.CENTER);
		setTicLabelRight(0);
		setTicLabelLeft(0);

		Color red = new Color(255, 0, 0);
		Color blue = new Color(0, 100, 255);
		getTicLabelLeft().setOpaque(true);
		getTicLabelLeft().setBackground(red);
		getTicLabelRight().setOpaque(true);
		getTicLabelRight().setBackground(blue);
		this.add(getTicLabelLeft());
		this.add(getTicLabelRight());
		
		reset.setSize(70, 20);
		reset.setLocation(165, 180);
		reset.setVisible(true);
		reset.addActionListener(new ResetButton());
		this.add(reset, BorderLayout.CENTER);

	}

	@Override
	public void update(Observable o, Object arg) {
		if (o.toString() == "1") {
			addTicLabelLeft();
		} else if (o.toString() == "2") {
			addTicLabelRight();
		}
		// repaint();

		// dit j ai tick tant de fois pour les 2 tickers
		// optionel: reset

	}

	public JLabel getTicLabelLeft() {
		return this.ticLabelLeft;
	}

	public void setTicLabelLeft(int value) {
		getTicLabelLeft().setText(Integer.toString(value));
	}

	public JLabel getTicLabelRight() {
		return this.ticLabelRight;
	}

	public void setTicLabelRight(int value) {
		getTicLabelRight().setText(Integer.toString(value));
	}

	public void addTicLabelLeft() {
		setTicLabelLeft(Integer.parseInt(getTicLabelLeft().getText()) + 1);
	}

	public void addTicLabelRight() {
		setTicLabelRight(Integer.parseInt(getTicLabelRight().getText()) + 1);
	}
	
	public static void reset(){
		ticLabelLeft.setText("0");
		ticLabelRight.setText("0");
	}
}
