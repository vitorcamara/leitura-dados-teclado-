package com.vitorcamara.java.leituradadosteclado;

import java.util.Scanner; 

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //essa linha cria um objeto da classe Scanner para ler dados do teclado fornecido pelo usuário

		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bicho de estimação:"); //aqui pedimos a interação do usuário pelo teclado  
		//a partir daqui, os dados serão coletados
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();

		//a partir daqui, os dados coletados serão mostrados no console
		System.out.println("Voce digitou os seguintes valores:");
		System.out.println("Primeiro nome:" + primeiroNome);
		System.out.println("Sua idade:" + idade);
		System.out.println("Quantidade de filhos:" + qtdFilhos);
		System.out.println("Sua altura:" + altura);
		System.out.println("Tem bicho de estimação:" + temPet);

	}

}
