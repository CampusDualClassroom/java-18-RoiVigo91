package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static int[] createAndInitializeArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}

		return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}


	public static void main(String[] args) {
		int n = Utils.integer("Introduce el tamaño del array (número natural): ");
		while (n <= 0) {
			System.out.println("El tamaño del array debe ser un número natural positivo.");
			n = Utils.integer("Introduce un tamaño válido: ");
		}
		int[] array = createAndInitializeArray(n);
		System.out.print("Elementos del array: ");
		showInlineArray(array);
	}
}
