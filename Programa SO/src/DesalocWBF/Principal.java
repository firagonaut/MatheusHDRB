package DesalocWBF;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	/**
	 * You can write C code here or look at the examples. It will be translated as
	 * "demo/demo_translation.c". There are also translations of full programs
	 * below.
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {

		int entrada;

		Desaloc Teste = new Desaloc();

		entrada = STDIN_SCANNER.nextInt();

		char c = (char) System.in.read();
		
		Teste.searchJ(c, entrada);

		Teste.printJ();

		System.out.println();

	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);

}