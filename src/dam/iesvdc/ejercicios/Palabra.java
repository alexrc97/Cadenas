package dam.iesvdc.ejercicios;

/**
 * Clase que aporta funciones sobre el contenido de una palabra
 * @author Alejandro Ruiz
 *version 1.0
 */
public class Palabra {
	private String contenido;
	
	public Palabra(String contenido) {
		this.contenido = contenido;
	}
	
	
	public int obtenerNumeroLetras() {
		return contenido.length();
	}
	
	public boolean empiezaPorVocal() {
		return contenido.toLowerCase().matches("^[aeiouáéíóú].*$");
	}
	public boolean acabaEnVocal() {
		return contenido.toLowerCase().matches("^.*[aeiouáéíóú]$");
		
	}
	
	public int obtenerNumerosVocales() {
		int contador = 0;
		for (int i = 0; i < contenido.length(); i++) {
			//System.out.println(contenido.charAt(i));
			//if (contenido.toLowerCase().charAt(i) == 'a' || contenido.toLowerCase().charAt(index))
		     if ((""+ contenido.toLowerCase().charAt(i)).matches("[aeiouáéíóú]+"))
		    	 contador++;
		}
		return contador;
	}
	public boolean contenidoH() {
		return contenido.toLowerCase().contains("h");
	}
	
	public boolean esPalindromo() {
//	StringBuilder stringBuilder = new StringBuilder(contenido);
//		StringBuilder stringBuilderReserve = stringBuilder.reverse();
//		StringBuilder contenidoReserve  = stringBuilderReverse.toString();
//		return contenido.equalsIgnoreCase(contenidoReverse);
	    return contenido.equalsIgnoreCase(
	    		new StringBuilder(contenido).reverse().toString());
	
	}
	
	public boolean sonIguales(String palabra) {
		return contenido.equalsIgnoreCase(palabra);
	}
	
}
