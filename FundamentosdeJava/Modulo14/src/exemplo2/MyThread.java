package exemplo2;

public class MyThread extends Thread {
	
	Contador contador;

	public MyThread(Contador contador) {
		this.contador = contador;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			contador.incrementar();
		}
	}
	
	
	
	

}
