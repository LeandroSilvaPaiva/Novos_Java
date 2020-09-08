package Media_Aluno;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
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
		System.out.printf("Sua média final é de: %d", totalMedia);
		

	}

}
