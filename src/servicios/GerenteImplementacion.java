package servicios;

import java.time.LocalDateTime;
/**
 * Clase con la implementación de cada método para la operativa de calculos en función de la opcion que seleccione el usuario
 * @author JRT 2/3/2024
 */
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dtos.PedidosDto;
import dtos.VentasDto;

public class GerenteImplementacion implements GerenteInterfaz {

	Scanner sc = new Scanner (System.in);
	
	public void aniadirVenta(List<VentasDto> listaVentas) {
		
		System.out.println("AÑADIR VENTA");
		
		long idCalculado = calculoId(listaVentas);
		System.out.println("Introduzca la fecha ");
		String fecha = sc.next();
		LocalDateTime fechas = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern(fecha);
		LocalDateTime parsed = LocalDateTime.parse(fecha, format);
		System.out.println("Introduzca el importe de la venta ");
		int importe=sc.nextInt();
		
		VentasDto venta = new VentasDto(idCalculado, parsed, importe);
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
	long id=idCalculo(listaPedidos);
	System.out.println("Introduzca el nombre del producto ");
	String nombre = sc.next();
	System.out.println("Introduzca la cantidad");
	int cantidad = sc.nextInt();
	System.out.println("Introduzca la fecha en la que desea recibir el producto en formato YYYY.MM-dd");
	String fecha = sc.next();
	DateTimeFormatter format = DateTimeFormatter.ofPattern(fecha);
	LocalDateTime parsed = LocalDateTime.parse(fecha, format);
	String fechaFin = fechaFin.formatted(format);
	PedidosDto pedido= new PedidosDto(id,nombre,cantidad,fechaFin);
	listaPedidos.add(pedido);
private long idCalculo(List<PedidosDto>listaPedidos) {
		
		long idCalculado;
        int tamanioLista = listaPedidos.size();
        if (tamanioLista == 0)
        {
            idCalculado = 1;
        }
        else
        {
            idCalculado = listaPedidos.get(tamanioLista-1).getIdProducto();
        }

        return idCalculado;
	}
		
			
}
		
			
}


}

