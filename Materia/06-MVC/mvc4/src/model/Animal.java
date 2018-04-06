package model;

public class Animal {

    private int idAnimal;
    private String nomeAnimal;
    private String nomeDono;

    public Animal() {
    }

    public Animal(int idAnimal, String nomeAnimal, String nomeDono) {
        this.idAnimal = idAnimal;
        this.nomeAnimal = nomeAnimal;
        this.nomeDono = nomeDono;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    @Override
    public String toString() {
        return "Animal{" + "idAnimal=" + idAnimal + ", nomeAnimal=" + nomeAnimal + ", nomeDono=" + nomeDono + '}';
    }
    
    
}
