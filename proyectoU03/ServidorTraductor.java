package proyectoU03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTraductor {

	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(6001);
		System.out.println("Servidor iniciado...");		

		ObjetoCompartido objeto = new ObjetoCompartido();
		int id = 0;
		while (true) {	
			Socket cliente = new Socket();
			cliente = servidor.accept(); //esperando cliente	
			id++;			
			HiloServidorTraductor hilo = new HiloServidorTraductor(cliente, objeto, id);
			hilo.start();	

		}

	}
}
