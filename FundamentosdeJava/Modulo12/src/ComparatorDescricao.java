import java.util.Comparator;

public class ComparatorDescricao implements Comparator<Produto>{

	@Override
	public int compare(Produto prod1, Produto prod2) {
		if (prod1.getNome() == prod2.getNome()) {
			return 0;
		}
		
		if (prod1.getNome().compareTo(prod2.getNome()) > 0) {
			return 1;
		}
		
		return -1;
		
	}

}
