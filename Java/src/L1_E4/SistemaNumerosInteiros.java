package L1_E4;

import java.util.Scanner;
public class SistemaNumerosInteiros {

	public static void main(String[] args) {
		
	    double a, b, c, d, r, s;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		//processo
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = ((r+s) / 2);
		System.out.printf("O valor de D �: %.2f", d);
		
	}

}
