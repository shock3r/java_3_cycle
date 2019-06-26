package by.epam.cycle.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	/*
	 * @return int or -1 if error
	 */
	private static int getScanFromKeyboard() {
		
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try{
			
			i = sc.nextInt();
			
		} catch (InputMismatchException e) {
			
			System.out.println("Input from keyboard does not match the Integerregular expression, or is out of range");
			return -1;
		}
		
		if (i > 0) {
			
			return i;
			
		} else {
			
			return -1;
			
		}
		
	}
	
	private static int getSummInTheLoop(int a) {
		
		int summ = 0;
		
		for (int i=0; i <= a; i++) {
			
			summ += i;
			
		}
		
		return summ;
		
	}
	
	

	public static void main(String[] args) {
		
		/*
		 * 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
		 * все числа от 1 до введенного пользователем числа.
		 */
		
		System.out.println("Input expression from keyboard that >= 0:");
		int inKey = getScanFromKeyboard();
		
		while (inKey == -1) {
			
			System.out.println("Input from keyboard must be >= 0");
			inKey = getScanFromKeyboard();
				
		}
		
		System.out.printf("Input variable is: %d\n", inKey);
		int summOfInKey = getSummInTheLoop(inKey);
		System.out.printf("Sum in loop is: %d\n",  summOfInKey);
		
	}

}
