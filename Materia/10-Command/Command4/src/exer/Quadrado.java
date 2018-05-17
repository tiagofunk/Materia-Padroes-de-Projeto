package exer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Quadrado extends Desenhavel{
    
    private static final int LADO = 10;

    public Quadrado(int posicaoInicialx, int posicaoInicialY, Color cor) {
        super(posicaoInicialx, posicaoInicialY, cor);
    }

    @Override
    public void desenhar(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor( cor );
        g2d.fillRect( posicaoInicialX, posicaoInicialY, LADO, LADO);
    }
    
}
