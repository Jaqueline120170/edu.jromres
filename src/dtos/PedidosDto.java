package dtos;

public class PedidosDto {
	/**
	 * <summary>
	 * Clase principal que contendra todos los atributos de PedidosDto
	 *  @author JRT -1/2/2024
	 *  </summary>
	 */


		long idProducto;
		String nombreProducto;
		int cantidadProducto;
		String fechaDeseada;
		
		
		/**
		 * mètodos get y set los cuales formarán una estructura con caracteristicas que identifiquen de forma 
        /// univoca a cada elemento añadido, en este caso a cada "PEDIDO"
        /// @author JRT - 2/3/2024
		 * @return
		 */
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
		/**
		 * Contructor al cual se llamara cuando se haga una copia (new) de los elementos que lo conforman,
       *en este caso los atributos
       *@author JRT - 2/3/2024
		 * @param idProducto
		 * @param nombreProducto
		 * @param cantidadProducto
		 * @param fechaDeseada
		 */
		public PedidosDto(long idProducto, String nombreProducto, int cantidadProducto, String fechaDeseada) {
			super();
			this.idProducto = idProducto;
			this.nombreProducto = nombreProducto;
			this.cantidadProducto = cantidadProducto;
			this.fechaDeseada = fechaDeseada;
		}
		/**
		 * Contructor vacío por defecto 
        /// @author JRT - 2/3/2024
		 */
		public PedidosDto() {
			super();
		}
		
		
		
		
		
	

}
