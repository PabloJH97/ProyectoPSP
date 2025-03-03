package proyectoU03;

public class Datos {
	int identificador;
	String palabra;
	String[] idioma= {"Frances", "Ingles", "Aleman", "Ruso"};
	String[] palabrasTraducibles= {"Hola", "Adios", "Casa", "Ordenador", "Cargador", "Clase", "Televisor", "Silla", "Pantalla", "Mesa", "Tenedor", "Cuchara", "Plato", "Pan", "Patata", "Tomate"};
	String[] traduccionFrances= {"Bonjour", "Au Revoir", "Maison", "Ordinateur", "Chargeur", "CLasse", "TV", "Chaise", "Écran", "Tableau", "Fourchette", "Cuillère", "Plat", "Pain", "Pomme de terre", "Tomate"};
	String[] traduccionIngles= {"Hello", "Bye", "Home", "Computer", "Charger", "Class", "TV", "Chair", "Screen", "Table", "Fork", "Spoon", "Plate", "Bread", "Potato", "Tomato"};
	String[] traduccionAleman= {"Hallo", "Tschüss", "Zuhause", "Computer", "Ladegerät", "Klasse", "Fernseher", "Stuhl", "Bildschirm", "Tisch", "Gabel", "Löffel", "Teller", "Brot", "Kartoffel", "Tomate"};
	String[] traduccionRuso= {"Здравствуйте", "Пока", "Домой", "Компьютер", "Зарядное устройство", "Класс", "Телевизор", "Стул", "Экран", "Стол", "Вилка", "Ложка", "Тарелка", "Хлеб", "Картошка", "Помидор"};
	
	public Datos(String palabra) {
		this.palabra=palabra;
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

}
