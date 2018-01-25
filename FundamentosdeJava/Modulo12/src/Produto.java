
public class Produto implements Comparable<Produto> {
	String nome;
	double valor;
	
	Produto (String nome, double valor){
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	@Override
	public String toString() {
		return nome + ", " + valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( obj == null) {
			return false;
		}
		
		if ( !(obj instanceof Produto)) {
			return false;
		}
		Produto other = (Produto) obj;
		if ( this.valor == other.valor ) {
			return true;
		}	
		
		return false;
	}
	

	
	
	
	
	
	
		

}
