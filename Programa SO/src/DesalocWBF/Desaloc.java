package DesalocWBF;

public class Desaloc {
	private int[] j = new int[] { 4, 7, 9, 12, 15, 18, 20 };

	public Desaloc() {

	}

	public int[] getJ() {
		return j;
	}

	public void setJ(int[] j) {
		this.j = j;
	}

	public void printJ() {
		for (int i = 0; i < 7; i++)
			System.out.println(j[i] + " ");
	}

	public void searchJ(char C, int Entr) {
		int i = 0, flag = -15;

		if (C == 'B') {

			while (i < 7) {
				if (Entr == j[i]) {
					this.j[i] -= Entr;
					flag = i;

				} else if (i == 6 && flag == -1) {
					i = 0;
					while (i < 7) {
						if (Entr < j[i]) {
							this.j[flag] -= Entr;
						}
						i++;
					}
					i = 0;
				}

				i++;
			}

			if (flag == -1) {
				System.out.println("ERRO!");
			} else {
				System.out.println("alocado " + j[flag] + "kb -> pos" + flag);
			}

		}

		else if (C == 'W') {
			int Tam = 1;

			while (i < 7) {

				if (Tam < j[i]) {
					Tam = j[i];
					flag = i;
				}

				i++;
			}

			j[flag] -= Entr;

			if (flag == -1) {
				System.out.println("ERRO!");
			} else {
				System.out.println("alocado " + j[flag] + "kb -> pos" + flag);
			}

		}

		else if (C == 'F') {

			while (i < 7) {
				if (Entr <= j[i]) {
					this.j[i] -= Entr;
					flag = i;
					i=6;
				}
				i++;
			}

			if (flag == -1) {
				System.out.println("ERRO!");
			} else {
				System.out.println("alocado " + j[flag] + "kb -> pos" + flag);
			}

		}

	}
}
