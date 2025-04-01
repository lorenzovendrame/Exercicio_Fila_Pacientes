package org.example;

public class GerenciamentoPedidos {
    public Fila fila;
    long numeroPedido;

    public GerenciamentoPedidos(){
        fila = new Fila();
        numeroPedido = 0;
    }

    public void inserirPedidoFila(Paciente paciente){
        paciente.setNumeroPaciente(++numeroPedido);
        fila.inserirNoInicio(paciente);
    }

    public void removerPedidoFila(){
        fila.removerNoFim();
    }

    public void printarPacientes(){
        if (fila != null && fila.inicio != null){
            fila.printarFila();
        } else {
            System.out.println("Fila vazia!");
        }
    }
}
