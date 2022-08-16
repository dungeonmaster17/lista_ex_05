package entidades;

public class INSS {
    private static final int IDADE_MIN = 65;
    private static final int TEMPO_DE_TRAB = 30;
    private Pessoa pessoa;

    public INSS(){}

    public INSS(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public boolean estaQualificado(Pessoa p){
        if(p.getIdade() >= IDADE_MIN && p.getTempoTrab() >= TEMPO_DE_TRAB || p.getIdade() >= IDADE_MIN - 5 && p.getTempoTrab() < TEMPO_DE_TRAB - 5){
            return true;
        }
        return false;
    }
}
