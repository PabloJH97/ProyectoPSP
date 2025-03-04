package proyectoU03;
import java.io.*;
import java.net.*;

public class HiloServidorTraductor extends Thread{

		ObjectInputStream fentrada;
		ObjectOutputStream fsalida;

		Socket socket = null;

		ObjetoCompartido objeto;
		int identificador;
		
		public HiloServidorTraductor(Socket s, ObjetoCompartido objeto, int id) {
			this.socket = s;
			this.objeto = objeto;
			this.identificador = id;
			try {
				 fsalida = new ObjectOutputStream(socket.getOutputStream());
				 fentrada = new ObjectInputStream(socket.getInputStream());
			} catch (IOException e) {
				System.out.println("ERROR DE E/S en HiloServidor");
				e.printStackTrace();
			}
		}
		
		public void run() {
					
			System.out.println("=>Cliente conectado: " + identificador);
			Datos datos= new Datos("Bienvenido al traductor", identificador);
			try {
				fsalida.reset();
				datos.setPalabrasTraducibles(objeto.getPalabrasTraducibles());
				datos.setIdiomas(objeto.getIdioma());
				fsalida.writeObject(datos);
			}catch(IOException e0) {
				System.out.println("Error en el hilo servidor");
				return;
			}
			
			while(!objeto.haTerminado) {
				try {
					Datos d = (Datos) fentrada.readObject();
					objeto.setPalabra(d.getPalabra());
					objeto.setIdiomaATraducir(d.getIdiomaATraducir());
					objeto.traducir();
					if(!objeto.getTraduccion().equals("salir")) {
						objeto.insertarTraduccion();
						d.setPalabraTraducida(objeto.getTraduccion());
						fsalida.writeObject(d);
					}

					if(d.isHaTerminado()) {
						objeto.setHaTerminado(true);
					}
					System.out.println(objeto.getTraducciones());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("Traducción finalizada");
					break;
				}
			}
			try {
				fsalida.close();
				fentrada.close();
				if (socket.isClosed())System.out.println("Socket cerrado");
				else System.out.println("Socket abierto");
				socket.close();
			} catch (IOException e) {
				System.out.println("Error en Hilo al cerrar cliente: " + identificador);
				e.printStackTrace();
			}
			
			


	}
}
