package exemplo_01;

public class CeillineFanHighCommand implements Command {

	private CeillingFan cf;
	private int velocidadeAnterior;
	
	public CeillineFanHighCommand(CeillingFan cf) {
		super();
		this.cf = cf;
	}

	@Override
	public void execute() {
		velocidadeAnterior = cf.getSpeed();
		cf.high();
	}

	@Override
	public void undo() {
		if( velocidadeAnterior == CeillingFan.HIGH ) {
			cf.high();
		}else if( velocidadeAnterior == CeillingFan.MEDIUM ) {
			cf.medium();
		}else if( velocidadeAnterior == CeillingFan.LOW ) {
			cf.low();
		}else if( velocidadeAnterior == CeillingFan.OFF) {
			cf.off();
		}
	}

}
