package Exercicio16_1;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String a[]) {
		
		DoublyLinkedListImpl<Integer> dll = new DoublyLinkedListImpl<Integer>();
		
		
		dll.addFirst(STDIN_SCANNER.nextInt());
		dll.addFirst(STDIN_SCANNER.nextInt());
		dll.addFirst(STDIN_SCANNER.nextInt());

        dll.iterateForward();
       
        dll.iterateBackward();
        
        System.out.println(dll.searchList(STDIN_SCANNER.nextInt()));
    
      
	
	
	}	
	
	public final static Scanner STDIN_SCANNER = new Scanner(System.in);

}
