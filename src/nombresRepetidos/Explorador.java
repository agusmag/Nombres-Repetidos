package nombresRepetidos;

public class Explorador implements Comparable<Explorador>{
	private String nombre;
	private int repetido;
	
	
	public Explorador(String nombre){
		this.nombre = nombre;
		this.repetido = 1;
	}
	
	public void SumarRepetido(){
		this.repetido++;
	}

	@Override
	public int compareTo(Explorador that) {
		if (this.nombre.compareToIgnoreCase(that.nombre) <= 0)
			return 1;
		
		return 0;
	}
	
	
}
