package application;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número para ser fatoriado: ");
		int num = sc.nextInt();
		
		System.out.println(factorial(num));
		sc.close();
	}
	
	public static int factorial(Integer num) {
		int acum = 1;
		
		for(int i = 1; i<=num; i++) {
			acum = acum * i;
		}
		
		return acum;
	}
} 
