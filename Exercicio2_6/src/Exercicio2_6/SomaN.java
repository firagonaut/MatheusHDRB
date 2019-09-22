package Exercicio2_6;

public class SomaN {
      private int N;
      
      
      public SomaN()
      {
    	  
      }


	public int getN() {
		return N;
	}


	public void setN(int n) {
		N = n;
	}
	
	
	public int SomaNat() {
		int n=1,j,jTot=0;
		
		
		if (N==1) {
			j=1;
			jTot+=j;
			return j;
		}
		else
		{
			j=1;
			jTot+=j;
			
			while(n!=N) {
				
				
				j+=2;
				jTot+=j;
				n++;
				 
			}
			
			return jTot;
			
		}
		
		
	}

      
      
}
