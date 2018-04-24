package comandos.arcondicionado;

import java.util.ArrayList;
import java.util.List;

import comandos.Command;
import equipamentos.ArCondicionado;

public class MeuPreferidoArCondicionado implements Command {

    private ArCondicionado ar;
    private List<ComandoArCondicionado> comandos = new ArrayList<>();

    public MeuPreferidoArCondicionado(ArCondicionado ar) {
        this.ar = ar;

        comandos.add(new LigarArCondicionado(ar));
        comandos.add(new AumentarTemperaturaArCondicionado(ar));
        comandos.add(new AumentarTemperaturaArCondicionado(ar));
        comandos.add(new AumentarTemperaturaArCondicionado(ar));
        comandos.add(new AumentarTemperaturaArCondicionado(ar));
    }

    @Override
    public void execute() {
        for (Command com : comandos) {
            com.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = comandos.size() - 1; i >= 0; i--) {
            comandos.get(i).undo();
        }
    }

    @Override
    public String toString() {
        return "MeuPreferido";
    }

}
