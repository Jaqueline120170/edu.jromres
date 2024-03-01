package servicios;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import dtos.VentasDto;

import dtos.PedidosDto;

/**
 * Clase con la implementación de cada método para la operativa de calculos en función de la opcion que seleccione el usuario
 * @author JRT 2/3/2024
 */
public class EmpleadoImplementacion implements EmpleadoInterfaz {

	
		Scanner sc = new Scanner (System.in);
		
		public void aniadirVenta(List<VentasDto> listaVentas) {
			
			System.out.println("AÑADIR VENTA");
			
			long idCalculado = calculoId(listaVentas);
			LocalDateTime fechas = LocalDateTime.now();
			System.out.println("Introduzca el importe de la venta ");
			int importe=sc.nextInt();
			
			VentasDto venta = new VentasDto(idCalculado, fechas, importe);
			listaVentas.add(venta);
			
		}
	private long calculoId (List<VentasDto>listaVentas) {
		
		  long idCalculado;
	        int tamanioLista = listaVentas.size();
	        if (tamanioLista == 0)
	        {
	            idCalculado = 1;
	        }
	        else
	        {
	            idCalculado = listaVentas.get(tamanioLista-1).getIdVenta();
	        }

	        return idCalculado;
	}
	
	public void calculoVentasDiarias  (List<VentasDto>listaVentas) {
		System.out.println("CALCULAR VENTAS DIARIAS");
		VentasDto venta = new VentasDto();
		System.out.println("Introduzca la fecha de la venta en formato YYYY-MM-dd");
		String fechaVenta=sc.next();
		DateTimeFormatter format = DateTimeFormatter.ofPattern(fechaVenta);
		LocalDateTime parsed = LocalDateTime.parse(fechaVenta, format);
		Period p = Period.between(parsed,venta.getFecha());
	
		
		
		System.out.println("El calculo de ventas diarias es de :  "+  venta.getImporteVenta() + p );
	}
	
	
	public void crearPedido(List<PedidosDto>listaPedidos) {
		
		System.out.println("REALIZAR PEDIDO");
		
		System.out.println("Introduzca el nombre del producto ");
		String nombre = sc.next();
		System.out.println("Introduzca la cantidad");
		int cantidad = sc.nextInt();
		System.out.println("Introduzca la fecha en la que desea recibir el producto en formato YYYY.MM-dd");
		String fecha = sc.next();
		DateTimeFormatter format = DateTimeFormatter.ofPattern(fecha);
		LocalDateTime parsed = LocalDateTime.parse(fecha, format);
		System.out.println("¿Desea introducir otro pedido? responda s/n");
		if(sc.next().charAt(0) == 's') {
			
				
	}
	public void introducirPedido(List<PedidosDto>listaPedidos) {
		
	}

}
}

