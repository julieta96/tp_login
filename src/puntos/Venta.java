package puntos;

import puntos.Producto;
import puntos.Cliente;

public class Venta {
	
	private Usuario cliente;
	private Producto producto;
	private Integer idVenta;
	
	public Venta(Usuario cliente , Producto producto , Integer idVenta) {
		this.cliente=cliente;
		this.producto=producto;
		this.idVenta=idVenta;
		
	}
	
	public Venta(String nombre , String apellido , String email  , String password , Integer idCliente, Double precio , Integer punto , Integer idProducto , String descripcion , Integer idVenta) {
		this.cliente=new Cliente(nombre, apellido, email, password, idCliente);
		this.producto=new Producto(precio , punto , idProducto , descripcion);
		this.idVenta=idVenta;
		
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	
}
