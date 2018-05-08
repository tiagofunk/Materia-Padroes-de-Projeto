package meusistema;

import american.AmericanAddress;
import brasileiro.CorreiosValidador;
import cliente.AmericanAdressPorClasse;
import cliente.AmericanAdressPorObjeto;
import cliente.Cliente;
import cliente.CorreiosValidadorPorClasse;
import cliente.CorreiosValidadorPorObjeto;

public class TesteCliente {

    public static void main(String[] args) {

        testar("c1", "street", "123", "a", "EUA");
        testar("c2", "street big apple", "123", "a", "EUA");
        testar("c3", "street big apple", "12345678901", "a", "EUA");
        testar("c4", "street big apple", "12345678", "a", "EUA");
        testar("c5", "street big apple", "12345678", "aa", "EUA");

        testar("c6", "rua das amoreiras", "123456", "a", "BR");
        testar("c7", "rua das amoreiras", "12345678", "a", "BR");
        testar("c8", "rua das amoreiras", "12345678", "aa", "BR");
    }

    private static void testar(String nome, String endereco, String cep, String estado, String pais) {

        Cliente c = new Cliente(nome, endereco, cep, estado, pais);

        c.setValidadorEndereco(new CorreiosValidadorPorClasse());
        System.out.println("Correios por classe: " + nome + " " + c.ehEnderecoValido());

        c.setValidadorEndereco(new CorreiosValidadorPorObjeto(new CorreiosValidador()));
        System.out.println("Correios por objeto: " + nome + " " + c.ehEnderecoValido());
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        c.setValidadorEndereco(new AmericanAdressPorClasse());
        System.out.println("AmericanExpress por classe: " + nome + " " + c.ehEnderecoValido() );
        
        c.setValidadorEndereco( new AmericanAdressPorObjeto( new AmericanAddress() ) );
        System.out.println("AmericanAdress por objeto: " + nome + " " + c.ehEnderecoValido());
    
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

}
