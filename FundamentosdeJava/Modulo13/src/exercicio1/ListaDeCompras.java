package exercicio1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ListaDeCompras {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		String item = "";
		
		PrintWriter output = null;
		try {
			output = new PrintWriter(new File ("lista.txt"));
			
			while (true) {
		
				System.out.println("Digite o item da lista");
				item = input.nextLine();
				
				if (item.trim().length() == 0) {
					continue;
				}
				
				if (item.equals("0")) {
					System.out.println("Aplicação encerrada");
					break;
				}
				
				output.println(item);
			}
		} finally {
			
			if (output != null) {
				output.close();
			}
			input.close();
		}

	}

}
