package exer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Bola extends Desenhavel {
    
    private static final int RAIO = 10;

    public Bola(int posicaoInicialX, int posicaoIncialY, Color cor) {
        super(posicaoInicialX, posicaoIncialY, cor);
    }

    @Override
    public void desenhar(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();   
        g2d.setColor( cor );   
        g2d.drawOval(posicaoInicialX, posicaoInicialY, RAIO, RAIO);
    }

    
}
