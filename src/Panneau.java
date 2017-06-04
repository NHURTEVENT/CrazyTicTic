import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;


public class Panneau extends JPanel implements Observer{
	
	public Ticker ticker;
	
	public Panneau(){
	
	JLabel ticLabelLeft = new JLabel();
	JLabel ticLabelRight = new JLabel();
	
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		//dit j ai tick tant de fois pour les 2 tickers
		//optionel: reset
		
	}
	
}
