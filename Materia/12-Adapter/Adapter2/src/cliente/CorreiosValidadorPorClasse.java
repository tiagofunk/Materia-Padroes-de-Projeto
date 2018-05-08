package cliente;

import brasileiro.CorreiosValidador;

public class CorreiosValidadorPorClasse extends CorreiosValidador implements ValidadorEndereco {

    @Override
    public void validar(Cliente cliente) throws Exception {
        super.validar(cliente.getCep(), cliente.getEstado());
    }

}
