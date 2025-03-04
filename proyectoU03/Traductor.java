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
		String palabra= "";
		
		Datos datos = (Datos) fentrada.readObject();
		int identificador = datos.getIdentificador();
		System.out.println("ID cliente: "+identificador);
		System.out.println(datos.getCadena());
		
		System.out.println("Por favor introduzca una de las siguientes palabras para traducirlas: \n");
		for(String palabraTraducible:datos.getPalabrasTraducibles()) {
			System.out.println(palabraTraducible);
		}
		System.out.println("Escriba salir para salir del traductor");
		
		palabra=sc.next();
		datos.setPalabra(palabra);
		do{
			if(!datos.palabra.equals("salir")){
				for(int i=0; i<datos.getPalabrasTraducibles().length&&!datos.getHaTraducido(); i++) {
					if(datos.palabra.equals(datos.getPalabrasTraducibles()[i])) {
						System.out.println("Introduzca el idioma al que quiera traducir la palabra: \n");
						for(String idiomaATraducir:datos.getIdioma()) {
							System.out.println(idiomaATraducir);
						}
						String idioma=sc.next();
						for(int j=0; j<datos.getIdioma().length&&!datos.getHaTraducido(); j++) {
							if(idioma.equals(datos.getIdioma()[j])) {
								switch(datos.getIdioma()[j]) {
								case "Frances":
									for(int z=0; j<datos.getTraduccionFrances().length&&!datos.getHaTraducido(); z++) {
										if(i==z) {
											String palabraTraducida=datos.getTraduccionFrances()[z];
											System.out.println(palabraTraducida);
											datos.setHaTraducido(true);
											Datos d=new Datos(palabra, palabraTraducida);
											fsalida.reset();
											fsalida.writeObject(d);
										}
										
										
									}
									break;
								case "Ingles":
									for(int z=0; j<datos.getTraduccionIngles().length&&!datos.getHaTraducido(); z++) {
										if(i==z) {
											String palabraTraducida=datos.getTraduccionIngles()[z];
											System.out.println(palabraTraducida);
											datos.setHaTraducido(true);
											Datos d=new Datos(palabra, palabraTraducida);
											fsalida.reset();
											fsalida.writeObject(d);
										}
										
										
									}
									break;
								case "Aleman":
									for(int z=0; j<datos.getTraduccionAleman().length&&!datos.getHaTraducido(); z++) {
										if(i==z) {
											String palabraTraducida=datos.getTraduccionAleman()[z];
											System.out.println(palabraTraducida);
											datos.setHaTraducido(true);
											Datos d=new Datos(palabra, palabraTraducida);
											fsalida.reset();
											fsalida.writeObject(d);
										}
										
										
									}
									break;
								case "Ruso":
									for(int z=0; j<datos.getTraduccionRuso().length&&!datos.getHaTraducido(); z++) {
										if(i==z) {
											String palabraTraducida=datos.getTraduccionRuso()[z];
											System.out.println(palabraTraducida);
											datos.setHaTraducido(true);
											Datos d=new Datos(palabra, palabraTraducida);
											fsalida.reset();
											fsalida.writeObject(d);
										}
										
										
									}
									break;
								}
							}
						}
					}
					
						
					
				}
				datos.setHaTraducido(false);
				System.out.println("Por favor introduzca una de las siguientes palabras para traducirlas: \n");
				for(String palabraTraducible:datos.getPalabrasTraducibles()) {
					System.out.println(palabraTraducible);
				}
				
				palabra=sc.next();
				datos.setPalabra(palabra);
			}else {
				System.out.println("¡Hasta pronto!");
				datos.setHaTerminado(true);
			}
			
		}while(!datos.palabra.equals("salir"));
		
		
		fsalida.close();
		fentrada.close();
		System.out.println("Fin del proceso");
		sc.close();
		Cliente.close();

		
		

	}

}
