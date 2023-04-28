package br.edu.infnet;

public class Funcionario {
    private String Nome;
    private String telefone;
    private String endereco;
    private Setor setor;
    private Cargo cargo;

    public Funcionario(String nome, String telefone, String endereco, Setor setor, Cargo cargo) {
        Nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
