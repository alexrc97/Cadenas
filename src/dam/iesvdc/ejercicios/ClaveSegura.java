package dam.iesvdc.ejercicios;

public class ClaveSegura {
	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	public boolean esClaveSegura () {
		return tieneAlmenos8Caracteres () && Almenos1Minuscula () && 
				Almenos1Mayuscula() && contiene1Digito() && 
				contiene1Alfanumerico();

	}

	private boolean contiene1Alfanumerico() {
		for (int i = 0; i < clave.length(); i++) {
			if ( !Character.isLetterOrDigit(clave.charAt(i)) )
				return true;
		} 
		return false;
		//Posible expresion regular pero muy enrrevesada mejor hacer con bucle
		//return clave.matches ((\w)/_^.*[a-záéíóúüñA-ZÁÉÍÓÚÜÑ0-9].*$)
	}

	private boolean contiene1Digito() {
//		return clave.contains("0123456789");
		return clave.matches("^.*[0-9].*$"); 
	}

	private boolean Almenos1Minuscula() {
		//		for (int i = 0; i < clave.length(); i++) {
		//			if (Character.isLowerCase(clave.charAt(i)))
		//				return true;
		//		} 
		//		return false;
		return clave.matches("^.*[a-záéíóúü].*$");
		//		return clave.contains("a-z,áéíóúü");
	}

	private boolean Almenos1Mayuscula() {
		//		for (int i = 0; i < clave.length(); i++) {
		//			if (Character.isUpperCase(clave.charAt(i)))
		//				return true;
		//		} 
		//		return false;
		return clave.matches("^.*[A-ZÁÉÍÓÚÜ].*$");
	}

	private boolean tieneAlmenos8Caracteres() {
		return clave.length()>=8;
		//return clave.matches([".{8,}"]);
	}
	public static void main (String [] args) {
		ClaveSegura c = new ClaveSegura();
		c.setClave("gÜ?");
		System.out.println(c.contiene1Alfanumerico());
	}
}
