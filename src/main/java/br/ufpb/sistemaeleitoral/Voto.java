package br.ufpb.sistemaeleitoral;

public class Voto {
    private int numeroVotado;

    public Voto(int numeroVotado) {
        this.numeroVotado = numeroVotado;
    }

    public int getNumeroVotado() {
        return this.numeroVotado;
    }

    public void setNumeroVotado(int novoNumeroVotado) {
        this.numeroVotado = novoNumeroVotado;
    }

}
