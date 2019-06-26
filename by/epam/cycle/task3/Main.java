package by.epam.cycle.task3;

import java.util.Scanner;

public class Main {
	
	public static double getScanDoubleValue(String valueName) {
		
		System.out.println("Enter double value of " + valueName);
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextDouble() == false) {
			System.out.println("Value:" + sc.next() + " is not double type, please try again");
		}
		
		double d=0;
		d =sc.nextDouble();
		System.out.println("Value: " + valueName + " is " + d);
		return d;		
		
	}
	
	public static void getFunctionGoal(double a, double b, double h) {

		for (double i = a; i <= b; i+=h ) {

			if (i <= 2) {
				System.out.printf("[%.2f, %.2f] with h=%.0f h<=2: %.2f\n", a,b,h,-i);
			} else {
				System.out.printf("[%.2f, %.2f] with h=%.0f h>2: %.2f\n", a,b,h,i);
			}

		}

	}
	
	public static void main(String[] args) {
		
		/*
		 * 2 Вычислить значения функции на отрезке [а,b] c шагом h:
		 */
		
		double a = 0;
		double b = 0;
		double h = 0;		
		
		a = getScanDoubleValue("a");
		b = getScanDoubleValue("b");
		
		
		while (a>=b) {
			System.out.printf("Value a=%f must be greater than value b=%f\n", a,b);
			a = getScanDoubleValue("a");
			b = getScanDoubleValue("b");
		}
		
		h = getScanDoubleValue("h");
		
		while (h <= 0 ) {
			System.out.printf("Value h=%f should be greater than 0\n", h);
			h = getScanDoubleValue("h");
		}
		
		getFunctionGoal(a,b,h);		
				
	}

}
