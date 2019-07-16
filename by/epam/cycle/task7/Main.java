package by.epam.cycle.task7;

import java.util.Scanner;

public class Main {
	
	private int m=0;
	private int n=0;
	
	public static int getIntValueFromKeyboard() {
	
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt() != true) {
			System.out.println("Please enter int value...");
			sc.next();
		}
		
		int i = sc.nextInt();
		//sc.close();
		return i;
		
	}
	
	public static int getNaturalValue(String valueName) {
		
		System.out.println("Please enter natural nubmer for " + valueName + " value");
		int n = 0;
		n = getIntValueFromKeyboard();
		
		while (n<=0) {
			
			System.out.println("" + n + " is not a natural value. Try again");
			n = getIntValueFromKeyboard(); 
			
		}
		
		System.out.println("" + valueName + " is " + n);
		return n;
		
		
	}
	
	public void getIntervalNaturalNumbers() {
		
		this.m = getNaturalValue("m");
		this.n = getNaturalValue("n");
		
		while (this.m>=this.n) {
			
			System.out.printf("Interval [m, n] = [%d, %d] is illegal. Enter m and n where m<n /n", this.m, this.n);
			this.m = getNaturalValue("m");
			this.n = getNaturalValue("n");
			
		}
		
	}
	
	public void getDividerForNumbersFromInterval() {
		
		for (int i = m; i <= n; i++) {
			
			int n = i;
			System.out.println("Number for analysis: " + i);
			
			for (int x = m; x <= n; x++) {
				if (n % x == 0) {
					if ((x != 1)) {
						if (n != x) {
							System.out.println("divider: " + x);
						}
					}
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		/*
		7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
		m и n вводятся с клавиатуры
		*/
		
		//1) get scan for m and n interval
		Main prog = new Main();
		prog.getIntervalNaturalNumbers();		
		//2) run cycle to get natural number
		//3) run procedyre to get all divider of this number
		prog.getDividerForNumbersFromInterval();
		
	}				
}
