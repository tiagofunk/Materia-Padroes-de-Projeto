package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorConfiguracoes {
    
    private String caminhoArquivo = "conf.txt";

//    public static void escrever(String s) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true));
//            writer.write( s );
//            writer.write("\n");
//            writer.close();
//        } catch (IOException ex) {
//           ex.printStackTrace();
//        }
//    }
    
    private int porta;
    private String host;

    public LeitorConfiguracoes( String nomeArquivo ) {
        caminhoArquivo = nomeArquivo;
        realizarLeitura();
    }
    
    private void realizarLeitura(){
        boolean leuPorta = false, leuHost = false;
        String linha = "";
        String conteudo[];
        
        try {
            BufferedReader br = new BufferedReader( new FileReader( caminhoArquivo ) );
            
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
