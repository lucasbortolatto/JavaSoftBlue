package exemplo3;

public class Aplicacao {

	public static void main(String[] args) throws InterruptedException {
		ContaBancaria conta = new ContaBancaria();
		
		Pessoa pessoa1 = new Pessoa(conta);
		Pessoa pessoa2 = new Pessoa(conta);
		
		Thread t1 = new Thread(pessoa1);
		Thread t2 = new Thread(pessoa2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Saldo = " + conta.getSaldo());
		
		
		
		
		

	}

}
