
public class Ejercitacion1 {

	public static void main(String[] args) {
		// Ejercicio 1
		System.out.println("Ejercicio 1: " + holaMundo("Hola mundo"));

		// Ejercicio 2
		System.out.println("Ejercicio 2: " + (unNumeroA(10) + unNumeroB(2.5)));
		System.out.println("Ejercicio 2: " + (unNumeroA(25) - unNumeroB(5.5)));

		// Ejercicio 3
		System.out.println("Ejercicio 3: " + menorQueElSegundo(15, 10));

		// Ejercicio 4
		System.out.println("Ejercicio 4: " + maximoEntreTresNumeros(102, 101, 100));

		// Ejercicio 5
		System.out.println("Ejercicio 5: " + cadenasDeTextoDistintas("Nos vimos en Disney", "Un texto cualquiera"));

		// Ejercicio 6
		System.out.println("Ejercicio 6: " + esPar(12));

	}

	// Ejercicio 1

	static String holaMundo(String saludo) {
		return saludo;
	}

	// Ejercicio 2

	static Integer unNumeroA(int num1) {
		return num1;
	}

	static double unNumeroB(double num2) {
		return num2;
	}

	static String unaCadenaDeTexto(String texto) {
		return texto;
	}

	// Ejercicio 3

	static Boolean menorQueElSegundo(int unNumeroA, int unNumeroB) {
		if (unNumeroA < unNumeroB) {
			return true;
		} else {
			return false;
		}
	}

	// Ejercicio 4

	static Integer maximoEntreTresNumeros(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		}
		if (num2 > num1 && num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	// Ejercicio 5

	static Boolean cadenasDeTextoDistintas(String textoA, String textoB) {
		if (textoA != textoB) {
			return true;
		} else {
			return false;
		}

	}

	// Ejercicio 6
	static Boolean esPar(int unNum) {
		if (unNum % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
