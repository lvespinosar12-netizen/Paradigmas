package co.edu.poli.actividad.modelo;

import java.util.Arrays;

/**
 * 
 */
public final class Tour {

    public Tour(int precio, int duracion, String ubicacion, String idTour, String fecha, Transporte[] transporte,
			Guia[] guia, Itinerario[] itinerario) {
		super();
		this.precio = precio;
		this.duracion = duracion;
		this.ubicacion = ubicacion;
		this.idTour = idTour;
		this.fecha = fecha;
		this.transporte = transporte;
		this.guia = guia;
		this.itinerario = itinerario;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getIdTour() {
		return idTour;
	}

	public void setIdTour(String idTour) {
		this.idTour = idTour;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Transporte[] getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte[] transporte) {
		this.transporte = transporte;
	}

	public Guia[] getGuia() {
		return guia;
	}

	public void setGuia(Guia[] guia) {
		this.guia = guia;
	}

	public Itinerario[] getItinerario() {
		return itinerario;
	}

	public void setItinerario(Itinerario[] itinerario) {
		this.itinerario = itinerario;
	}

	@Override
	public String toString() {
		return "Tour [precio=" + precio + ", duracion=" + duracion + ", ubicacion=" + ubicacion + ", idTour=" + idTour
				+ ", fecha=" + fecha + ", transporte=" + Arrays.toString(transporte) + ", guia=" + Arrays.toString(guia)
				+ ", itinerario=" + Arrays.toString(itinerario) + "]";
	}

	/**
     * 
     */
    private int precio;

    /**
     * 
     */
    private int duracion;

    /**
     * 
     */
    private String ubicacion;

    /**
     * 
     */
    private String idTour;

    /**
     * 
     */
    private String fecha;

    /**
     * 
     */
    private Transporte [] transporte;

    /**
     * 
     */
    private Guia [] guia;

    /**
     * 
     */
    private Itinerario [] itinerario;

    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }



}