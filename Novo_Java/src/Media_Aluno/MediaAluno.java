package Media_Aluno;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/
		int notaA, notaB, notaC, totalMedia;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a nota A: ");
		notaA = leia.nextInt();
		System.out.println("Digite a nota B: ");
		notaB = leia.nextInt();
		System.out.println("Digite a nota C: ");
		notaC = leia.nextInt();
		totalMedia = ((notaA + notaB + notaC) / 3);
		System.out.printf("Sua m�dia final � de: %d", totalMedia);
		

	}

}
