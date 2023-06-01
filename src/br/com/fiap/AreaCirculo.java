package br.com.fiap;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		float raio = 0, area = 0;
		
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o valor do raio:");
			raio = scan.nextFloat();
			area = 3.14f * (raio * raio);
			System.out.println("A área do círculo é igual a: " + area);
			
;		} catch (Exception e) {
			System.out.println("Formato incorreto");
		}

	}

}
