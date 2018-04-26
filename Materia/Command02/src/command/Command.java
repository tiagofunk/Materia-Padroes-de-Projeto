package command;

import model.Deposito;

public interface Command {
    
    void setDeposito( Deposito d );
    void execute(int qtdade);
    void undo();
    void redo();

}
