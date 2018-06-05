public abstract class Ingrediente implements Sanduiche{
    
    private Sanduiche sanduiche;

    public Ingrediente(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }
    
    @Override
    public double getPreco(){
        return sanduiche.getPreco();
    }
}
