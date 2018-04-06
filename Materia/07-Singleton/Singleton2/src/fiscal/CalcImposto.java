package fiscal;

public class CalcImposto {

//	private float aliquota;
	
//	public float getAliquota() {
//		return aliquota;
//	}
	
//	public void setAliquota(float aliquota) {
//		this.aliquota = aliquota;
//	}
	
	private static CalcImposto calc;
	
	private CalcImposto() {
	}
	
	public synchronized static CalcImposto getInstance() {
		if( calc == null ) {
			calc = new CalcImposto();
		}
		return calc;
	}
	
	public float calcImposto(float valor, float aliquota) {
		return valor * aliquota / 100;
	}
	
}
