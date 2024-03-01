package controladores;

import java.util.Scanner;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
/**
 *  Clase principal de la aplicación
 * @author JRT 1/2/2024
 */

public class Inicio {
	/**
	 * Método de entrada a la aplicación
	 * @author JRT - 1-2/204
	 * @param args
	 */
	

	
	public static void main(String[] args) {
		MenuInterfaz mi = new MenuImplementacion();
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean cerrarMenu=false;
		
		while(!cerrarMenu) {
			
			opcion=mi.mostrarMenuYSeleccion();
			
			switch(opcion) {
			case 0:
				System.out.println("0. Se ejecuta CERRAR MENU");
				cerrarMenu=true;
				break;
			case 1:
				System.out.println("SE EJECUTA CASO 1 ");
				mi.accesoEmpleado();
				break;
			case 2:
				System.out.println("SE EJECUTA CASO 2");
				mi.accesoGerencia();
				break;
			default:
				System.out.println("INTRODUZCA OPCION VALIDA");
				break;
				
			
			}
		}

	}

}
