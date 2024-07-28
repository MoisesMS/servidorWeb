package Main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	public static void main(String[] args) {
		int PORT = 8080;

		if(args.length > 0) {
			try {
				PORT = Integer.parseInt(args[0]);

				if(PORT <= 0) {
					System.err.println("El puerto debe ser positivo.");
					System.exit(1);
				}
			} catch (NumberFormatException e) {
				System.err.println("El puerto seleccionado no es válido.");
				System.exit(1);
			}
		}
		try(ServerSocket socket = new ServerSocket(PORT)) {
			System.out.println("Servidor escuchando en puerto " + PORT);
			while(true) {
				Socket cliente = socket.accept();

				Thread t = new Thread(new ClientHandler(cliente));
				t.start();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}