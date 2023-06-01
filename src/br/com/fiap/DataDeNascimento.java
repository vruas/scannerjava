package br.com.fiap;

import java.util.Scanner;

public class DataDeNascimento {

	public static void main(String[] args) {
		 int anoAtual = 0, anoNascimento = 0, idade = 0;
		 Scanner scan;
		 
		 try {
			scan = new Scanner(System.in);
			System.out.println("Digite o ano atual: ");
			anoAtual = scan.nextInt();
			System.out.println("Digite seu ano de nascimento: ");
			anoNascimento = scan.nextInt();
			idade = anoAtual - anoNascimento;
			System.out.println("Sua idade é: " + idade);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto");
		}

	}

}
