package servicios;

public interface MenuInterfaz {
	/**
	 * método que muestra el menú de opciones al usuario y recoge la opcion seleccionada
	 * @author JRT 2/3/2024
	 * @param sc
	 * @return la opcion int que selecciona el usuario
	 */
	public int mostrarMenuYSeleccion();
	/**
	 * método que muestra el menú de opciones para la version empleado, recoge la opcion seleccionada
	 * @author JRT 2/3/2024
	 * @param sc
	 * @return la opcion int que selecciona el usuario
	 */
	public void accesoEmpleado();
	/**
	 * método que muestra elmenú de opciones para la version gerencia, recoge la opcion seleccionada
	 * @author JRT 2/3/2024
	 * @param sc
	 * @return la opcion int que selecciona el usuario
	 */
	public void accesoGerencia();

}
