package Exercicio3_2;

public class Testes {
	private int N = 0;
	private float F1;

	
	
	
	public float getF1() {
		return F1;
	}

	public void setF1(float f1) {
		F1 = f1;
	}

	public int getN() {
		N++;
		return N;

	}

	public void setN(int n) {
		N++;
		N = n;
	}

	public Testes() {

	}

	public boolean intPar(int n) {
		N++;
		
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean intImpar(int n) {
		N++;
		
		if (n % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrimo(int num) {
		N++;
		
		int flag = 0;

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				flag++;

		if (flag == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public int[] preencheVect(int tamanho) {
		N++;
		
		
		int[] vect = new int[tamanho];
		
		
		
		for (int i=0;i<tamanho;i++)
		{
			vect [i] = 1;
		}
		
		return vect;
	}
	
	
	public int nDigi()
	{
		N++;

		
		if (F1<10)
		{
			return 1;
		}
		else
		{
			return Math.round(F1)/10;
		}
		
		
		
		
	}
	
	public boolean checkDigi()
	{
		N++;
		
		int fInt;
		float checkF;
		
		fInt = (int)F1;
		
		checkF=F1-fInt;
		
		checkF=checkF*100;
		
		if (checkF==F1) {
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
	
	
	

}
