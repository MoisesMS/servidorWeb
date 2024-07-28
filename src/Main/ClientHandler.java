package Main;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{
	private Socket socket;
	public ClientHandler(Socket s) {
		this.socket = s;
	}

	@Override
	public void run() {
		try(InputStream input = socket.getInputStream();
		    OutputStream output = socket.getOutputStream();
		    PrintWriter out = new PrintWriter(output, true)) {
			String index = Archivo.readHTML();
			String httpResponse = "HTTP/1.1 200 OK\r\n" + "Content-Type: text/html\r\n" + index;

			out.write(httpResponse);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
