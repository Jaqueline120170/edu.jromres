package servicios;

import java.util.List;

import dtos.PedidosDto;
import dtos.VentasDto;

public interface EmpleadoInterfaz {
	/**
	 * metodo para añadir una venta
	 * @author JRT 2/3/2024
	 * @param listaVentas
	 */
	public void aniadirVenta(List<VentasDto> listaVentas);
	/**
	 * metodo para añadir calcular el monto de ventas diarias
	 * @author JRT 2/3/2024
	 * @param listaVentas
	 */
	
	public void calculoVentasDiarias  (List<VentasDto>listaVentas);
	/**
	 * metodo paracrear un pedido
	 * @author JRT 2/3/2024
	 * @param listaPedidos
	 */
	public void crearPedido(List<PedidosDto>listaPedidos);
	

}
