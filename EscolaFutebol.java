package ExeSwitch;

import java.util.Scanner;

public class EscolaFutebol {

	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Escrava a idade do aluno matriculado");
		idade = leia.nextInt();
		
		switch(idade) {
			case 6:
				System.out.println("Categoria ''Dente de Leite''");
				break;
			case 7:
				System.out.println("Categoria ''J�nior''");
				break;
			case 8:
				System.out.println("Categoria ''J�nior Max''");
				break;
			case 9:
				System.out.println("Categoria ''J�nior Master''");
				break;
			case 10:
				System.out.println("Categoria ''Master''");
				break;
			default:
				System.out.println("Idade inv�lida");
		}

	}

}
