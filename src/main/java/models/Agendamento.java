package models;

public class Agendamento {
    private final Cliente cliente;
    private final Servico servico;
    private final Orcamento orcamento;
    private final Pagamento pagamento;

    public Agendamento(Cliente cliente, Servico servico, Orcamento orcamento, Pagamento pagamento) {
        this.cliente = cliente;
        this.servico = servico;
        this.orcamento = orcamento;
        this.pagamento = pagamento;
    }

    public void confirmarReserva() {
        System.out.println("Reserva confirmada para: " + cliente.getNomeCompleto());
    }

}
