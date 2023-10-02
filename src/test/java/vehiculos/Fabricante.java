package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	int fabricados;
	private static ArrayList<Fabricante> fabricas = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		
		this.nombre = nombre;
		this.pais = pais;
		fabricas.add(this);
		fabricados++;
		pais.fabricados++;
	}
	
	public static String fabricaMayorVentas() {
		
		Fabricante x = fabricas.get(0);
		
		for(int i = 1; i < fabricas.size(); i++) {
			
			if (fabricas.get(i).fabricados > x.fabricados) {
				
				x = fabricas.get(i);
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
