import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EscreverDados {

	public static void main(String[] args)throws IOException {
		try (OutputStream os = new FileOutputStream("saida.txt")){
			String frase = new String("Escrevendo com string convertida em bytes");
			
			byte[] buffer = frase.getBytes();
			
			os.write(buffer);
		}


	}

}
