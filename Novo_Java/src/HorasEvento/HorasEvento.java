package HorasEvento;

import java.util.Scanner;

public class HorasEvento {

	public static void main(String[] args) {
		/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		int duracaoSegundos, horas, minutos, segundos;
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva a dura��o do evento em segundo: ");
		duracaoSegundos = leia.nextInt();
		//precesso
		horas = (duracaoSegundos/3600);
		minutos = ((duracaoSegundos % 3600) / 60);
		segundos = ((duracaoSegundos % 3600) %60);
		System.out.printf("O evento durou %d horas, %d minutos e %d segundos", horas, minutos,segundos);

	}

}
