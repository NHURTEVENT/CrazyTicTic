import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class CrazyTicTic{
	
	//but: une fenetre avec 2 carré avec dedans "j'ai tické X fois" pour les 2 tickers et éventuellementun bouton reset 
	public static ArrayList<Thread> threads = new ArrayList();
	
	

	public CrazyTicTic(){
		Ticker ticker1= new Ticker("1");
		Ticker ticker2= new Ticker("2");
		Fenetre fenetre = new Fenetre();
		
		fenetre.setSize(400,400);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ticker1.addObserver((Observer) fenetre.getPanneau());
		ticker2.addObserver((Observer) fenetre.getPanneau());
		addThread(new Thread(ticker1));
		addThread(new Thread(ticker2));
		
		getThreads().get(0).start();
		getThreads().get(1).start();
		
 	}
	
	public static void main(String[] args) {
		CrazyTicTic madToc = new CrazyTicTic();
		//madToc.run();
	}

	public ArrayList<Thread> getThreads() {
		return threads;
	}

	public void setThreads(ArrayList<Thread> threads) {
		this.threads = threads;
	}
	
	public void addThread(Thread thread){
		this.threads.add(thread);
	}

	

	
}
