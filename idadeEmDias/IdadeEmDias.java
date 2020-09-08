package idadeEmDias;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
		//variaveis 
		int anos, meses, dias, totalDias;
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva os anos: ");
		anos = leia.nextInt();
		System.out.println("Escreva os meses: ");
		meses = leia.nextInt();
		System.out.println("Escreva os dias: ");
		dias = leia.nextInt();
	    //processo
		totalDias = (anos*360);
		totalDias = (totalDias+(meses*30));
		totalDias = (totalDias+dias);
		//resultado
		System.out.printf("O seu total de dias é de: %d", totalDias);
	

	}

}
