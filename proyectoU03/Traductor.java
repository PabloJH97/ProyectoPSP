package proyectoU03;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Traductor {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		String Host = "localhost";
		int Puerto = 6001;
		Socket Cliente = new Socket(Host, Puerto);

		ObjectOutputStream fsalida = new ObjectOutputStream(Cliente.getOutputStream());
		ObjectInputStream fentrada = new ObjectInputStream(Cliente.getInputStream());

		Scanner sc = new Scanner(System.in);
		String palabra = "";

		Datos datos = (Datos) fentrada.readObject();
		int identificador = datos.getIdentificador();
		System.out.println("ID cliente: " + identificador);
		System.out.println(datos.getCadena());

		while (!palabra.equals("salir")) {
			System.out.println("Por favor introduzca una de las siguientes palabras para traducirlas: \n");
			for (String palabraTraducible : datos.getPalabrasTraducibles()) {
				System.out.println(palabraTraducible);
			}
			System.out.println("Escriba salir para salir del traductor");

			palabra = sc.next();

			if (!palabra.equals("salir")) {
				boolean traducido=false;
				boolean palabraCorrecta = false;
				boolean idiomaCorrecto = false;
				for (int i=0; i<datos.getPalabrasTraducibles().length&&!traducido; i++) {
					String palabraTraducible=datos.getPalabrasTraducibles()[i];
					if (palabra.equals(palabraTraducible)) {
						palabraCorrecta = true;
					}
				}
				if (palabraCorrecta) {

					System.out.println("Escriba el idioma al que desea traducir la palabra :\n");
					for (String idiomaTraducible : datos.getIdiomas()) {
						System.out.println(idiomaTraducible);
					}

					String idioma = sc.next();
					
					for(int j=0; j<datos.getIdiomas().length; j++) {
						if(idioma.equals(datos.getIdiomas()[j])) {
							idiomaCorrecto=true;
						}
					}
					
					if(idiomaCorrecto) {
						datos.setPalabra(palabra);
						datos.setIdiomaATraducir(idioma);
						traducido=true;
					}
					
					

				}
				if(!palabraCorrecta||!idiomaCorrecto) {
					datos.setPalabra("error");
					datos.setIdiomaATraducir("error");
				}
				fsalida.reset();
				fsalida.writeObject(datos);
				datos = (Datos) fentrada.readObject();
				System.out.println(datos.palabraTraducida);

			}

		}

		fsalida.close();
		fentrada.close();
		System.out.println("Fin del proceso");
		sc.close();
		Cliente.close();

	}

}
