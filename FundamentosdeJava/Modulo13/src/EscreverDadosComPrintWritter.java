import java.io.IOException;
import java.io.PrintWriter;

public class EscreverDadosComPrintWritter {

	public static void main(String[] args) throws IOException {
		String s = "Escrito com Print Writter";
		
		try (PrintWriter pw = new PrintWriter("saida.txt")){
			pw.println(s);
			
		}

	}

}
