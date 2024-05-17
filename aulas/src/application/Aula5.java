package application;

import javax.swing.JOptionPane;

public class Aula5 {

	public static void main(String args[]) {

		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números você deseja digitar para calcular a média?:"));
		double avarage = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
			avarage += num;
		}

		avarage /= n;

		System.out.println("A média é " + avarage);
	}
}