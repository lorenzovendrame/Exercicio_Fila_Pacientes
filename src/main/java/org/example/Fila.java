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
            No tempNo = inicio;

            while (tempNo.paciente.getPrioridade().getValor() < novoNo.paciente.getPrioridade().getValor()){
                if (tempNo.proximo == null) {
                    tempNo.proximo = novoNo;
                    novoNo.anterior = tempNo;
                    return;
                }
                tempNo = tempNo.proximo;
            }

            if (tempNo == inicio) {
                novoNo.proximo = tempNo;
                tempNo.anterior = novoNo;
                inicio = novoNo;
            } else {
                novoNo.proximo = tempNo;
                novoNo.anterior = tempNo.anterior;
                tempNo.anterior = novoNo;
                tempNo.anterior.proximo = novoNo;
            }

        }
    }

    public No fim(){
        return fim;
    }

    public void removerNoFim() {
        if (fim == null) {
            System.out.println("Fila vazia");
        } else {
            System.out.println("Atendendo o seguinte Paciente: \n" + fim.paciente.toString());
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
