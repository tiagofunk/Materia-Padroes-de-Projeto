package utils;

public class LeitorConfiguracoes {
    
    private TipoLeitor leitor;
    
    private int porta;
    private String host;

    public LeitorConfiguracoes(TipoLeitor leitor) {
        this.leitor = leitor;
        realizarLeitura();
    }
    
    private void realizarLeitura(){
        String[] leitura = leitor.lerConfiguracoes();
        host = leitura[ 0 ];
        porta = Integer.parseInt( leitura[ 1 ] );
    }
    
    public int getPorta(){
        return porta;
    }
    
    public String getHost(){
        return host;
    }
}
