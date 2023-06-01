
public abstract class vehiculo {
	protected String matricula;
	protected double base = 50;
	

	public vehiculo(String matricula) {
		super();
		this.matricula= matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public void calcularPreu(int dia) { // creamos en la clase padre el metodo vacio
		
	}
	
	

	
	
	
	

}
