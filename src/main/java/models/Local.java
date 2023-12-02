package models;

public class Local {
    private final String endereco;
    private final String complemento;

    public Local(String endereco, String complemento) {
        this.endereco = endereco;
        this.complemento = complemento;
    }

    public String gerarEndereco() {
        return "Endereço gerado";
    }
}
