package view;

import controller.ControleJogo;
import controller.Observador;
import javax.swing.ButtonGroup;

public class Tela extends javax.swing.JFrame implements Observador{
    
    private ControleJogo controle;

    public Tela() {
        initComponents();
        
        controle = new ControleJogo();
        controle.addObservador( this );
        
        ButtonGroup botoes = new ButtonGroup();
        botoes.add( btColhedor );
        botoes.add( btIniciar );
        botoes.add( btLenhador );
        botoes.add( btMinerador );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rbGregos = new javax.swing.JRadioButton();
        rbEgipcios = new javax.swing.JRadioButton();
        rbChineses = new javax.swing.JRadioButton();
        btColhedor = new javax.swing.JButton();
        btLenhador = new javax.swing.JButton();
        btMinerador = new javax.swing.JButton();
        btIniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lbLimite = new javax.swing.JLabel();
        lbAtual = new javax.swing.JLabel();
        lbDinheiro = new javax.swing.JLabel();
        lbRound = new javax.swing.JLabel();
        btEscolher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Civilização");

        rbGregos.setText("Gregos");

        rbEgipcios.setText("Egipcios");

        rbChineses.setText("Chineses");

        btColhedor.setText("Colhedor $1");
        btColhedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btColhedorActionPerformed(evt);
            }
        });

        btLenhador.setText("Lenhador $2");
        btLenhador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLenhadorActionPerformed(evt);
            }
        });

        btMinerador.setText("Minerador $3");
        btMinerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMineradorActionPerformed(evt);
            }
        });

        btIniciar.setText("Iniciar");
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lbLimite.setText("Limite populacional: 00");

        lbAtual.setText("População atual: 00");

        lbDinheiro.setText("Dinheiro: $50");

        lbRound.setText("Round: 00");

        btEscolher.setText("Escolher");
        btEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEscolherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btColhedor)
                                            .addGap(31, 31, 31)
                                            .addComponent(btLenhador)
                                            .addGap(18, 18, 18)
                                            .addComponent(btMinerador))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbGregos)
                                            .addGap(51, 51, 51)
                                            .addComponent(rbEgipcios)
                                            .addGap(31, 31, 31)
                                            .addComponent(rbChineses)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btEscolher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbRound)
                                        .addComponent(btIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAtual)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbLimite)
                                .addGap(41, 41, 41)
                                .addComponent(lbDinheiro)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbGregos)
                    .addComponent(rbEgipcios)
                    .addComponent(rbChineses)
                    .addComponent(btEscolher))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLimite)
                    .addComponent(lbDinheiro)
                    .addComponent(lbRound))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btColhedor)
                    .addComponent(btLenhador)
                    .addComponent(btMinerador)
                    .addComponent(btIniciar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btColhedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btColhedorActionPerformed
        controle.adicionarColhedor();
    }//GEN-LAST:event_btColhedorActionPerformed

    private void btLenhadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLenhadorActionPerformed
        controle.adicionarLenhador();
    }//GEN-LAST:event_btLenhadorActionPerformed

    private void btMineradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMineradorActionPerformed
        controle.adicionarMinerador();
    }//GEN-LAST:event_btMineradorActionPerformed

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
        controle.iniciar();
    }//GEN-LAST:event_btIniciarActionPerformed

    private void btEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEscolherActionPerformed
        String s = "";
        if( rbGregos.isSelected() ){
            s = "g";
        }else if( rbEgipcios.isSelected() ){
            s = "e";
        }else if( rbChineses.isSelected() ){
            s = "c";
        }
        controle.escolher( s );
        rbGregos.setEnabled( false );
        rbEgipcios.setEnabled( false );
        rbChineses.setEnabled( false );
    }//GEN-LAST:event_btEscolherActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btColhedor;
    private javax.swing.JButton btEscolher;
    private javax.swing.JButton btIniciar;
    private javax.swing.JButton btLenhador;
    private javax.swing.JButton btMinerador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbAtual;
    private javax.swing.JLabel lbDinheiro;
    private javax.swing.JLabel lbLimite;
    private javax.swing.JLabel lbRound;
    private javax.swing.JRadioButton rbChineses;
    private javax.swing.JRadioButton rbEgipcios;
    private javax.swing.JRadioButton rbGregos;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        Tela tela = new Tela();
        tela.setVisible( true );
    }

    @Override
    public void adicionarFeedBack(String feedBack, int round, double dinheiro) {
        jTextArea1.setText( jTextArea1.getText() + feedBack);
        lbRound.setText( "Round: " + String.valueOf( round ) );
        lbDinheiro.setText( "Dinheiro: $" + String.format("%.2f", dinheiro) );
    }
}
