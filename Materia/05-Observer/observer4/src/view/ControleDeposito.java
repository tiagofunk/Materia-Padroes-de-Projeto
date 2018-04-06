package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.JOptionPane;

import model.Deposito;
import model.Observador;

public class ControleDeposito extends javax.swing.JFrame  implements Observador{
    
    private static final long serialVersionUID = 1L;
    
    private DepositoListModel depositoListModel;
    
    private Deposito deposito;
	
    private class DepositoListModel extends AbstractListModel {

		private static final long serialVersionUID = 1L;
		
		private int tamanho = 0;

		public int getSize() {
            return tamanho;
        }

        private String texto = "Exemplo";

        public void setTexto(String texto) {
            this.texto = texto;
            tamanho++;
            fireIntervalAdded(this, 0, 1 );
        }
        
        public Object getElementAt(int index) {
            return texto;
        }

        
    }
    
    public ControleDeposito() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.depositoListModel = new DepositoListModel();
        jList1.setModel(depositoListModel);
        
    }
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoTextoQuantidadeMaxima = new javax.swing.JTextField();
        campoTextoQuantidadeCritica = new javax.swing.JTextField();
        botaoCriarDeposito = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campoTextoQuantidade = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelQuantidadeAtual = new javax.swing.JLabel();
        labelNumeroQuantidadeAtual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de deposito");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do deposito"));

        jLabel1.setText("Qtdade maxima :");

        jLabel2.setText("Qtdade critica :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTextoQuantidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoQuantidadeCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoCriarDeposito)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoTextoQuantidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoTextoQuantidadeCritica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoCriarDeposito)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fluxo"));

        jLabel3.setText("Qtdade :");

        botaoCriarDeposito.setText("Criar deposito");
        botaoCriarDeposito.addActionListener( new java.awt.event.ActionListener() {
        	public void actionPerformed( java.awt.event.ActionEvent evt ) {
        		botaoCriarDepositoActionPerformed(evt);
        	}
        });
        
        botaoAdicionar.setText("Add");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	botaoAdicionarActionPerformed(evt);
            }
        });

        jButton3.setText("Retirar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	botaoRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTextoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(botaoAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTextoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(botaoAdicionar))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));

        labelQuantidadeAtual.setText("Qtdade atual :");

        labelNumeroQuantidadeAtual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNumeroQuantidadeAtual.setText("0");

        jScrollPane1.setViewportView(jList1);

        jLabel6.setText("Fluxo :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(labelQuantidadeAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNumeroQuantidadeAtual)
                .addContainerGap(114, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidadeAtual)
                    .addComponent(labelNumeroQuantidadeAtual))
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    
    private void botaoCriarDepositoActionPerformed(java.awt.event.ActionEvent evt) {
    	deposito = new Deposito( 
    			Integer.parseInt( campoTextoQuantidadeCritica.getText() ),
    			Integer.parseInt( campoTextoQuantidadeMaxima.getText() )
    	);
    	deposito.addObservador( this );
    	campoTextoQuantidadeMaxima.setText( "" );
    	campoTextoQuantidadeCritica.setText( "" );
    	
    	deposito.addObservador( new MostrarEmJOP("JOP 1") );
    	deposito.addObservador( new MostrarEmJOP("JOP 2") );
    }

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
			deposito.adicionar( Integer.parseInt( campoTextoQuantidade.getText() ) );
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Digite apenas números no campo");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Tentativa de armazenar mais que o permitido" );
			//e.printStackTrace();
		}
    	campoTextoQuantidade.setText( "" );
    }
    
    public void botaoRetirarActionPerformed( java.awt.event.ActionEvent evt ) {
    	int valorRetirado = deposito.retirar( Integer.parseInt( campoTextoQuantidade.getText() ) );
    	JOptionPane.showMessageDialog(this, "Valor Retirado: " + valorRetirado );
    	campoTextoQuantidade.setText( "" );
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleDeposito().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton botaoCriarDeposito;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelQuantidadeAtual;
    private javax.swing.JLabel labelNumeroQuantidadeAtual;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField campoTextoQuantidadeMaxima;
    private javax.swing.JTextField campoTextoQuantidadeCritica;
    private javax.swing.JTextField campoTextoQuantidade;
    
	@Override
	public void setQuantidadeAtual(int quantidade) {
		labelNumeroQuantidadeAtual.setText( String.valueOf( quantidade ) );
	}

	@Override
	public void setQuantidadeAdicionada(int quantidade) {
		depositoListModel.setTexto( "Adicionado: " + String.valueOf( quantidade ) );
	}

	@Override
	public void setQuantidadeRetirada(int quantidade) {
		depositoListModel.setTexto( "Retirado: " + String.valueOf( quantidade ) );
	}
    
}