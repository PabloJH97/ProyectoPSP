package proyectoU03;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Datos implements Serializable{
	int identificador;
	String cadena;
	String palabra;
	String palabraTraducida;
	boolean haTraducido=false;
	boolean haTerminado=false;
	String[] idioma= {"Frances", "Ingles", "Aleman", "Ruso"};
	String[] palabrasTraducibles= {"Hola", "Adios", "Casa", "Ordenador", "Cargador", "Clase", "Televisor", "Silla", "Pantalla", "Mesa", "Tenedor", "Cuchara", "Plato", "Pan", "Patata", "Tomate"};
	String[] traduccionFrances= {"Bonjour", "Au Revoir", "Maison", "Ordinateur", "Chargeur", "CLasse", "TV", "Chaise", "Écran", "Tableau", "Fourchette", "Cuillère", "Plat", "Pain", "Pomme de terre", "Tomate"};
	String[] traduccionIngles= {"Hello", "Bye", "Home", "Computer", "Charger", "Class", "TV", "Chair", "Screen", "Table", "Fork", "Spoon", "Plate", "Bread", "Potato", "Tomato"};
	String[] traduccionAleman= {"Hallo", "Tschüss", "Zuhause", "Computer", "Ladegerät", "Klasse", "Fernseher", "Stuhl", "Bildschirm", "Tisch", "Gabel", "Löffel", "Teller", "Brot", "Kartoffel", "Tomate"};
	String[] traduccionRuso= {"Здравствуйте", "Пока", "Домой", "Компьютер", "Зарядное устройство", "Класс", "Телевизор", "Стул", "Экран", "Стол", "Вилка", "Ложка", "Тарелка", "Хлеб", "Картошка", "Помидор"};
	
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

	public String[] getIdioma() {
		return idioma;
	}

	public void setIdioma(String[] idioma) {
		this.idioma = idioma;
	}

	public String[] getPalabrasTraducibles() {
		return palabrasTraducibles;
	}

	public void setPalabrasTraducibles(String[] palabrasTraducibles) {
		this.palabrasTraducibles = palabrasTraducibles;
	}

	public String[] getTraduccionFrances() {
		return traduccionFrances;
	}

	public void setTraduccionFrances(String[] traduccionFrances) {
		this.traduccionFrances = traduccionFrances;
	}

	public String[] getTraduccionIngles() {
		return traduccionIngles;
	}

	public void setTraduccionIngles(String[] traduccionIngles) {
		this.traduccionIngles = traduccionIngles;
	}

	public String[] getTraduccionAleman() {
		return traduccionAleman;
	}

	public void setTraduccionAleman(String[] traduccionAleman) {
		this.traduccionAleman = traduccionAleman;
	}

	public String[] getTraduccionRuso() {
		return traduccionRuso;
	}

	public void setTraduccionRuso(String[] traduccionRuso) {
		this.traduccionRuso = traduccionRuso;
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
	
	

}
