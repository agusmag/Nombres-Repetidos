package nombresRepetidos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Resolucion {
	private LinkedList<Explorador> listaExploradores;
	
	public Resolucion(){
		this.listaExploradores = new LinkedList<Explorador>();
	}
	
	public int CargarExploradores(String path) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File(path));
		int numExploradores = sc.nextInt();
		int numGanadores = sc.nextInt();
		int j;
		sc.nextLine();
		String nombre = sc.nextLine();
		Explorador auxiliar = new Explorador(nombre);
		this.listaExploradores.addFirst(auxiliar);
		
		for (int i = 0; i < numExploradores-1; i++) {
			j=0;
			nombre = sc.nextLine();
			while((j < this.listaExploradores.size()) && !(this.listaExploradores.get(j).getNombre().equals(nombre))) {
				j++;
			}
			if (j < this.listaExploradores.size()){
				if (this.listaExploradores.get(j).getNombre().equals(nombre))
					this.listaExploradores.get(j).SumarRepetido();
			}else if(j == this.listaExploradores.size()){
				auxiliar = new Explorador(nombre);
				this.listaExploradores.add(auxiliar);
			}
		}
		sc.close();
		return numGanadores;
	}
	
	public void MostrarGanadores(int numGanadores, String path) throws IOException{
		
		//Collections.sort(this.listaExploradores);
		PrintWriter pw = new PrintWriter(new FileWriter(path));
		for (int i = 0; i < this.listaExploradores.size(); i++) {
			System.out.println(listaExploradores.get(i));
			pw.println(this.listaExploradores.get(i).toString());
		}
		
		
		
		pw.close();
	}
	
	
	
}
