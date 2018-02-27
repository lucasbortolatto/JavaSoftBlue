import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerComScanner {

	public static void main(String[] args) throws IOException {
		try(Scanner scanner = new Scanner(new File("entrada.txt"))){
			String s = "";
			String primeiraLinha = "";
			
			primeiraLinha = scanner.nextLine();
			
			while (scanner.hasNextLine()){
				String line = scanner.nextLine();
				s += line + "\n";
			}
			
			System.out.println("Ler so a primeira linha: \n" + primeiraLinha);
			System.out.println("Ler todas as linhas: \n" + s);
			
			
		}

	}

}
