package dtos;

public class PedidosDto {

		long idProducto;
		String nombreProducto;
		int cantidadProducto;
		String fechaDeseada;
		public long getIdProducto() {
			return idProducto;
		}
		public void setIdProducto(long idProducto) {
			this.idProducto = idProducto;
		}
		public String getNombreProducto() {
			return nombreProducto;
		}
		public void setNombreProducto(String nombreProducto) {
			this.nombreProducto = nombreProducto;
		}
		public int getCantidadProducto() {
			return cantidadProducto;
		}
		public void setCantidadProducto(int cantidadProducto) {
			this.cantidadProducto = cantidadProducto;
		}
		public String getFechaDeseada() {
			return fechaDeseada;
		}
		public void setFechaDeseada(String fechaDeseada) {
			this.fechaDeseada = fechaDeseada;
		}
		public PedidosDto(long idProducto, String nombreProducto, int cantidadProducto, String fechaDeseada) {
			super();
			this.idProducto = idProducto;
			this.nombreProducto = nombreProducto;
			this.cantidadProducto = cantidadProducto;
			this.fechaDeseada = fechaDeseada;
		}
		public PedidosDto() {
			super();
		}
		
		
		
		
		
	

}
