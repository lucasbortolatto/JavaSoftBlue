import java.util.Set;
import java.util.TreeSet;

public class CriarProduto {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Abacate", 12.50);
		Produto produto2 = new Produto("Uva", 15.00);
		Produto produto3 = new Produto("Goiaba", 4.00);
		
		Set<Produto> produtos = new TreeSet<Produto>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}

	}

}
