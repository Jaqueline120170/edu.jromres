package dtos;

import java.time.LocalDateTime;

public class VentasDto {

	long idVenta;
	LocalDateTime  fecha = LocalDateTime.now();
	int importeVenta;
	
	
	
	
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
	
	
	
	
	
	
	


	
	
	
	

		
		


}
