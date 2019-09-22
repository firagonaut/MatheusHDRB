package Exercicio2_4;

public class OpNum {
	private float a, b, c;

	public OpNum() {

	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public float prodABC() {
		return a * b * c;
	}

	public float calcAB(int cod) {
		if (cod == 0) {
			System.out.println("Soma(" + a + "+" + b + ")\n");
			return a + b;
		} else if (cod == 1) {
			System.out.println("Multiplicacao(" + a + "*" + b + ")\n");
			return a * b;
		} else if (cod == 2) {
			System.out.println("Subtracao(" + a + "-" + b + ")\n");
			return a - b;
		} else if (cod == 3) {
			System.out.println("Divisao (" + a + "/" + b + ")\n");
			return a / b;
		} else {
			System.out.println("Opcao invalida\n");
			return -1;
		}

	}

	public float bigABC() {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else if (c > a && c > b) {
			return c;
		} else {
			System.out.println("Iguais\n");
			return -1;
		}

	}
	
	public void isPrimo(int num) {
		int flag=0;
		
		
		for(int i=1; i<=num;i++)
			if (num%i==0) flag++;
			
		if (flag==2)
		{
			System.out.println("Primo\n");
		}
		else
		{
			System.out.println("Nao Primo\n");
		}
		
		
		
	}

}
