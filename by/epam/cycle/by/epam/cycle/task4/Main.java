package by.epam.cycle.task4;
import java.math.BigInteger;
public class Main {
	
	public static void main(String[] args) {
		/*
		 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
		 */
		BigInteger sum = BigInteger.ONE;
		System.out.println("BigInteger value is: " + sum);
		
		for (int i=1; i<=200; i++) {
			
			BigInteger val = BigInteger.valueOf(i);
			val = val.pow(2);
			sum = sum.multiply(val);
			
		}
		
		System.out.println("Product of squares of the first 200 numbers is: " + sum);
					
	}

}
