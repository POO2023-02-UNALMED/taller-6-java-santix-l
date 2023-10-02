package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	public int fabricados;
	private static ArrayList<Pais> paises = new ArrayList<>();

	public Pais(String nombre) {
		super();
		this.nombre = nombre;
		paises.add(this);
	}
	
	public static String paisMasVendedor() {
		
		Pais x = paises.get(0);
		
		for(int i = 1; i < paises.size(); i++) {
			
			if (paises.get(i).fabricados > x.fabricados) {
				
				x = paises.get(i);
			}
			
		}
		
		return x.nombre;
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
