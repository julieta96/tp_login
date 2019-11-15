package puntos;

public interface Vende {
	
	public Double venderConPuntos(Integer idVenta)throws PuntosInsuficientesException;
	public Double venderConEfectivo(Integer idVenta);

}
