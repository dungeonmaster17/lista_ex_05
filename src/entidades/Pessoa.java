package entidades;

public class Pessoa {
    private String nome;
    private int idade;
    private int tempoTrab;

    public Pessoa(){}

    public Pessoa(String nome, int idade, int tempoTrab) {
        this.nome = nome;
        this.idade = idade;
        this.tempoTrab = tempoTrab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoTrab() {
        return tempoTrab;
    }

    public void setTempoTrab(int tempoTrab) {
        this.tempoTrab = tempoTrab;
    }
}
