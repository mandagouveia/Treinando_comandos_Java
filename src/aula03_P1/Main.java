package aula03_P1;

import java.util.Scanner;

public class Main {


public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	for (int x = s.nextInt(); x >= 0; x += 0) {

		if(x == 0) {
			
			System.out.println("essa porra é neutro");
			
		}
		else if (x % 2 == 0) {

			System.out.println("Seu número é par");

		} else {

			System.out.println("Seu número é impar");

		}

		x = s.nextInt();

	}
	
	s.close();

}

}