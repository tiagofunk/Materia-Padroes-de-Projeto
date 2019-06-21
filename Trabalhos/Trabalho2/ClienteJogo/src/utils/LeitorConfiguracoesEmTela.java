package utils;

import javax.swing.JOptionPane;

public class LeitorConfiguracoesEmTela implements TipoLeitor{

    @Override
    public String[] lerConfiguracoes() {
        String[] retorno = new String[2];
        
        retorno[0] = JOptionPane.showInputDialog("host");
        retorno[1] = JOptionPane.showInputDialog("porta");
        
        return retorno;
    }
    
}
