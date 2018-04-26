package view;

import controller.Controle;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CadastroContato extends JFrame{

    private JTextField jtfNome;
    private JTextField jtfEndereco;
    private JTextField jtfEmail;
    private JTextField jtfTelefone;
    
    private Controle controle;

    public CadastroContato() {
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setTitle("Cadastro de Contatos");
        
        controle = new Controle();
        initComponents();
    }

    private void initComponents() {
        JPanel jPanel1 = new JPanel(new SpringLayout());

        jPanel1.add(new JLabel("Nome :"));
        jtfNome = new JTextField();
        jPanel1.add(jtfNome);

        jPanel1.add(new JLabel("Endereco :"));
        jtfEndereco = new JTextField();
        jPanel1.add(jtfEndereco);

        jPanel1.add(new JLabel("E-mail :"));
        jtfEmail = new JTextField();
        jPanel1.add(jtfEmail);

        jPanel1.add(new JLabel("Telefone :"));
        jtfTelefone = new JTextField();
        jPanel1.add(jtfTelefone);

        SpringUtilities.makeCompactGrid(jPanel1, 4, 2, 3, 3, 3, 3);

        add(BorderLayout.NORTH, jPanel1);

        JPanel jPanel2 = new JPanel();

        JRadioButton jrInternet = new JRadioButton("Internet");
        jrInternet.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                desabilitarTudo();
                jtfEmail.setEnabled(true);
            }

        });
        jPanel2.add(jrInternet);

        JRadioButton jrTelefone = new JRadioButton("Telefone");
        jrTelefone.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                desabilitarTudo();
                jtfTelefone.setEnabled(true);
            }

        });
        jPanel2.add(jrTelefone);

        JRadioButton jrCompleto = new JRadioButton("Completo");
        jrCompleto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                jtfEmail.setEnabled(true);
                jtfEndereco.setEnabled(true);
                jtfTelefone.setEnabled(true);
            }

        });
        jrCompleto.setSelected(true);
        jPanel2.add(jrCompleto);

        add(BorderLayout.CENTER, jPanel2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jrInternet);
        buttonGroup1.add(jrTelefone);
        buttonGroup1.add(jrCompleto);

        JButton jb = new JButton("Cadastrar");
        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // De acordo com o radiobutton selecionado, criar um builder.
                String opcao = "";
                if( jrCompleto.isSelected() ){
                    opcao = "completo";
                }else if( jrInternet.isSelected() ){
                    opcao = "internet";
                }else if( jrTelefone.isSelected() ){
                    opcao = "telefone";
                }
                controle.cadastrar(
                    jtfNome.getText(), jtfEndereco.getText(),
                    jtfEmail.getText(), jtfTelefone.getText(), opcao);
                
                jtfNome.setText( "" );
                jtfEndereco.setText( "" );
                jtfTelefone.setText( "" );
                jtfEmail.setText( "" );
                // Criar o Director passando o builder como parametro
                // Chamar o construi do Director passando como parametro os valores dos campos
                //  JOptionPane.showMessageDialog(null, chamar o getPessoa() do Director);
            }

        });

        JPanel jp = new JPanel();
        jp.add(jb);
        add(BorderLayout.SOUTH, jp);

    }

    private void desabilitarTudo() {
        jtfEmail.setEnabled(false);
        jtfEndereco.setEnabled(false);
        jtfTelefone.setEnabled(false);
    }

    public static void main(String[] args) {
        CadastroContato cc = new CadastroContato();
        cc.setVisible(true);
    }

}
