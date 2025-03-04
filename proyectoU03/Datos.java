package proyectoU03;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Datos implements Serializable{
	int identificador;
	String cadena;
	String palabra;
	String palabraTraducida;
	String idiomaATraducir;
	String[] palabrasTraducibles;
	String[] idiomas;
	boolean haTraducido=false;
	boolean haTerminado=false;
	
	public Datos(String cadena, int identificador) {
		this.cadena=cadena;
		this.identificador=identificador;
	}
	
	public Datos(String palabra, String palabraTraducida) {
		this.palabra=palabra;
		this.palabraTraducida=palabraTraducida;
	}
	
	public Datos() {
		super();		
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public Boolean getHaTraducido() {
		return haTraducido;
	}

	public void setHaTraducido(Boolean haTraducido) {
		this.haTraducido = haTraducido;
	}

	public String getPalabraTraducida() {
		return palabraTraducida;
	}

	public void setPalabraTraducida(String palabraTraducida) {
		this.palabraTraducida = palabraTraducida;
	}

	public boolean isHaTerminado() {
		return haTerminado;
	}

	public void setHaTerminado(boolean haTerminado) {
		this.haTerminado = haTerminado;
	}

	public String[] getPalabrasTraducibles() {
		return palabrasTraducibles;
	}

	public void setPalabrasTraducibles(String[] palabrasTraducibles) {
		this.palabrasTraducibles = palabrasTraducibles;
	}

	public void setHaTraducido(boolean haTraducido) {
		this.haTraducido = haTraducido;
	}

	public String[] getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}

	public String getIdiomaATraducir() {
		return idiomaATraducir;
	}

	public void setIdiomaATraducir(String idiomaATraducir) {
		this.idiomaATraducir = idiomaATraducir;
	}
	
	
	
	
	

}
