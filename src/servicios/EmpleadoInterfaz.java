package servicios;

import java.util.List;

import dtos.PedidosDto;
import dtos.VentasDto;

public interface EmpleadoInterfaz {
	/**
	 * metodo para añadir una venta
	 * 
	 * @param listaVentas
	 */
	public void aniadirVenta(List<VentasDto> listaVentas);
	public void calculoVentasDiarias  (List<VentasDto>listaVentas);
	public void crearPedido(List<PedidosDto>listaPedidos);

}
