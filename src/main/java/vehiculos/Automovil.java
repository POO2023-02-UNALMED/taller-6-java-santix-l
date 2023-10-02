package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	protected static int automoviles;
	
	public Automovil (String placa,int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
		
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		
		this.puestos = puestos;
		automoviles++;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getAutomoviles() {
		return automoviles;
	}

	public static void setAutomoviles(int automoviles) {
		Automovil.automoviles = automoviles;
	}
	
	
	

}
