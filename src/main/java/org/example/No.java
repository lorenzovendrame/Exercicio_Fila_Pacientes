package org.example;

public class No { //Nó da lista encadeada
    public Paciente paciente;
    public No proximo;
    public No anterior;

    public No(Paciente paciente) {
        this.paciente = paciente;
        this.proximo = null;
        this.anterior = null;
    }
}
