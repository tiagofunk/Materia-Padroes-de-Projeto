package view;

import controller.Controller;
import controller.ControllerImpl;
import controller.Observador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Animal;
import model.Consulta;

public class Tela extends javax.swing.JFrame implements Observador{
    
    private Controller controle;
    private List< String > listaHorarios = new ArrayList<>();

    public Tela() {
        initComponents();
        
        controle = new ControllerImpl();
        controle.addObservador( this );
        
        setLocationRelativeTo( null );
        
        for( int i = 0; i < 4; i++ ){
            listaHorarios.add( "Livre" );
        }
    }
    
    @Override
    public void atualizarAgendamentos(Consulta c) {
        DefaultListModel modelo = (DefaultListModel) lHorarios.getModel();
        List< String> lista = listaHorarios;
        listaHorarios = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if ( (i * 8) == Integer.parseInt( c.getHorario() ) ) {
                listaHorarios.add( "Ocupado" );
            } else {
                listaHorarios.add( lista.get( i ) );
            }
        }
        modelo.clear();
        String s;
        for( int i = 0; i < 4; i++ ){
            s = (i * 8) + ":" + (i * 8 + 1) + " - " + listaHorarios.get( i );
            modelo.set( i, s );
        }
    }

    @Override
    public void atualizarBusca( Animal a ) {
        if ( a == null ){
            tfIdAnimal.setText( "" );
            labNomePET.setText( "" );
            labNomeDono.setText( "" );
        }else{
            tfIdAnimal.setText( String.valueOf( a.getIdAnimal() ) );
            labNomePET.setText( a.getNomeAnimal() );
            labNomeDono.setText( a.getNomeDono() );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfIdAnimal = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        labNomePET = new javax.swing.JLabel();
        labNomeDono = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lHorarios = new javax.swing.JList<>();
        bAgendar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novo Agendamento");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Id do animal:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        labNomePET.setText("Nome do PET");

        labNomeDono.setText("Nome do Dono");

        jLabel4.setText("Data da reserva:");

        lHorarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "8:00 - 9:00 Livre", "9:00 - 10:00 Livre", "10:00 - 11:00 Livre", "11:00 - 12:00 Livre" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lHorarios);

        bAgendar.setText("Agendar");
        bAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labNomeDono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labNomePET, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIdAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(tfData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labNomePET)
                .addGap(18, 18, 18)
                .addComponent(labNomeDono)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(bAgendar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        controle.buscarAnimal( Integer.parseInt( tfIdAnimal.getText() ) );
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgendarActionPerformed
        controle.agendar( 
            Integer.parseInt( tfIdAnimal.getText() ), 
            String.valueOf( lHorarios.getSelectedIndex() + 8 ), 
            tfData.getText()
        );
    }//GEN-LAST:event_bAgendarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgendar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lHorarios;
    private javax.swing.JLabel labNomeDono;
    private javax.swing.JLabel labNomePET;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfIdAnimal;
    // End of variables declaration//GEN-END:variables

}
