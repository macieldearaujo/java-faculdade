package application;

public class aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(5));
	}
	
	public static int factorial(Integer num) {
		int acum = 1;
		
		for(int i = 1; i<=num; i++) {
			acum = acum * i;
		}
		
		return acum;
	}
} 
