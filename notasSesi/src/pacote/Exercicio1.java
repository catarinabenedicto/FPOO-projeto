package pacote;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		String  Plano;
		
		System.out.println("INFORME O SEU PLANO :");
		
		Plano = objScanner.next();
		
		if (Plano.equalsIgnoreCase("Básico")) {
			System.out.println("150,0");
			
		}else if (Plano.equalsIgnoreCase("Bronze")) {
			System.out.println("220,0");
			
		} else if (Plano.equalsIgnoreCase("Prata")) {
			System.out.println("310,0");
			
		}else if (Plano.equalsIgnoreCase("Ouro")) {
			System.out.println("450,0");
		}
		else {
			System.out.println("Informação Inválida");
		}
		
	}

}
