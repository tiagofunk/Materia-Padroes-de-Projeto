package comandos.lampada;

import comandos.Command;
import equipamentos.Lampada;

public class DesligarLampada implements Command {

    private Lampada lampada;

    public DesligarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void execute() {
        lampada.apagar();
    }

    @Override
    public void undo() {
        lampada.acender();
    }

    @Override
    public String toString() {
        return "Desligar";
    }
}
