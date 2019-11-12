package puntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import puntos.Producto;

public class Perfumeria implements Vende {

	private String nombre;
	private Administrador administrador;
	private Set<Cliente> listaUsuarios = new HashSet<Cliente>();
	private List<Venta> listaVentas = new LinkedList<Venta>();
	private List<Producto> listaProducto = new LinkedList<Producto>();
	private Boolean sesionAbierta;

	public Perfumeria(String nombre, Administrador administrador) {
		this.nombre = nombre;
		this.administrador = administrador;
		this.sesionAbierta = false;
	}

	public Perfumeria(String nombre, Administrador administrador, String nombreAd, String apellido, String email,
			String password, Integer id) {
		this.nombre = nombre;
		this.administrador = new Administrador(nombreAd, apellido, email, password);
		this.sesionAbierta = false;
	}
	
	public Perfumeria() {
		
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Cliente> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(HashSet<Cliente> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Venta> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(LinkedList<Venta> listaVentas) {
		this.listaVentas = listaVentas;
	}

	public List<Producto> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(LinkedList<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}
	
	

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public Boolean agregarUsuario(Cliente usuario) {

		return listaUsuarios.add(usuario);

	}

	public Boolean agregarProducto(Producto producto) {

		return listaProducto.add(producto);

	}

	public Boolean agregarVenta(Venta venta) {

		return listaVentas.add(venta);

	}

	public Boolean loguearUsuario(String email, String password) throws EmailOPasswordInvalido {

		for (Cliente lista : listaUsuarios) {

			if (lista.getEmail().equals(email) && lista.getPassword().equals(password)) {
                
				sesionAbierta = true;
				break;

			} else {
				
				sesionAbierta = false;
				throw new EmailOPasswordInvalido();
				
			}
		}
		
		
		return sesionAbierta;

	}

	public void cerrarSesion() {

		if (this.sesionAbierta = true) {
			this.sesionAbierta = false;
		}
	}

	public Boolean eliminarUsuario(Integer idU) throws IdInvalido {

		Boolean eliminado = false;

		Iterator<Cliente> it = listaUsuarios.iterator();

		while (it.hasNext()) {

			Cliente u = it.next();
			if (u.getId().equals(idU)) {
				it.remove();
				eliminado = true;
			}else {
				throw new IdInvalido();
			}

		}

		return eliminado;

	}

	public LinkedList<Producto> buscarProductoPorPuntos(Integer puntos) {

		LinkedList<Producto> productosConPuntos = new LinkedList<Producto>();

		for (Producto buscar : listaProducto) {
			if (buscar.getPunto().equals(puntos)) {
				productosConPuntos.add(buscar);
			}
		}

		return productosConPuntos;
	}

	public Producto buscarProductoPorId(Integer idProducto) throws IdInvalido {

		Producto productoEncontrado = null;

		for (Producto buscarProducto : listaProducto) {
			if (buscarProducto.getId().equals(idProducto)) {

				productoEncontrado = buscarProducto;
			}else {
				throw new IdInvalido();
			}

		}

		return productoEncontrado;

	}

	@Override
	public Double vende(Integer idVenta) throws IdInvalido  {

		Double ganaciaTotal = 0.0;
		Double sumaTotalProductos = 0.0;

		for (Venta ventasAux : listaVentas) {

			if (ventasAux.getIdVenta().equals(idVenta)) {

				sumaTotalProductos += ventasAux.getProducto().getPrecio();
				ganaciaTotal = sumaTotalProductos-devolucionProducto(ventasAux.getProducto().getId());

			}else {
				throw new IdInvalido();
			}

		}

		return ganaciaTotal;
	}

	public Boolean anularCompra(Integer id) throws IdInvalido {

		Boolean compraAnulada = false;

		Iterator<Venta> it = listaVentas.iterator();

		while (it.hasNext()) {

			Venta v = it.next();
			if (v.getIdVenta().equals(id)) {
				it.remove();
				compraAnulada = true;
			}else {
				
				throw new IdInvalido();
			}

		}

		return compraAnulada;

	}
	
	public Double devolucionProducto(Integer idP) throws IdInvalido {
		Double devolucion =0.0;
		for(Producto productoAux : listaProducto) {
			
			if(productoAux.getId().equals(idP)) {
				if(anularCompra(idP) == true) {
				
					devolucion= productoAux.getPrecio();
				
				
			}else {
				throw new IdInvalido();
			}
				
			}
			
			
		}
		
		return devolucion;
	}
}
