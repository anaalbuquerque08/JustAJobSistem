package models;

public class Cliente {
    private final String nomeCompleto;
    private final String email;
    private final String rg;
    private final String telefone;
    private final String enderecoPessoal;
    private final String complemento;

    public Cliente(String nomeCompleto, String email, String rg, String telefone, String enderecoPessoal, String complemento) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.rg = rg;
        this.telefone = telefone;
        this.enderecoPessoal = enderecoPessoal;
        this.complemento = complemento;
    }

    public void cadastrarCliente() {
        System.out.println("Cliente cadastrado: " + nomeCompleto);
    }

    public void solicitarServico() {
        System.out.println("Serviço solicitado por: " + nomeCompleto);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEnderecoPessoal() {
        return enderecoPessoal;
    }

    public String getComplemento() {
        return complemento;
    }
}
