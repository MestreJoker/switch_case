package ExeSwitch;

import java.util.Scanner;

public class Zodiaco {

	public static void main(String[] args) {
		int dia, mes;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe o dia em que você nasceu");
		dia = leia.nextInt();
		
		System.out.println("Informe o mês em que você nasceu");
		mes = leia.nextInt();
		
		switch (mes) {
			case 1:
				if (dia<=20) {
					System.out.println("Capricórnio");
				}
				else if(dia>=21&&dia<=31) {
					System.out.println("Aquário");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 2:
				if (dia<=19) {
					System.out.println("Aquário");
				}
				else if(dia>=20&&dia<=28) {
					System.out.println("Peixes");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 3:
				if (dia<=20) {
					System.out.println("Peixes");
				}
				else if(dia>=21&&dia<=31) {
					System.out.println("Áries");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 4:
				if (dia<=20) {
					System.out.println("Áries");
				}
				else if(dia>=21&&dia<=30) {
					System.out.println("Touro");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 5:
				if (dia<=20) {
					System.out.println("Touro");
				}
				else if(dia>=21&&dia<=31) {
					System.out.println("Gêmeos");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 6:
				if (dia<=20) {
					System.out.println("Gêmeos");
				}
				else if(dia>=21&&dia<=30) {
					System.out.println("Câncer");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 7:
				if (dia<=21) {
					System.out.println("Câncer");
				}
				else if(dia>=22&&dia<=31) {
					System.out.println("Leão");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 8:
				if (dia<=22) {
					System.out.println("Leão");
				}
				else if(dia>=23&&dia<=31) {
					System.out.println("Virgem");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 9:
				if (dia<=22) {
					System.out.println("Virgem");
				}
				else if(dia>=23&&dia<=30) {
					System.out.println("Libra");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 10:
				if (dia<=22) {
					System.out.println("Libra");
				}
				else if(dia>=23&&dia<=31) {
					System.out.println("Escorpião");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 11:
				if (dia<=21) {
					System.out.println("Escorpião");
				}
				else if(dia>=22&&dia<=30) {
					System.out.println("Sagitário");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			case 12:
				if (dia<=21) {
					System.out.println("Sagitário");
				}
				else if(dia>=22&&dia<=31) {
					System.out.println("Capricórnio");
				}
				else {
					System.out.println("Dia inválido!");
				}
				break;
			default:
				System.out.println("Mês inválido!");
		}

	}

}
