package Exercicio2_6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		SomaN obj = new SomaN();
		
		   
		obj.setN(STDIN_SCANNER.nextInt());
		   
		 System.out.println(obj.SomaNat());
		
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);

}
