package org.example;

public class Paciente {

    private long numeroPaciente;
    private long numeroCarteirinha;
    private String nomePaciente;
    private Prioridade prioridade;

    public Paciente(long numeroPaciente, long numeroCarteirinha, String nomePaciente, Prioridade prioridade) {
        this.numeroPaciente = numeroPaciente;
        this.numeroCarteirinha = numeroCarteirinha;
        this.nomePaciente = nomePaciente;
        this.prioridade = prioridade;
    }

    public long getNumeroPaciente() {
        return numeroPaciente;
    }

    public void setNumeroPaciente(long numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public long getNumeroCarteirinha() {
        return numeroCarteirinha;
    }

    public void setNumeroCarteirinha(long numeroCarteirinha) {
        this.numeroCarteirinha = numeroCarteirinha;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Número do Paciente: " + numeroPaciente + "\n" +
               "Número da Carteirinha: " + numeroCarteirinha + "\n" +
               "Nome do Paciente: " + nomePaciente;
    }
}
