package proyectoU03;

import java.util.HashMap;

public class ObjetoCompartido {
	boolean haTerminado;
	boolean haTraducido;
	String palabra;
	String idiomaATraducir;
	String traduccion;
	HashMap<String, String> traducciones = new HashMap<String, String>();
	String[] idioma = { "Frances", "Ingles", "Aleman", "Ruso" };
	String[] palabrasTraducibles = { "Hola", "Adios", "Casa", "Ordenador", "Cargador", "Clase", "Televisor", "Silla",
			"Pantalla", "Mesa", "Tenedor", "Cuchara", "Plato", "Pan", "Patata", "Tomate" };
	String[] traduccionFrances = { "Bonjour", "Au Revoir", "Maison", "Ordinateur", "Chargeur", "CLasse", "TV", "Chaise",
			"Écran", "Tableau", "Fourchette", "Cuillère", "Plat", "Pain", "Pomme de terre", "Tomate" };
	String[] traduccionIngles = { "Hello", "Bye", "Home", "Computer", "Charger", "Class", "TV", "Chair", "Screen",
			"Table", "Fork", "Spoon", "Plate", "Bread", "Potato", "Tomato" };
	String[] traduccionAleman = { "Hallo", "Tschüss", "Zuhause", "Computer", "Ladegerät", "Klasse", "Fernseher",
			"Stuhl", "Bildschirm", "Tisch", "Gabel", "Löffel", "Teller", "Brot", "Kartoffel", "Tomate" };
	String[] traduccionRuso = { "Здравствуйте", "Пока", "Домой", "Компьютер", "Зарядное устройство", "Класс",
			"Телевизор", "Стул", "Экран", "Стол", "Вилка", "Ложка", "Тарелка", "Хлеб", "Картошка", "Помидор" };

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

	public String getIdiomaATraducir() {
		return idiomaATraducir;
	}

	public void setIdiomaATraducir(String idiomaATraducir) {
		this.idiomaATraducir = idiomaATraducir;
	}

	public void insertarTraduccion() {
		traducciones.put(this.traduccion, this.palabra);
	}

	public String traducir() {
		if (!palabra.equals("salir")) {
			for (int i = 0; i < this.getPalabrasTraducibles().length && !this.haTraducido; i++) {
				if (palabra.equals(getPalabrasTraducibles()[i])) {
					for (int j = 0; j < this.idioma.length && !this.haTraducido; j++) {
						if (this.idiomaATraducir.equals(this.idioma[j])) {
							switch (this.idioma[j]) {
							case "Frances":
								for (int z = 0; j < this.traduccionFrances.length && !this.haTraducido; z++) {
									if (i == z) {
										this.traduccion = this.traduccionFrances[z];
										this.haTraducido = true;
									}

								}
								break;
							case "Ingles":
								for (int z = 0; j < this.traduccionIngles.length && !this.haTraducido; z++) {
									if (i == z) {
										this.traduccion = this.traduccionIngles[z];
										this.haTraducido = true;
									}

								}
								break;
							case "Aleman":
								for (int z = 0; j < this.traduccionAleman.length && !this.haTraducido; z++) {
									if (i == z) {
										this.traduccion = this.traduccionAleman[z];
										this.haTraducido = true;
									}

								}
								break;
							case "Ruso":
								for (int z = 0; j < this.traduccionRuso.length && !this.haTraducido; z++) {
									if (i == z) {
										this.traduccion = this.traduccionRuso[z];
										this.haTraducido = true;
									}

								}
								break;
							}
						}
					}
				}else {
					this.traduccion="salir";
				}

			}
		}
		this.haTraducido=false;
		return this.traduccion;
	}

}
