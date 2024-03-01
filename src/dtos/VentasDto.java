package dtos;

import java.time.LocalDateTime;

public class VentasDto {

	/**
	 * <summary>
	 * Clase principal que contendra todos los atributos de VentasDto
	 *  @author JRT -1/2/2024
	 *  </summary>
	 */

	long idVenta;
	String nombreProducto;
	LocalDateTime  fecha = LocalDateTime.now();
	int importeVenta;
	
	
	/**
	 * Contructor al cual se llamara cuando se haga una copia (new) de los elementos que lo conforman,
       /// en este caso los atributos
       /// @author JRT - 2/3/2024
	 * @param idVenta
	 * @param fecha
	 * @param importeVenta
	 */
	
	public VentasDto(long idVenta, LocalDateTime fecha, int importeVenta) {
		super();
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.importeVenta = importeVenta;
	}


	public long getIdVenta() {
		return idVenta;
	}


	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public int getImporteVenta() {
		return importeVenta;
	}


	public void setImporteVenta(int importeVenta) {
		this.importeVenta = importeVenta;
	}
	
	/**
	 * mètodos get y set los cuales formarán una estructura con caracteristicas que identifiquen de forma 
    * univoca a cada elemento añadido, en este caso a cada "venta"
    * @author JRT - 2/3/2024
	 * @return
	 */
	
	
	
	
	
	
	
	


	
	
	
	

		
		


}
