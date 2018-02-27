package exercicio1;

public class Sapo extends Thread {
	private static final int MAXIMO_DESCANSO = 100;
	private static final int MAXIMO_PULO = 50;
	
	Object monitor  = new Object();
	
	private String nome;
	
	private int distanciaTotal;
	
	private int distanciaPercorrida;
	
	private int ultimoPulo;
	
	private static int colocacao;
	
	public Sapo(String nome, int distanciaTotal) {
		this.nome = nome;
		this.distanciaTotal = distanciaTotal;
	}
	
	@Override
	public void run() {

		while(distanciaPercorrida < distanciaTotal) {
			pular();
			avisarSituacao();
			descansar();
		}
		
		cruzarLinhaDeChegada();

	}
	
	public void pular() {
		ultimoPulo = (int) (Math.random() * MAXIMO_PULO);
		distanciaPercorrida += ultimoPulo;
		
		if(distanciaPercorrida > distanciaTotal) {
			distanciaPercorrida = distanciaTotal;
		}
	}
	
	public void descansar() {
		int tempo = (int)(Math.random() * MAXIMO_DESCANSO);
		
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void avisarSituacao() {
		System.out.println(nome + " pulou " + ultimoPulo + "cm. A distancia percorrida foi de " + distanciaPercorrida + "cm");
	}
	
	private void cruzarLinhaDeChegada() {
		synchronized (monitor) {
			colocacao++;
			System.out.println("==>" + nome + " cruzou a linha de chegada em " + colocacao + "o. lugar");
		}
	}
}