package aula05_P1;

import java.util.Scanner;

public class aula4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Escreva uma palavra que deseja ser encriptografada");

		String texto = s.next();

		System.out.println("Digite a chave para criptografia");

		int n = s.nextInt();
		int tamanho = texto.length();

		String crip = "";

		for (int i = 0; i < tamanho; i++) {

			crip = crip + (char) (texto.charAt(i) + n);

		}

		System.out.println("Sua palavra criptorafada é: " + crip);

	}

}