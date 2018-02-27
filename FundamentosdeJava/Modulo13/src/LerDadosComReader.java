import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerDadosComReader {

	public static void main(String[] args) throws IOException {
		
		try(BufferedReader reader = new BufferedReader (new FileReader("entrada.txt"))){
			String primeiraLinha = "";
			String lido = "";
			
			//Le somente a primeira linha
			primeiraLinha = reader.readLine();
			
			//Ler mais de uma linha
			String line;
			while ((line = reader.readLine()) != null) {
				lido += line + "\n";
				
			}
			System.out.println("Ler so a primeira linha: \n" + primeiraLinha);
			System.out.println("Ler todas as linhas: \n" + lido);
		}

	}

}
