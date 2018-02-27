package exemplo3;

public class ContaBancaria {
	
	private final Object monitor = new Object();
	
	private double saldo = 1000;
	
	//Usando um objeto criado como monitor
	public void depositar(double valor) {
		synchronized(monitor) {
			saldo += valor;
		}
	}
	//Usando o próprio objeto da classe
	public void sacar(double valor) {
		synchronized(this) {
			saldo -= valor;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

}
