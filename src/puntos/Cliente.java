package puntos;

public class Cliente extends Usuario implements Comprar , Comparable <Cliente>{

	private Integer puntos;

	public Cliente(String nombre, String apellido, String email, String password) {
		super(nombre, apellido, email, password);

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
	public Boolean comprar(Cliente cliente, Producto p) {
		Boolean compraExitosa = false;
//		Perfumeria pf1 = new Perfumeria();
//		// Perfumeria productos = p1 ;
//		Perfumeria v = new Perfumeria();
//
//		for (Producto buscarProducto : pf1.getListaProducto()) {
//			if (buscarProducto.equals(p)) {
//				if (buscarProducto.getEstado() == true) {
//
//					v.agregarVenta(new Venta(cliente, p));
//					this.puntos = this.puntos + p.getPunto();
//					compraExitosa = true;
//
//				}
//
//			}
//
//		}
//		
		return compraExitosa;
	}

	@Override
	public int compareTo(Cliente c1) {
		
		return this.getNombre().compareTo(c1.getNombre());
	}

}
