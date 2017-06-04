import java.util.Observable;

public class Ticker extends Observable implements Runnable {

	private int nbTic;
	private String nomTicker;

	public Ticker(String nom) {
		this.setNbTic(0);
		this.nomTicker = nom;
		
	}

	@Override
	public void run() {
		while (true) {

			this.Tic();
			this.setRandomDelay();
		}
	}

	public void Tic() {
		setRandomDelay();
		this.setNbTic(getNbTic() + 1);
		setChanged();
		notifyObservers();
		System.out.println(getNbTic());
		

	}

	public void setRandomDelay() {
		try {
			int delay =(int) (Math.random()*1000);
			Thread.sleep(delay+100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getNbTic() {
		return nbTic;
	}

	public void setNbTic(int nbTic) {
		this.nbTic = nbTic;
	}

	public String toString(){
		return nomTicker;
		
	}
}
