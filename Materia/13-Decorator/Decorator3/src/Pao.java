public class Pao extends Ingrediente{

    public Pao(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public double getPreco() {
        return 2;
    }
    
}
