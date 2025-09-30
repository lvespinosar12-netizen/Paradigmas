package co.edu.poli.actividad.modelo;


/**
 * 
 */
public class Itinerario {

    public Itinerario(String idItinerario, String actividad, int duracion, boolean transporte, int precio) {
		super();
		this.idItinerario = idItinerario;
		this.actividad = actividad;
		this.duracion = duracion;
		this.transporte = transporte;
		this.precio = precio;
	}

	public String getIdItinerario() {
		return idItinerario;
	}

	public void setIdItinerario(String idItinerario) {
		this.idItinerario = idItinerario;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isTransporte() {
		return transporte;
	}

	public void setTransporte(boolean transporte) {
		this.transporte = transporte;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Itinerario [idItinerario=" + idItinerario + ", actividad=" + actividad + ", duracion=" + duracion
				+ ", transporte=" + transporte + ", precio=" + precio + "]";
	}


	/**
     * 
     */
    private String idItinerario;

    /**
     * 
     */
    private String actividad;

    /**
     * 
     */
    private int duracion;

    /**
     * 
     */
    private boolean transporte;

    /**
     * 
     */
    private int precio;

    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }



}