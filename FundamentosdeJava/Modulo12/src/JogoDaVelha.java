import java.util.ArrayList;
import java.util.List;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		char[][] tabuleiro = new char[3][3];
		
		tabuleiro[0][0] = 'x';
		tabuleiro[0][1] = 'x';
		tabuleiro[0][2] = 'x';
		tabuleiro[1][0] = 'o';
		tabuleiro[1][1] = 'o';
		tabuleiro[1][2] = 'o';
		tabuleiro[2][0] = 'i';
		tabuleiro[2][1] = 'i';
		tabuleiro[2][2] = 'i';
		
		//imprimirTabuleiro(tabuleiro);
		limparTabuleiro(tabuleiro);
			
		List<Object[]> jogadas = new ArrayList();
		/*A primeira posição indica em qual linha do tabuleiro 
		 * sera feita a jogada. A segunda indica a coluna
		 * A terceira é o elemento que deve ser inserido 
		 * no tabuleiro (x ou y)*/
		
		jogadas.add(new Object[] {1, 1,'x'});
		jogadas.add(new Object[] {2, 2,'x'});
		jogadas.add(new Object[] {2, 0,'x'});
		jogadas.add(new Object[] {0, 2,'o'});
		jogadas.add(new Object[] {1, 2,'x'});
		jogadas.add(new Object[] {1, 0,'o'});
		
	    for (Object[] jogada: jogadas) {
	    	int linha = (int) jogada[0];
	    	int coluna = (int) jogada[1];
	    	char simbolo = (char) jogada[2];
	    	tabuleiro[linha][coluna] = simbolo;    	
	    		    	
	    }
	    imprimirTabuleiro(tabuleiro);
	    
	}
	
	public static void imprimirTabuleiro(char[][] tabuleiro) {
		for (int lin = 0; lin < tabuleiro.length; lin++) {
			for (int col = 0; col < tabuleiro[0].length; col++ ) {
				System.out.print(tabuleiro[lin][col] + "  ");
			}			
			System.out.println();
		}
		
	}
	
	public static void limparTabuleiro(char[][] tabuleiro){
		for (int lin = 0; lin < tabuleiro.length; lin++) {
			for (int col = 0; col < tabuleiro[0].length; col++ ) {
				tabuleiro[lin][col] = ' ';
			}			
		} 
	}

	
	
	
}