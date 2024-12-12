package Executavel;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i< n; i++) {
			System.out.printf("Digite um n�mero: ");
			vect[i] = sc.nextDouble();
		}
		double maior = vect[0];
		int posnumero = 0;
		
		for(int i = 0; i<n; i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				posnumero = i;
			}
		}
		System.out.printf("MAIOR N�MERO: %.2f \n", maior);
		System.out.printf("MAIOR N�MERO NA POSI��O: %d", posnumero);
		sc.close();
	}

}
