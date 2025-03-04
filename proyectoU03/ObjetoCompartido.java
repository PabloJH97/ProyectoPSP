package proyectoU03;

import java.util.HashMap;

public class ObjetoCompartido {
	boolean haTerminado;
	String palabra;
	String traduccion;
	HashMap<String, String> traducciones=new HashMap<String, String>();
	
	public boolean isHaTerminado() {
		return haTerminado;
	}
	public void setHaTerminado(boolean haTerminado) {
		this.haTerminado = haTerminado;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public String getTraduccion() {
		return traduccion;
	}
	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}
	public HashMap<String, String> getTraducciones() {
		return traducciones;
	}
	public void setTraducciones(HashMap<String, String> traducciones) {
		this.traducciones = traducciones;
	}
	
	public void insertarTraduccion() {
		traducciones.put(this.traduccion, this.palabra);
	}
	
}
