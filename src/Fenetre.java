import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	
	JPanel panneau;
	
	public JPanel getPanneau() {
		return panneau;
	}

	public void setPanneau(JPanel panneau) {
		this.panneau = panneau;
	}

	public Fenetre(){
		this.setPanneau(new Panneau());
		this.add(panneau);
	}

}
