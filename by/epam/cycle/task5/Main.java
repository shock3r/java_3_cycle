package by.epam.cycle.task5;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		/*
		 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
		 *заданному е. Общий член ряда имеет вид: an = 1/2^n + 1/3^n
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter e:");
		
		while (sc.hasNextDouble() == false) {
			System.out.println("Enter e:");
			sc.next();
		}
		
		Double e;
		e = sc.nextDouble();
		System.out.println("E value is: " + e);
		
		double sum = 0;
		double memberValue = 0;
		double n = 0;
		
		while (sum < e) {
			
		memberValue = 1/Math.pow(2, n) + 1/Math.pow(3, n);
		sum += memberValue;
		System.out.printf("a[%.0f] = %.2f, sum = %.2f\n", n, memberValue, sum);
		n++;
		
		}
					
	}

}
