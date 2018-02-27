package exemplo3;

public class Pessoa implements Runnable {
	
	private ContaBancaria contabancaria;

	public Pessoa(ContaBancaria contabancaria) {
		this.contabancaria = contabancaria;
	}

	@Override
	public void run() {
		
		for (int i  = 1; i < 10; i++) {
			try {
				contabancaria.sacar(200);
				Thread.sleep(100);
				
				contabancaria.depositar(200);
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
