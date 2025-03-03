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

	}

}
