package Conversores;

public class Validar {
	public static boolean Validar(String monto) {
		try {
			Integer.parseInt(monto);
			return true;
		}catch (NumberFormatException numberFormatException) {
			return false;
		}
	}


}
