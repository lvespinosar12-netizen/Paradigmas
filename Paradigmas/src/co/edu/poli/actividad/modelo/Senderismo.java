package co.edu.poli.actividad.modelo;

/**
 * 
 */
public class Senderismo extends Actividad_turistica {

    private String tipoTerreno;
    private double distanciaRecorrida;
	public Senderismo(String lugar, int duracion, int precio, String nombre, String fecha, String tipo,
			String idActividad, Pais pais, Tour tour, Reserva[] reserva, Equipaje[] equipaje, Itinerario itinerario,
			Guia[] guia, int creacion, String tipoTerreno, double distanciaRecorrida) {
		super(lugar, duracion, precio, nombre, fecha, tipo, idActividad, pais, tour, reserva, equipaje, itinerario,
				guia, creacion);
		this.tipoTerreno = tipoTerreno;
		this.distanciaRecorrida = distanciaRecorrida;
	}
	public String getTipoTerreno() {
		return tipoTerreno;
	}
	public void setTipoTerreno(String tipoTerreno) {
		this.tipoTerreno = tipoTerreno;
	}
	public double getDistanciaRecorrida() {
		return distanciaRecorrida;
	}
	public void setDistanciaRecorrida(double distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}
	@Override
	public String toString() {
		return "Senderismo [tipoTerreno=" + tipoTerreno + ", distanciaRecorrida=" + distanciaRecorrida + ", toString()="
				+ super.toString() + "]";
	}
	 public double calcularCosto(double precio) {
	        // TODO implement here
	        return (distanciaRecorrida * getPrecio());
	    }
    
}