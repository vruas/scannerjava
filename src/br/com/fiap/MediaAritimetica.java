package br.com.fiap;

import java.util.Scanner;

public class MediaAritimetica {

	public static void main(String[] args) {
		float prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0, media = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite a primeira nota: ");
			prova1 = scan.nextFloat();
			System.out.println("Digite a segunda nota: ");
			prova2 = scan.nextFloat();
			System.out.println("Digite a terceira nota: ");
			prova3 = scan.nextFloat();
			System.out.println("Digite a quarta nota: ");
			prova4 = scan.nextFloat();
			media = (prova1 + prova2 + prova3 + prova4) / 4;
			System.out.println("A média do aluno é: " + media);
;		} catch (Exception e) {
			System.out.println("Formato incorreto");
		}
		
	}

}
