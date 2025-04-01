package org.example;

public class Fila {

    public No inicio;
    public No fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public void inserirNoInicio(Paciente paciente) {
        No novoNo = new No(paciente);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            inicio.anterior = novoNo;
            novoNo.proximo = inicio;
            inicio = novoNo;
        }
    }

    public No fim(){
        return fim;
    }

    public void removerNoFim() {
        if (fim == null) {
            System.out.println("Fila vazia");
        } else {
            if (fim.paciente == inicio.paciente) {
                inicio = null;
            }
            fim = fim.anterior;
            if (fim != null) {
                fim.proximo = null;
            }
        }
    }

    public void printarFila() {
        No temp = inicio;
        while (temp != null) {
            System.out.println(temp.paciente.toString() + "\n\n");
            temp = temp.proximo;
        }
        System.out.println();
    }
}
