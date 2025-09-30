package co.edu.poli.actividad.modelo;

//import co.edu.poli.actividad.modelo.Senderismo;
import java.util.Arrays;

/**
 * 
 */
public abstract class Actividad_turistica {


    public Actividad_turistica(String lugar, int duracion, int precio, String nombre, String fecha, String tipo,
			String idActividad, Pais pais, Tour tour, Reserva[] reserva, Equipaje[] equipaje, Itinerario itinerario,
			Guia[] guia, int creacion) {
		super();
		this.lugar = lugar;
		this.duracion = duracion;
		this.precio = precio;
		this.nombre = nombre;
		this.fecha = fecha;
		this.tipo = tipo;
		this.idActividad = idActividad;
		this.pais = pais;
		this.tour = tour;
		this.reserva = reserva;
		this.equipaje = equipaje;
		this.itinerario = itinerario;
		this.guia = guia;
		this.creacion = creacion;
	}

    
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIdActividad() {
		return idActividad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	public Reserva[] getReserva() {
		return reserva;
	}

	public void setReserva(Reserva[] reserva) {
		this.reserva = reserva;
	}

	public Equipaje[] getEquipaje() {
		return equipaje;
	}

	public void setEquipaje(Equipaje[] equipaje) {
		this.equipaje = equipaje;
	}

	public Itinerario getItinerario() {
		return itinerario;
	}

	public void setItinerario(Itinerario itinerario) {
		this.itinerario = itinerario;
	}

	public Guia[] getGuia() {
		return guia;
	}

	public void setGuia(Guia[] guia) {
		this.guia = guia;
	}

	public int getCreacion() {
		return creacion;
	}

	public void setCreacion(int creacion) {
		this.creacion = creacion;
	}


	@Override
	
	public String toString() {
		return "Actividad_turistica [lugar=" + lugar + ", duracion=" + duracion + ", precio=" + precio + ", nombre="
				+ nombre + ", fecha=" + fecha + ", tipo=" + tipo + ", idActividad=" + idActividad + ", pais=" + pais
				+ ", tour=" + tour + ", reserva=" + Arrays.toString(reserva) + ", equipaje=" + Arrays.toString(equipaje)
				+ ", itinerario=" + itinerario + ", guia=" + Arrays.toString(guia) + ", creacion=" + creacion + "]";
	}
	

	/**
     * 
     */
    private String lugar;

    /**
     * 
     */
    private int duracion;

    /**
     * 
     */
    private int precio;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String fecha;

    /**
     * 
     */
    private String tipo;

    /**
     * 
     */
    private final String idActividad;

    /**
     * 
     */
    private Pais pais;

    /**
     * 
     */
    private Tour tour;

    /**
     * 
     */
    private Reserva[] reserva;

    /**
     * 
     */
    private Equipaje[] equipaje;

    /**
     * 
     */
    private Itinerario itinerario;

    /**
     * 
     */
    private Guia [] guia;

    /**
     * 
     */
    private int creacion;



    /**
     * @return
     */
    public int determinarEdad() {
        // TODO implement here
        return 0;
    }

    /**
     * @param descuento  
     * @return
     */
    public double calcularCosto(double descuento ) {
        // TODO implement here
        return precio + duracion;
    }

    public double calcularDescuento(double precio) {
        return precio * 0.9; // aplica 10% de descuento
    }

    /**
     * @return
     */
    public final void mostrarInformacionBasica() {
    	System.out.println("ID Actividad: "+ idActividad);
    	
    }

}
