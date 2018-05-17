package exer;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Desenhavel {
    
    protected int posicaoInicialX;
    protected int posicaoInicialY;
    protected Color cor;

    public Desenhavel(int posicaoInicialx, int posicaoInicialY, Color cor) {
        this.posicaoInicialX = posicaoInicialx;
        this.posicaoInicialY = posicaoInicialY;
        this.cor = cor;
    }
    
    public int getPosicaoInicialX() {
        return posicaoInicialX;
    }

    public int getPosicaoInicialY() {
        return posicaoInicialY;
    }

    public Color getCor() {
        return cor;
    }
    
    public abstract void desenhar(Graphics g);
    
}
