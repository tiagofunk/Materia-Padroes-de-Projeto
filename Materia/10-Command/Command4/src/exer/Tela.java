package exer;

import java.awt.Color;
import java.awt.Cursor;

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
        
        MeuPainel mp = new MeuPainel();
        mp.setVisible(true);
        mp.setSize(400, 400);
        mp.setEnabled(true);
        mp.setLocation(100, 100);
        mp.setBackground(Color.yellow);
        mp.setCursor(new Cursor(1));
        add( mp );
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        Tela t = new Tela();
        t.setVisible( true );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
