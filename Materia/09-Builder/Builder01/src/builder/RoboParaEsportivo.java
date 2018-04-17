package builder;

import produto.MotorV8;
import produto.Pneu19;

public class RoboParaEsportivo extends Robo {

    @Override
    public void constroiMotor() {
        carro.setMotor(new MotorV8());
    }

    @Override
    public void constroiPneus() {
        carro.setPneus(new Pneu19(), new Pneu19(), new Pneu19(), new Pneu19());
    }

}
