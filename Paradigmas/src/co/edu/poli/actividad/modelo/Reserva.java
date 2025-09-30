package co.edu.poli.actividad.modelo;

/**
 * 
 */
public class Reserva {

    public Reserva(String idCliente, String fecha, String nombre, int telefono, String correo, int capacidad,
			int precio) {
		super();
		this.idCliente = idCliente;
		this.fecha = fecha;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.capacidad = capacidad;
		this.precio = precio;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Reserva [idCliente=" + idCliente + ", fecha=" + fecha + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", correo=" + correo + ", capacidad=" + capacidad + ", precio=" + precio + "]";
	}


	/**
     * 
     */
    private String idCliente;

    /**
     * 
     */
    private String fecha;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private int telefono;

    /**
     * 
     */
    private String correo;

    /**
     * 
     */
    private int capacidad;

    /**
     * 
     */
    private int precio;

    
    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }


}