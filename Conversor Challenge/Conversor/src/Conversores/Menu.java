package Conversores;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] opcion = {"Seleccione una opcion:","Conversor de Divisas", "Conversor de Temperatura","salir"};
		String Seleccion = (String) JOptionPane.showInputDialog(null, "Seleciona una opcion","Convesor",
				JOptionPane.INFORMATION_MESSAGE, null, opcion, opcion[0]);
		
		switch(Seleccion){
        	case "Conversor de Divisas": 
        		Monedas Opcionesdivisas = new Monedas();
        		Opcionesdivisas.divisa();
        		break;
        	case "Conversor de Temperatura": 
        		Temperatura Temperatura = new Temperatura();
        		Temperatura.escala();
        		break;
        	case "salir":
				System.exit(0);
				break;
		}
	}
}
