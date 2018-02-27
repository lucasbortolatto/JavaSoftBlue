package exemplo4;

public class Aplicacao {

	public static void main(String[] args) {
		
		Buffer buffer = new Buffer();
		
		Produtor[] produtores = new Produtor[1];
		Consumidor[] consumidores = new Consumidor[1];
		
		for (int i = 0; i < produtores.length; i++) {
			produtores[i] = new Produtor(buffer);
			produtores[i].start();
		}
		
		for (int i = 0; i < consumidores.length; i++ ) {
			consumidores[i] = new Consumidor(buffer);
			consumidores[i].start();
		}

	}

}
