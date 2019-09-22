package Exercicio3_3;

public class Triang {
     private int A;
     private int B;
     private int C;
     
	
	
	
	public Triang() {

	}

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public int getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public static String tipoTriang(int a,int b,int c) {
		String texto;
		
		
		if (a == b && b == c && a == c)
		{
			texto = "Equilatero";
			return texto;
		
	}
		else if((a==b && b!=c && a!=c) || (a!=b && b==c && a!=c) || (a!=b && b!=c && a==c))  {
		
			texto = "Isosceles";
			return texto;
		}
		else if(a!=b && b!=c && a!=c)
				{
		    texto = "Escaleno";
			return texto;
				}
		return null;
	

}
}
