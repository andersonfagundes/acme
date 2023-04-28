package br.edu.infnet;

import java.util.List;

public class Funcionario implements FuncionarioTerceirizado{
    private String Nome;
    private List<Telefone> telefone;
    private Endereco endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;

    public Funcionario(String nome, List<Telefone> telefone, Endereco endereco, double salario, Setor setor, Cargo cargo) {
        Nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    @Override
    public String empresaContratada() {
        return "Empresa ABC";
    }

    @Override
    public String tempoPrevistoDePermanencia() {
        return "12 meses";
    }
}
