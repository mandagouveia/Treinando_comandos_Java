import java.util.Scanner;

public class nome_qualidade extends Projeto_java_inicial {


	public static void main(String[] args) {
		
		
	try (Scanner scanner = new Scanner (System.in)){
			System.out.println("Qual o nome dela?");
			String name = scanner.next();
			System.out.println("Qual sua qualidade?");
			String quality = scanner.next();
			System.out.println(name+ "é muuuito"+quality);
			
			String result = name + " é muito" + quality;	
			
			scanner.close();
	}

}
			
			
		
	}
	
	