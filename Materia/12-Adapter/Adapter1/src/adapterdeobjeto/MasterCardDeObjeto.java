package adapterdeobjeto;

import mastercard.MasterCard;
import sistemavendas.Cartao;

public class MasterCardDeObjeto implements Cartao {

    private MasterCard adaptada;

    public MasterCardDeObjeto() {
        this.adaptada = new MasterCard();
    }

    @Override
    public void pagar(String nome, String numero, double valor, String validade) throws Exception {
        System.out.println("Pagamento com Mastercard");
        if (!this.adaptada.aprovar(nome, numero, valor, validade)) {
            throw new Exception("Problema com seu cartao");
        }

    }

}
