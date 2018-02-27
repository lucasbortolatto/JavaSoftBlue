package exemplo2;

public class Contador {
	
	private int valor;
	
	//Critical session
	public synchronized void incrementar() {
		valor++;
	}
	
	public int getValor() {
		return valor;
	}
	

}
