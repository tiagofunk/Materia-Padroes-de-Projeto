package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorConfiguracoesEmArquivo implements TipoLeitor{
    
    private String caminhoArquivo = "conf.txt";

    @Override
    public String[] lerConfiguracoes() {
        boolean leuPorta = false, leuHost = false;
        String porta = "", host = "";
        String linha;
        String conteudo[], retorno[] = new String[2];
        
        try {
            BufferedReader br = new BufferedReader( new FileReader( caminhoArquivo ) );
            
            while( ( linha = br.readLine() ) != null && ( !leuPorta || !leuHost )  ){
                conteudo = linha.split( ":" );

                if( conteudo[ 0 ].trim().equals("porta") ){
                    porta = conteudo[ 1 ].trim();
                    leuPorta = true;
                }else if( conteudo[ 0 ].trim().equals("host") ){
                    host = conteudo[ 1 ].trim();
                    leuHost = true;
                }
            }
            br.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        try {
            if( !leuHost ){
                throw new RuntimeException("Valor para host não encontrado em arquivo de configuração");
            }
            if( !leuPorta ){
                throw new RuntimeException("Valor para porta não encontrado em arquivo de configuração");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        retorno[0] = host;
        retorno[1] = porta;
        return retorno;
    }
    
}
