package co.edu.poli.actividad.vista;

import co.edu.poli.actividad.modelo.Equipaje;
import co.edu.poli.actividad.modelo.Guia;
import co.edu.poli.actividad.modelo.Itinerario;
import co.edu.poli.actividad.modelo.Pais;
import co.edu.poli.actividad.modelo.Paracaidismo;
import co.edu.poli.actividad.modelo.Reserva;
import co.edu.poli.actividad.modelo.Transporte;
import co.edu.poli.actividad.modelo.Tour;
import co.edu.poli.actividad.modelo.Actividad_turistica;
import co.edu.poli.actividad.modelo.Senderismo;
import co.edu.poli.actividad.servicios.ImplementacionOperacionCRUD;
import co.edu.poli.actividad.servicios.SenderismoDeMontaña;
import co.edu.poli.actividad.modelo.Escalada;


public class Principal {

    public static void main(String [] args) {
        
    	
    	//Equipaje
    	Equipaje Equipaje1= new Equipaje("ET54", 5.6, "Maleta de mano", "Cuero", "Pequeña");
    	Equipaje Equipaje2= new Equipaje("ET55", 50.7, "Maleta", "Cuero", "Grande");
    	
    	Equipaje [] equipajes = new Equipaje[2];
    	equipajes[0]=Equipaje1;
    	equipajes[1]=Equipaje2;
    	
    	//Guia
    	Guia Guia1= new Guia ("10932873822", "Maria", "Ingles y Español");
    	Guia Guia2= new Guia ("1098273822", "Sofia", "Español");
    	
    	Guia[] guias= new Guia[2];
    	guias[0]=Guia1;
    	guias[1]=Guia2;
    	
    	//Itinerario
    	Itinerario Itinerario1 = new Itinerario("TC22", "Senderismo", 5, true, 60000);
    	Itinerario[] itinerarios = { Itinerario1 };
    	
    	//Pais
    	Pais Pais1 = new Pais("Colombia", "America", "Español", "Leticia", "Silvestre", "Verano", "CO123");
    	
    	//Reserva
    	Reserva Reserva1 = new Reserva("8382791219", "24 de diciembre", "Laura", 320425265, "lvespinosar12@gmail.com", 2, 30000);
    	Reserva Reserva2 = new Reserva("29138198219", "24 de diciembre", "Fernando", 314526734, "Fernandoponcio@gmail.com", 4, 60000);
    	
    	Reserva [] reservas = new Reserva [2];
    	reservas[0]=Reserva1;
    	reservas[1]=Reserva2;
    	
    	//Transporte
    	Transporte Transporte1 = new Transporte("BUS4321", 30, 10000, "Bus");
    	Transporte[] transportes= {Transporte1};
    	
    	//Tour
    	Tour Tour1 = new Tour(300000, 5, "Extremo sur de Colombia", "TR600", "24 de diciembre", transportes, guias, itinerarios);
    	
    	
    	//Actividad turistica
    	//Actividad_turistica Actividad = new Actividad_turistica("Amazonas", 5, 500000, "Senderismo por el amazonas", "24 de diciembre", "Caminata", "AC508", Pais1, Tour1, reservas, equipajes, Itinerario1, guias, 10);
    	
    	Paracaidismo Actividad1 = new Paracaidismo("Amazonas", 5, 500000, "Paracaidismo", "24 de diciembre", "Caminata", "AC508", Pais1, Tour1, reservas, equipajes, Itinerario1, guias, 10, "Grande con alas", "Extremo");
    	Senderismo Actividad2 = new Senderismo("Amazonas", 5, 500000, "Senderismo", "24 de diciembre", "Caminata", "AC508", Pais1, Tour1, reservas, equipajes, Itinerario1, guias, 10, "Rocoso", 40);
    	SenderismoDeMontaña Actividad3 = new SenderismoDeMontaña("Amazonas", 5, 500000, "Escalada", "24 de diciembre", "Caminata", "AC508", Pais1, Tour1, reservas, equipajes, Itinerario1, guias, 10, "Rocoso", 40, true, "Bueno");
    	
    	//System.out.println(Actividad);
    	System.out.println(Actividad1);
    	System.out.println(Actividad2);
    	System.out.println(Actividad3);
    	
    	System.out.println();
    	System.out.println("Calcular costos SOBRECARGA: ");
    	//System.out.println("Costo de la actividad turistica 1: "+ Actividad.calcularCosto(0));
    	//System.out.println("Costo de la actividad turistica 2: "+ Actividad.calcularCosto(23.2));
    	
    	System.out.println();
    	System.out.println("Calcular costos SOBREESCRITURA: ");
    	System.out.println("Costo del senderismo: "+ Actividad2.calcularCosto(6.0));
    	
    	
    	//Arreglo de la superclase
    	Actividad_turistica [] actividades= new Actividad_turistica[5];
    	
    	actividades[0] = new Paracaidismo("Amazonas", 5, 500000, "Paracaidismo", "24 de diciembre", "Caminata", "AC508", Pais1, Tour1, reservas, equipajes, Itinerario1, guias, 10, "Grande con alas", "Extremo");
    	actividades[1] = new Senderismo("Amazonas", 5, 500000, "Senderismo", "24 de diciembre", "Caminata", "AC508", Pais1, Tour1, reservas, equipajes, Itinerario1, guias, 10, "Rocoso", 40);
    	actividades[2] = new Escalada("Amazonas", 5, 500000, "Escalada", "24 de diciembre", "Caminata", "AC508", Pais1, Tour1, reservas, equipajes, Itinerario1, guias, 10, 10.5, "Dificil");
    	
    	System.out.println();
    	for (int i=0; i<3; i++) {
    		System.out.println("Actividad: "+ actividades[i].getNombre());
    		double costo = actividades [i].calcularCosto(actividades[i].getPrecio());
    		System.out.println("Costo calculado: "+ costo);
    	}
    	System.out.println();
    	System.out.println("Polimorfismo: ");
    	for(Actividad_turistica act: actividades) {
    		if(act != null) {
    			double costoconDescuento = act.calcularDescuento(act.getPrecio());
    			System.out.println(act.getClass().getSimpleName()+ " Costo con 10% de descuento: "+ costoconDescuento);
    		}
    	}
    	
    	//Se creo un atributo final en Actividad_turistica: "idActividad"
    	//Se creo un metodo final en Actividad_turistica: "mostrarInformacionBasica"
    	//Se creo una clase final: "Tour"
    	
    	System.out.println();
    	//System.out.println("Codigo de la Actividad: "+ Actividad.getIdActividad());
    	//Actividad.mostrarInformacionBasica();
    	Tour t1 = new Tour(300000, 5, "Tour por la montaña", "TR600", "24 de diciembre", transportes, guias, itinerarios);
    	System.out.println("Descripcion del tour: "+ t1.getDuracion());
    	
    }
    ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();

    crud.crear(Actividad1);
    crud.crear(Actividad2);
    crud.crear(Actividad3);

    crud.listar();
    
    crud.leer("AC508");

    crud.actualizar("AC508", new Senderismo("Amazonas", 5, 500000, "Senderismo actualizado","25 de diciembre", "Caminata", "AC508", Pais1, Tour1, reservas, equipajes, Itinerario1, guias,10, "Selvático", 60));

    crud.eliminar("AC508");

    crud.listar();
    
        }
}