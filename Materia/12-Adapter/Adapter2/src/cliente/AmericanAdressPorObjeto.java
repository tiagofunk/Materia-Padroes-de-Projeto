package cliente;

import american.AmericanAddress;

public class AmericanAdressPorObjeto implements ValidadorEndereco{
    
    private AmericanAddress adaptada;

    public AmericanAdressPorObjeto(AmericanAddress adaptada) {
        this.adaptada = adaptada;
    }

    @Override
    public void validar(Cliente cliente) throws Exception {
        this.adaptada.validate(cliente.getEndereco(), cliente.getCep(), cliente.getEstado());
    }
    
}
