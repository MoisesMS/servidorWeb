package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;

public class Archivo {
	private static String getIndex() {
		return Paths.get("").toAbsolutePath().getParent().toString() + "\\index.html";
	}

	public static String readHTML() {
		String html = "";
		String line;
		try(FileReader fr = new FileReader(getIndex())) {
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();

			while(line != null) {
				html = html.concat(line + "\n");
				line = br.readLine();
			}
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		return html;
	}
}
