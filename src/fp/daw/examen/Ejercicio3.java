package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * 3 puntos
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de
	 * dos o más números enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3),
	 * 6(=1+2+3), son números guays.
	 * 
	 * Escribir en el método main un programa que lea un número entero positivo e
	 * indique si éste es guay.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int div;
		int num = 0;
		int suma = 0;

		System.out.println("Introduce un número entero:");
		num = teclado.nextInt();

		for (div = 1; div < num; div++) {
			if (num % div == 0) {
				suma = suma + div;
			}
		}
		if (suma == num) {
			System.out.println("Es un número guay");
		} else {
			System.out.println("Lo siento, tu número no mola");
		}

		teclado.close();
	}

}
