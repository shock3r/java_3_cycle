package by.epam.cycle.task3;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 3. Найти сумму квадратов первых ста чисел.:
		 */
		
		int sum = 0;
		
		for (int i=0; i<=100; i++) {
			sum+=Math.pow(i, 2);
		}
		
		System.out.println("sum of squares of the first 100 numbers is: " + sum);
					
	}

}
