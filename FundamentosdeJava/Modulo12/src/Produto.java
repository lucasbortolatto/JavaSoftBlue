
public class Produto implements Comparable<Produto> {
	String nome;
	double valor;
	
	Produto (String nome, double valor){
		this.nome = nome;
		this.valor = valor;
	}
	
	@Override
	public int compareTo(Produto arg) {
		if (this.valor == arg.valor) {
			return 0;	
		}
		
		if (this.valor > arg.valor) {
			return 1;
		}
		
		return -1;
	}
	
	
		

}
