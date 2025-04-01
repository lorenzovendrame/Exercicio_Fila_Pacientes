package org.example;

public enum Prioridade {
    MINIMA(1),
    MEDIA(2),
    MAXIMA(3);

    private final int valor;

    Prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
