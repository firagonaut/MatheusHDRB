package Exercicio3_4;

public class IR {
	private float salario;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int classIR() {

		int porc = 0;

		if (salario <= 2487.00) {
			return porc;
		} else if (salario > 2487.00 && salario <= 3873.00) {
			porc = 13;
			return porc;
		} else if (salario > 3873.00 && salario <= 4733.00) {
			porc = 17;
			return porc;
		} else if (salario > 4733.00 && salario <= 5287.00) {
			porc = 22;
			return porc;
		} else {
			porc = 27;
			return porc;
		}

	}
	
	public double anualIR() {
		
		if (salario <= 2487.00) {
			return 0;
		} else if (salario > 2487.00 && salario <= 3873.00) {
			return (salario*12)*0.13;
		} else if (salario > 3873.00 && salario <= 4733.00) {
			return (salario*12)*0.17;
		} else if (salario > 4733.00 && salario <= 5287.00) {
			return (salario*12)*0.22;
		} else {
			return (salario*12)*0.27;
		}
		
		
	}

}
