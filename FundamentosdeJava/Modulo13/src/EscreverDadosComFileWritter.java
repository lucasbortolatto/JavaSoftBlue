import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverDadosComFileWritter {
	public static void main(String[] args) throws IOException {
		String s = "Escrito com BufferedWriter e FileWritter";
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt"))){
			writer.write(s);
		}
		

	}

}
