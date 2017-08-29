package nombresRepetidos;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		String miPath = "IN/LoteBase.txt";
		Resolucion listaExploradores = new Resolucion();
		
		int numGanadores = listaExploradores.CargarExploradores(miPath);
		
		listaExploradores.MostrarGanadores(numGanadores);
		
		
		
		
		
		
	}

}
