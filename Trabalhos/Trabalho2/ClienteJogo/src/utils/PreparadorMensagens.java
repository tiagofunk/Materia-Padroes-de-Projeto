package utils;

public class PreparadorMensagens {
    
    private int[] primeiraJogada;
    private int[] segundaJogada;
    
    public PreparadorMensagens() {
    }
    
    public String escreverJogada( int[] primeiroClique, int[] segundoClique ){
        return primeiroClique[ 0 ] + "," + primeiroClique[ 1 ] + ";" +
            segundoClique[ 0 ] + "," + segundoClique[ 1 ] + ";";
    }
    
    public void lerJogada( String jogada ){
        String s[] = jogada.split(";");
        String aux[];
        
        aux = s[0].split(",");
        primeiraJogada = new int[]{ Integer.parseInt(aux[0]), Integer.parseInt(aux[1]) };
        
        aux = s[1].split(",");
        segundaJogada = new int[]{ Integer.parseInt(aux[0]), Integer.parseInt(aux[1]) };
    }

    public int[] getPrimeiraJogada() {
        return primeiraJogada;
    }

    public int[] getSegundaJogada() {
        return segundaJogada;
    }
}
