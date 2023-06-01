
public class tcarga extends vehiculo {
	protected double PMA;

	tcarga(String matricula, double PMA){
		super(matricula);
		this.PMA= PMA;
		
	}
	public double getPMA() {
		return PMA;
	}
	
	
	public void setPMA(double pMA) {
		PMA = pMA;
	}

}
