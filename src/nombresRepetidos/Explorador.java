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
	public String toString() {
		return nombre + " " + repetido;
	}

	@Override
	public int compareTo(Explorador that) {
		if (this.repetido == that.repetido){
			if (this.nombre.compareTo(that.nombre) == 0)
				return 0;
			else if (this.nombre.compareTo(that.nombre) > 0)
				return 1;
			
			return 0;
		}else if (this.repetido > that.repetido)
			return 1;
		
		return 0;
	}

	public String getNombre() {
		
		return this.nombre;
	}
	
	public Integer getRepetido() {
		
		return this.repetido;
	}
	
	
}
