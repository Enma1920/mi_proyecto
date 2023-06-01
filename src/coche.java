
public class coche extends tpersonas{
	protected double preciocoche;
	
	
	coche(String matricula, int plazas, double preciocoche) {
		super(matricula, plazas);
		this.preciocoche= 1.5;
	}
	
	public void calcularPreu(int dia) {
		
	}
	
	public double getPreciocoche() {
		return preciocoche;
	}

	public void setPreciocoche(double preciocoche) {
		this.preciocoche = preciocoche;
	}


}
