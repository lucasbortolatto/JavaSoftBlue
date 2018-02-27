import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LerDados {

	public static void main(String[] args) throws IOException {

		try (InputStream is = new FileInputStream("entrada.txt")) {
		
		byte[] buffer = new byte[4];
		String s = "";
		int cont;
		while ((cont = is.read(buffer)) > -1) {
			s += new String(buffer, 0, cont);
		}
		System.out.println(s);
		System.out.println(s.length());
		}
		
	}
}
