package application;

import java.util.Scanner;

public class Aula2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para realizar a tabuada: ");
		int num = sc.nextInt();
		multiplicationTable(num);

		sc.close();
	}

	public static void multiplicationTable(Integer num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
