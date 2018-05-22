public class Pao extends SanduicheDecorator{

    public Pao(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public double getPreco() {
        return 2;
    }
    
}
