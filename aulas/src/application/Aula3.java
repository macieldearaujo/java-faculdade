package application;

import java.util.Scanner;

public class Aula3 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos termos da sequência de Fibonnaci você quer mostrar: ");
		int times = sc.nextInt();
		
		executeFibonacci(times);
		
		sc.close();
	}
	
	public static void executeFibonacci(Integer times) {
		int values[] = new int[times];
		values[0] = 1;
		values[1] = 1;
		
		for(int i = 2; i < times; i++) {
			values[i] = values[i-1] + values[i-2];
		}
		
		for(int i = 0; i<values.length; i++) {
			if(i != values.length-1) {
				System.out.print(values[i] + ", ");
			} else {
				System.out.print(values[i]);
			}
		}
		
	}
}
