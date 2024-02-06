package estrutura_repetitiva;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			x =sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		sc.close();

	}

}