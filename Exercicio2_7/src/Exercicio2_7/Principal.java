package Exercicio2_7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		maiorDiv obj = new maiorDiv();
		
		   
		obj.setN(STDIN_SCANNER.nextInt());
		   
		 System.out.println(obj.Divisor());
		
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);

}
