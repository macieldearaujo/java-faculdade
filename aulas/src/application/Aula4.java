package application;

import entities.Pessoa;

public class Aula4 {

	public static void main(String args[]) {
		Pessoa pessoaA = new Pessoa("A", 10000.00);
		Pessoa pessoaB = new Pessoa("B", 5000.00);
		
		int month = 1;
		
		while(pessoaA.getFortune() >= pessoaB.getFortune()) {
			pessoaA.monthlyEarnings(100.00);
			pessoaB.monthlyEarnings(300.00);
			
			Double fortunaA = pessoaA.getFortune();
			Double fortunaB = pessoaB.getFortune();
			
			System.out.println("Mês " + month + "\nFortuna A: " + fortunaA + "\nFortuna B: " + fortunaB);
			
			month++;
		}
	}
}
