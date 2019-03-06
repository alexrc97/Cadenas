package dam.iesvdc.ejercicios;

import java.util.Scanner;

public class PruebaPalabra {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una palabra");
		String palabra = sc.next();
		sc.close();
		if (palabra.toLowerCase().matches("[[a-zñáéíóúü]]+")) {
			Palabra p = new Palabra (palabra);
			System.out.printf("La palabra %s tiene %d letras, "
					+ " y tiene %d  vocales.%n"
					+ "¿Empieza por vocal? %b%n"
					+ "¿Acaba por vocal? %b%n"
					+ "¿Es un palindromo? %b%n", palabra,p.obtenerNumeroLetras(),p.obtenerNumerosVocales(),p.empiezaPorVocal(),p.acabaEnVocal(),p.esPalindromo());
		}
		else 
			System.out.printf("%s no es una palabra",palabra);

	}

}
