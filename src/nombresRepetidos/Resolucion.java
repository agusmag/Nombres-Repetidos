package nombresRepetidos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Resolucion {
	private LinkedList<Explorador> listaExploradores;
	
	public Resolucion(){
		
	}
	
	public int CargarExploradores(String path) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File(path));
		int numExploradores = sc.nextInt();
		int numGanadores = sc.nextInt();
		int j;
		String nombre = sc.nextLine(); //NO ENTIENDO POR QUE ME LEE ESPACIO.
		nombre = sc.nextLine();
		Explorador auxiliar = new Explorador(nombre);
		this.listaExploradores.addFirst(auxiliar);
		
		for (int i = 0; i < numExploradores; i++) {
			j=0;
			nombre = sc.nextLine();
			while((this.listaExploradores.get(j).toString() != nombre) || (j < this.listaExploradores.size())) {
				j++;
			}
			if (this.listaExploradores.get(j).toString() == nombre)
				this.listaExploradores.get(j).SumarRepetido();
			else if(j == this.listaExploradores.size()){
				auxiliar = new Explorador(nombre);
				this.listaExploradores.add(auxiliar);
			}
		}
		sc.close();
		return numGanadores;
	}
	
	public void MostrarGanadores(int numGanadores){
		Collections.sort(this.listaExploradores);
		
		for (int i = 0; i < listaExploradores.size(); i++) {
			System.out.println(listaExploradores.get(i));
		}
	}
	
	
	
}
