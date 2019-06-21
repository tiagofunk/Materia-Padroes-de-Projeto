
package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class GravadorLogs {
    
    private final static String CAMINHO = "/home/tiago/Dropbox/logs/";
    
    public static void escrever(String conteudo){
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(CAMINHO), true));
            bw.write( new Date().toString() );
            bw.write( conteudo );
            bw.newLine();
            bw.newLine();
            bw.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
