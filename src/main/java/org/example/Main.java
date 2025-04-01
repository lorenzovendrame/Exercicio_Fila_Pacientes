package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciamentoPedidos gp = new GerenciamentoPedidos();
        while (true){

            //Display do menu no console
            System.out.println("==============================");
            System.out.println("|     SISTEMA DA CLÍNICA     |");
            System.out.println("==============================");
            System.out.println("| Opções :                   |");
            System.out.println("| 1. Adicionar Paciente      |");
            System.out.println("| 2. Atender Próx Paciente   |");
            System.out.println("| 3. Imprimir Lista Pacientes|");
            System.out.println("| 4. Sair                    |");
            System.out.println("==============================");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    Scanner adicionarNumCarteirinha = new Scanner(System.in);
                    System.out.println("Digite o número da carteirinha: ");
                    long numeroCarteirinha = adicionarNumCarteirinha.nextLong();
                    Scanner nomePacienteScan  = new Scanner(System.in);
                    System.out.println("Digite o nome do Paciente: ");
                    String nomePaciente = nomePacienteScan.nextLine();
                    System.out.println("Escolha o número da prioridade: Mínima(1), Média(2) e Máxima(3)");
                    int escolhaPrioridade = nomePacienteScan.nextInt();
                    Prioridade prioridade;
                        switch(escolhaPrioridade){
                            case 1:
                                prioridade = Prioridade.MINIMA;
                                break;
                            case 2:
                                prioridade = Prioridade.MEDIA;
                                break;
                            case 3:
                                prioridade = Prioridade.MAXIMA;
                                break;
                            default:
                                prioridade = Prioridade.MINIMA;
                                System.out.println("Prioridade incorreta! Escolhendo a prioridade mínima");
                                break;
                        }
                    Paciente paciente = new Paciente(gp.numeroPedido, numeroCarteirinha, nomePaciente, prioridade);
                    gp.inserirPedidoFila(paciente);
                    break;
                case 2:
                    if (gp.fila != null && gp.fila.fim() != null) {
                        gp.removerPedidoFila();
                    } else {
                        System.out.println("Fila vazia!");
                    }
                    break;
                case 3:
                    gp.printarPacientes();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma escolha válida!");
                    break;
            }
        }
    }
}
