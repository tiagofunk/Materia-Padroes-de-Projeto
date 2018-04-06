package model;

public class Consulta {
    
    private Animal animal;
    private String horario;
    private String data;

    public Consulta() {
    }

    public Consulta(Animal animal, String horario, String data) {
        this.animal = animal;
        this.horario = horario;
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Consulta{" + "animal=" + animal + ", horario=" + horario + ", data=" + data + '}';
    }
    
    
}
