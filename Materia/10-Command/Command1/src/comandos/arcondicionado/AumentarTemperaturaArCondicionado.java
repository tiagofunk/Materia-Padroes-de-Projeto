package comandos.arcondicionado;

import equipamentos.ArCondicionado;

public class AumentarTemperaturaArCondicionado implements ComandoArCondicionado {

    private ArCondicionado ar;

    public AumentarTemperaturaArCondicionado(ArCondicionado ar) {
        this.ar = ar;
    }

    @Override
    public void execute() {
        ar.aumentarTemperatura();
    }

    @Override
    public void undo() {
        ar.abaixarTemperatura();
    }

    @Override
    public String toString() {
        return "Aumentar";
    }
}
