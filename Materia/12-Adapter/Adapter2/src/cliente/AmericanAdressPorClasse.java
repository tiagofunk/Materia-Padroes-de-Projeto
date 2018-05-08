package cliente;

import american.AmericanAddress;

public class AmericanAdressPorClasse extends AmericanAddress implements ValidadorEndereco{

    @Override
    public void validar(Cliente cliente) throws Exception {
        super.validate(cliente.getEndereco(), cliente.getCep(), cliente.getEstado() );
    }
    
}
