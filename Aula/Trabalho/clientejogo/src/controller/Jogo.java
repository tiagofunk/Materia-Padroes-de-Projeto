package controller;

import model.DiretorBuilderTime;
import model.abstrato.Peca;
import model.abstrato.PecaMovimentavel;
import model.abstrato.PecaTabuleiro;
import utils.MontadorTabuleiroImpl;

public class Jogo {

    public static final int ALTURA = 9;
    public static final int LARGURA = 7;

    private boolean vezJogar = true;
    private boolean houveVencedor = false;

    private Peca[][] tabuleiro;

    public Jogo(DiretorBuilderTime dbt1, DiretorBuilderTime dbt2, boolean vezJogar) {
        tabuleiro = new MontadorTabuleiroImpl().montar(dbt1, dbt2);
        this.vezJogar = vezJogar;
    }
    
    public void imprimirTabuleiro() {
        Peca p;
        for (int i = 0; i < ALTURA; i++) {
            for (int j = 0; j < LARGURA; j++) {
                p = tabuleiro[i][j];
                if (p != null) {
                    System.out.print("I: " + i + ", J: " + j + ", " + p.toString());
                } else {
                    System.out.print("I: " + i + ", J: " + j + "null");
                }
                System.out.print("    ");
            }
            System.out.println("\n");
        }
    }

    public String[][] getIndentificadores() {
        String s;
        PecaTabuleiro pb;
        PecaMovimentavel pm;
        String[][] id = new String[ALTURA][LARGURA];
        
        for( int i = 0; i < ALTURA; i++ ){
            for( int j = 0; j < LARGURA; j++ ){
                pb = (PecaTabuleiro) tabuleiro[ i ][ j ];
                pm = pb.getPecaMovimentavel();
                s = pb.getTipoPeca().getNome();
                if( pm != null ){
                    s += "_" + pm.getTipo().getNome() + "_" + pm.getTime().getNome();
                }
                id[ i ][ j ] = s;
            }
        }
        return id;
    }

    public boolean getVezJogar() {
        return vezJogar;
    }

    boolean validar(int[] primeiraJogada, int[] segundaJogada) {
        return true;
    }

    void alternarJogador() {
        vezJogar = !vezJogar;
    }

}
