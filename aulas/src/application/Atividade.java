package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		List<Integer> vetor = new ArrayList<>();
		vetor.add(0);
		
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<i; j++) {
				vetor.add(i);
			}
		}
		
		System.out.println(vetor.size());
		for(int num : vetor) {
			System.out.print(num + " ");
		}
		
		sc.close();
	}	
}
