package dam.iesvdc.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ParseoFichero {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> nombresEmpiezanPorA = new ArrayList<>();
		List<String> nombresNoAcabanEnVocal = new ArrayList<>();
		List<String> nombresMayorTamaño = new ArrayList<>();
		List<String> nombresMenorTamaño = new ArrayList<>();
		File fichero = new File ("archivos_ejercicios/nombres_mujer.txt");
		
		Scanner sc = new Scanner (fichero);
		int numeroLineas = 0;
		String linea;
		int nombreMayorTamaño = 0;
		int nombreMenorTamaño = 0;
		while (sc.hasNextLine() ) {
			linea = sc.nextLine();
			numeroLineas ++;
			if (linea.matches("^[AaÁá].*") ){
				nombresEmpiezanPorA.add(linea);
		}
			if (!linea.matches(".*[aeiouAEIOUáéíóúÁÉÍÓÚüÜ]$")){
				nombresNoAcabanEnVocal.add(linea);
			}
			if (linea.length()>=nombreMayorTamaño) {
				nombreMayorTamaño=linea.length();
				nombresMayorTamaño.clear();
				nombresMayorTamaño.add(linea);
			} //preguntar si el linea-length(9 tiene en cuenta los espacios porque podria ser que un nombre fuera mas largo pero al ser compuesto solo se tomara en cuenta la primera palabra

			if (linea.length()>=nombreMenorTamaño) {
				nombreMenorTamaño=linea.length();
				nombresMenorTamaño.clear();
				nombresMenorTamaño.add(linea);
			}
			
//		int numeroPalabras = 0;
//		while (sc.next().matches(".+\s+.+") {
//			numeroPalabras++;
//		}
//		System.out.println(numeroPalabras);
		
		}
		sc.close();
		System.out.println("Numero de nombres: " + numeroLineas);
		System.out.println(nombresEmpiezanPorA);
		System.out.println(nombresNoAcabanEnVocal);
		System.out.println(nombresMayorTamaño);
		System.out.println(nombresMenorTamaño);
	}
	
}
