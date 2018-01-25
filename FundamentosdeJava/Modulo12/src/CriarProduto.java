import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CriarProduto {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Laranja", 2.50);
		Produto produto2 = new Produto("Laranja", 2.70);
		Produto produto3 = new Produto("Maca", 1.45);
		Produto produto4 = new Produto("Mamao", 4.95);
		Produto produto5 = new Produto("Limao", 2.30);
		
		
		Set<Produto> produtos = new HashSet<Produto>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}

	}

}
