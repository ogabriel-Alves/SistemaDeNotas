package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.dados;

public class visual {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		dados dado = new dados();
		
		dado.name = sc.nextLine();
		dado.nota1 = sc.nextDouble();
		dado.nota2 = sc.nextDouble();
		dado.nota2 = sc.nextDouble();
		
		System.out.printf("FINAL GREDE = %.2f%n", dado.total() );
		
		if (dado.total() < 60 ) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", dado.reprovado());
			}
		else{
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
