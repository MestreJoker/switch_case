package ExeSwitch;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		double total, mb, b, r, i, mbp, bp, rp, ip;
		String nota;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de alunos na sala");
		total = leia.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram MB");
		mb = leia.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram B");
		b = leia.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram R");
		r = leia.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram I");
		i = leia.nextInt();
		
		mbp = mb/total*100;
		bp = b/total*100;
		rp = r/total*100;
		ip = i/total*100;
		
		if((mb+b+r+i)>total||(mb+b+r+i)<total) {
			System.out.println("Quantidade de alunos incorreta");
		}
		else {
			System.out.println("Insira a nota que deseja saber a porcentagem");
			nota = leia.next();
			
			switch(nota) {
			case "mb":
				System.out.println("A porcentagem de alunos que tirou MB é de: "+mbp+"%");
				break;
			case "b":
				System.out.println("A porcentagem de alunos que tirou B é de: "+bp+"%");
				break;
			case "r":
				System.out.println("A porcentagem de alunos que tirou R é de: "+rp+"%");
				break;
			case "i":
				System.out.println("A porcentagem de alunos que tirou I é de: "+ip+"%");
				break;
			default:
				System.out.println("Nota inexistente");
			}
		}
	}
}
