package Exercicio1_10;


public class Lamp {
      private boolean Estado;
      private boolean Q;
      
      
      
    public Lamp(){
    	
    }
      
      
	public boolean getEstado() {
		return Estado;
	}
	public void setEstado(boolean estado) {
		if (Q)
		{
			Estado = false;
		}
		else
		{
			Estado = estado;
		}
		
	}
	
	public boolean isQ() {
		return Q;
	}
	public void setQ(boolean q) {
		Q = q;
	}
      
      
 
			
			
			
	
}
	
