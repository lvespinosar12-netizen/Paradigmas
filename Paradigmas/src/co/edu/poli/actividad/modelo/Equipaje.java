package co.edu.poli.actividad.modelo;


/**
 * 
 */
public class Equipaje {

    public Equipaje(String idEquipaje, double peso, String tipo, String material, String tamanio) {
		super();
		this.idEquipaje = idEquipaje;
		this.peso = peso;
		this.tipo = tipo;
		this.material = material;
		this.tamanio = tamanio;
	}

	public String getIdEquipaje() {
		return idEquipaje;
	}

	public void setIdEquipaje(String idEquipaje) {
		this.idEquipaje = idEquipaje;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}


	@Override
	public String toString() {
		return "Equipaje [idEquipaje=" + idEquipaje + ", peso=" + peso + ", tipo=" + tipo + ", material=" + material
				+ ", tamanio=" + tamanio + "]";
	}


	/**
     * 
     */
    private String idEquipaje;

    /**
     * 
     */
    private double peso;

    /**
     * 
     */
    private String tipo;

    /**
     * 
     */
    private String material;

    /**
     * 
     */
    private String tamanio;
    
    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }
}