package Exercicio3_2;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Testes obj = new Testes();
		
		   
		obj.setN(STDIN_SCANNER.nextInt());
		   
		 System.out.println("Par:"+obj.intPar(obj.getN()));
		 System.out.println("\n");
		 System.out.println("Impar:"+ obj.intImpar(obj.getN()));
		 System.out.println("\n");
		 System.out.println("Primo:"+obj.isPrimo(obj.getN()));
		 System.out.println("\n");
		 
		 int a=(STDIN_SCANNER.nextInt());
		 
		 System.out.println("Vetor:"+Arrays.toString(obj.preencheVect(a)));
		 System.out.println("\n");
		 
		 obj.setF1(STDIN_SCANNER.nextFloat());
		 
		 System.out.println("Digitos:"+obj.nDigi());
		 System.out.println("\n");
		 System.out.println("Digitos iguais?:"+obj.checkDigi());
	
		 
		
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);

}
