package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeitorConfiguracoes {
    
    private static final String CAMINHO_ARQUIVO = "conf.txt";
    
    private int porta;
    private String host;

    public LeitorConfiguracoes() {
        realizarLeitura();
    }
    
    private void realizarLeitura(){
        boolean leuPorta = false, leuHost = false;
        String linha = "";
        String conteudo[];
        
        try {
            BufferedReader br = new BufferedReader( new FileReader( CAMINHO_ARQUIVO ) );
            
            while( ( linha = br.readLine() ) != null && ( !leuPorta || !leuHost )  ){
                conteudo = linha.split( ":" );

                if( conteudo[ 0 ].trim().equals("porta") ){
                    porta = Integer.parseInt( conteudo[ 1 ].trim() );
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
                throw new Exception("Valor para host não encontrado em arquivo de configuração");
            }
            if( !leuPorta ){
                throw new Exception("Valor para porta não encontrado em arquivo de configuração");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    public int getPorta(){
        return porta;
    }
    
    public String getHost(){
        return host;
    }
}
