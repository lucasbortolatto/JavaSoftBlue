package exemplo1;

public class Contador extends Thread {
	
	public void run() {
		for ( int i = 0 ; i < 10; i++) {
			System.out.println("=>" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
