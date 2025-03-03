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

			


	}
}
