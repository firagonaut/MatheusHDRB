package Exercicio2_4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		OpNum prod1 = new OpNum();
		
		   prod1.setA(STDIN_SCANNER.nextFloat());
		   prod1.setB(STDIN_SCANNER.nextFloat());
		   prod1.setC(STDIN_SCANNER.nextFloat());
		
		   System.out.println(prod1.bigABC());
		   System.out.println(prod1.prodABC());
		   
		   int a = (STDIN_SCANNER.nextInt());
		   prod1.isPrimo(a);
		   
		   
		    a = (STDIN_SCANNER.nextInt());
		   System.out.println(prod1.calcAB(a));
	
		   a = (STDIN_SCANNER.nextInt());
		   
		   
		
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);

}
