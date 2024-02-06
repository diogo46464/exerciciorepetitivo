package estrutura_repetitiva;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		int valor = 2002;
		
		while(senha != valor) {
			
		System.out.println("Senha Invalida");
		senha = sc.nextInt();
		
		}
		
		System.out.println("Acesso Permitido");
		sc.close();
		
		}
	
		
	}
