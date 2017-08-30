package nombresRepetidos;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String miPathE = "IN/LoteBase.txt";
		String miPathS = "OUT/LoteBase.txt";
		Resolucion listaExploradores = new Resolucion();
		
		int numGanadores = listaExploradores.CargarExploradores(miPathE);
		
		listaExploradores.MostrarGanadores(numGanadores,miPathS);
		
		
		
	}

}
