package models;

public class Feedback {
    private final int avaliacao;
    private final Servico servico;
    private final Cliente cliente;

    public Feedback(int avaliacao, Servico servico, Cliente cliente) {
        this.avaliacao = avaliacao;
        this.servico = servico;
        this.cliente = cliente;
    }

    public void gerarFeedback() {
        System.out.println("Feedback gerado para: " + cliente.getNomeCompleto());
    }
}

