package pack3;

import java.util.Arrays;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		int n;

		System.out.println("Enter number of elements in array: ");
		n = cin.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + i + " element of array :");
			numbers[i] = cin.nextInt();
		}

		Arrays.sort(numbers);// built in function to sort in Arrays lib

		System.out.print("Duplicate elements: ");
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i + 1]) {
				System.out.print(numbers[i] + " ");
			}
		}
	}
}
