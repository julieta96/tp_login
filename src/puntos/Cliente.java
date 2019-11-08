package puntos;

public class Cliente extends Usuario implements Comprar {

	private Integer puntos;

	public Cliente(String nombre, String apellido, String email, String password, Integer id) {
		super(nombre, apellido, email, password, id);

		this.puntos = 0;

	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((puntos == null) ? 0 : puntos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (puntos == null) {
			if (other.puntos != null)
				return false;
		} else if (!puntos.equals(other.puntos))
			return false;
		return true;
	}

	@Override
	public Boolean comprar(Cliente cliente, Producto p, Integer id) {

		Producto productoEncontrado = null;
		Boolean compraExitosa = false;
		Perfumeria productos = null;
		Perfumeria ventas = null;

		for (Producto buscarProducto : productos.getListaProducto()) {
			if (buscarProducto.equals(p)) {
				if (buscarProducto.getEstado() == true) {

					ventas.agregarVenta(new Venta(cliente, p, id));
					compraExitosa = true;

				}

			}

		}

		return compraExitosa;

	}

}
