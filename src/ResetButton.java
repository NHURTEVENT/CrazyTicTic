import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ResetButton implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == Panneau.reset) {
			System.out.println("reset");
			/*CrazyTicTic.threads.get(0).stop();
			CrazyTicTic.threads.get(1).stop();
			CrazyTicTic.threads.get(0).start();
			CrazyTicTic.threads.get(1).start();
			*/
			
			/*je voulais restart la thread semi-proprement mais apparement �a ne
			 * marche pas comme �a, donc je remet juste les compteurs � 0
			 */
			
			Panneau.reset();
			
		}
	}
}
