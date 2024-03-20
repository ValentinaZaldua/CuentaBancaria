package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ArchivoPlano {

	public static void almacenar(String nombreArchivo, ArrayList<String> lineas) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
			for(String linea : lineas) {
				bw.write(linea + "\n");
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<String> cargar(String nombreArchivo) {
		ArrayList<String> lineas = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
			String linea;
			while((linea=br.readLine()) != null) {
				lineas.add(linea);				
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lineas;
	}
}