package by.epam.cycle.task9;

import java.util.Scanner;

public class Main {

	private int m = 0;
	private int n = 0;

	private int firstArrayLength = 0; // array 1 length
	private int secondArrayLength = 0; // array 2 length

	private int firstArray[];
	private int secondArray[];

	public void getIntervalNaturalNumbers() {

		this.m = getNaturalValue("m");
		this.n = getNaturalValue("n");

	}

	public static int getIntValueFromKeyboard() {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt() != true) {
			System.out.println("Please enter int value...");
			sc.next();
		}

		int i = sc.nextInt();
		// sc.close();
		return i;

	}

	public static int getNaturalValue(String valueName) {

		System.out.println("Please enter natural nubmer for " + valueName + " value");
		int n = 0;
		n = getIntValueFromKeyboard();

		while (n <= 0) {

			System.out.println("" + n + " is not a natural value. Try again");
			n = getIntValueFromKeyboard();

		}

		System.out.println("" + valueName + " is " + n);
		return n;

	}

	public void getCommonNumbers(int mAnalysis, int i, int arrayNumber) {

		int a = 0;
		int b = 0;

		if (mAnalysis > 0) {

			b = mAnalysis % 10;
			a = mAnalysis / 10;
			i++;

			if (arrayNumber == 1) {
				this.firstArrayLength++;
			} else if (arrayNumber == 2) {
				this.secondArrayLength++;
			}
			;

			// System.out.println("" + i + " - b: " + b);
			getCommonNumbers(a, i, arrayNumber);
		}

	}

	public void addDataToArray(int mAnalysis, int i, int arrayNumber) {

		int a = 0;
		int b = 0;

		if (mAnalysis > 0) {

			b = mAnalysis % 10;
			a = mAnalysis / 10;
			i++;

			if (arrayNumber == 1) {
				this.firstArray[i - 1] = b;
			} else if (arrayNumber == 2) {
				this.secondArray[i - 1] = b;
			}
			;

			// System.out.println("" + i + " - b: " + b);
			addDataToArray(a, i, arrayNumber);

		}
	}

	public void getArraysMathNumbers() {

		this.firstArray = new int[this.firstArrayLength];
		this.secondArray = new int[this.secondArrayLength];

		addDataToArray(this.m, 0, 1);
		addDataToArray(this.n, 0, 2);

		System.out.println("m and n common numbers are:");

		// get unique counter;
		int u = 0;
		for (int x = 0; x < this.firstArrayLength; x++) {

			for (int y = 0; y < this.secondArrayLength; y++) {

				if (this.firstArray[x] == this.secondArray[y]) {
					u++;
					// System.out.println(firstArray[x]);

				}
			}
		}

		if (u > 0) {

			// add all data
			int uniqueArray[] = new int[u];
			u = 0;

			for (int x = 0; x < this.firstArrayLength; x++) {

				for (int y = 0; y < this.secondArrayLength; y++) {

					if (this.firstArray[x] == this.secondArray[y]) {

						uniqueArray[u] = this.firstArray[x];
						u++;

					}
				}
			}

			// view unique data:

			for (int x = 0; x < uniqueArray.length; x++) {

				for (int y = 0; y < uniqueArray.length; y++) {
					
					if ((uniqueArray[x] == uniqueArray[y]) && (y < x)) {

						break;
					}
					
					if ((uniqueArray[x] == uniqueArray[y]) && (x == y)) {

						System.out.println(uniqueArray[x]);
						break;
					}

					if ((uniqueArray[x] == uniqueArray[y]) && (y > x)) {

						break;
					}
				}

			}
		}

	}

	public static void main(String[] args) {

		/*
		 * 8. Даны два числа. Определить цифры входящие в запись как первого так и
		 * второго числа.
		 */

		Main prog = new Main();
		prog.getIntervalNaturalNumbers();

		// get arrays lenghts
		prog.getCommonNumbers(prog.m, 0, 1);
		prog.getCommonNumbers(prog.n, 0, 2);

		prog.getArraysMathNumbers();

	}
}
