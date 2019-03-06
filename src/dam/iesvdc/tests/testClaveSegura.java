package dam.iesvdc.tests;

import java.util.Scanner;

import dam.iesvdc.ejercicios.ClaveSegura;

public class testClaveSegura {
	final static String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLm-"
			+"MnNñÑNoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}";
	public static void main(String[] args) {
		
		System.out.println("Indica la logitud maxima de la clave (max 1000)");
		Scanner sc = new Scanner ( System.in );
		String sLongitudClave = sc.next();//si leyeramos con nexint saltaria excepcion de este modo salta mensaje de error
		sc.close();
		if (!sLongitudClave.matches("[0-9]{1,3}")) {
			System.out.println("No es valido el dato");
			return;
		}
		int iLongitudClave = Integer.parseInt(sLongitudClave);
		System.out.println("Tu clave va a tener una longitud de " + iLongitudClave);
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < iLongitudClave; i++) {
//			System.out.println("Caracter recibido " + obtenerCaracterAleatorio());
			stringBuilder.append(obtenerCaracterAleatorio());
		}
		// creamos un objeto claveSegura
		ClaveSegura claveSegura = new ClaveSegura();
		claveSegura.setClave(stringBuilder.toString());
		System.out.printf("%s ¿Es clave segura? %b%n",claveSegura.getClave(),claveSegura.esClaveSegura());
		
	}
	public static char obtenerCaracterAleatorio () {
//		int posicion = (int) Math.random()*FUENTE_CARACTERES.length();
//		return FUENTE_CARACTERES.charAt(posicion);
		return FUENTE_CARACTERES.charAt((int) (Math.random()*FUENTE_CARACTERES.length()));
	}
}
