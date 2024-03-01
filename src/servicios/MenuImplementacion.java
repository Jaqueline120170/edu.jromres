package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.VentasDto;

public class MenuImplementacion implements MenuInterfaz {
	
	List <VentasDto> listaVentas = new ArrayList <VentasDto>();
	EmpleadoInterfaz ei = new EmpleadoImplementacion();
	Scanner sc = new Scanner(System.in);
		
		public int mostrarMenuYSeleccion() {
			int seleccionUsuario;
			
			System.out.println("0. Cerrar Menu");
			System.out.println("1. ACCESO EMPLEADO");
			System.out.println("2. ACCESO GERENTE");
			
			seleccionUsuario= sc.nextInt();
			return seleccionUsuario;
		
		}
		
		
		public void accesoEmpleado() {
			 int seleccionEmpleado=menuEmpleado();
			 System.out.println("MENU EMPLEADO");
			 switch(seleccionEmpleado) {
			 case 0:
				 break;
			 case 1 :
				 ei.añadirVenta(listaVentas);
				 break;
			 case 2 :
				 ei.calculoVentasDiarias(listaVentas);
				 break;
			 case 3:
				 break;
			 case 4:
				 ei.crearPedido
				 break;
			default:
				System.out.println("INTRODUZCA OPCION VALIDA");
			 
			 }
		}
	
		private int menuEmpleado() {
			int opcionEmpleado;
		System.out.println("0. Volver");
		System.out.println("1. Introducir 3 ventas");
		System.out.println("2. Ver total ventas diarias");
		System.out.println("3. Ver total ventas por dia ");
		System.out.println("4. Crear pedido");
		opcionEmpleado = sc.nextInt();
		return opcionEmpleado;
			
			
		}
		
		public void accesoGerencia() {
			 int seleccionGerencia=menuEmpleado();
			 System.out.println("MENU EMPLEADO");
			 switch(seleccionGerencia) {
			 case 0:
				 break;
			 case 1 :
				 break;
			 case 2 :
				 break;
			 case 3:
				 break;
			 case 4:
				 break;
			default:
				System.out.println("INTRODUZCA OPCION VALIDA");
			 
			 }
		}
		private int menuGerencia() {
			int opcionGerencia;
			System.out.println("0. Volver");
			System.out.println("1. Introducir 3 ventas");
			System.out.println("2. Ver total ventas diarias");
			System.out.println("3. Ver total ventas por dia ");
			System.out.println("4. Crear pedido");
			opcionGerencia = sc.nextInt();
			return opcionGerencia;
			
		}
}
