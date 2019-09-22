package Exercicio1_7;

import java.util.Scanner;

public class Principal {
	/**
	 * You can write C code here or look at the examples.
	 * It will be translated as "demo/demo_translation.c".
	 * There are also translations of full programs below.
	 */
	
	
	public static void main(String[] args) {
	    
		
		
		Cont exemplo = new Cont(0);
		
		System.out.println(exemplo.getI());
		
		for(int i=0; i<10;i++)
			exemplo.incI();	
	
		
	   
		System.out.println(exemplo.getI());
		
		exemplo.zeroI();
			
		System.out.println(exemplo.getI());
			
			
	
}
	
	
	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
	
	
}