package co.edu.poli.actividad.modelo;


/**
 * 
 */
public class Transporte {

    public Transporte(String serial, int capacidad, int precio, String tipo) {
		super();
		this.serial = serial;
		this.capacidad = capacidad;
		this.precio = precio;
		this.tipo = tipo;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Transporte [serial=" + serial + ", capacidad=" + capacidad + ", precio=" + precio + ", tipo=" + tipo
				+ "]";
	}

	/**
     * 
     */
    private String serial;

    /**
     * 
     */
    private int capacidad;

    /**
     * 
     */
    private int precio;

    /**
     * 
     */
    private String tipo;

    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }


}