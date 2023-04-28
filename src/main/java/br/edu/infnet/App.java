package br.edu.infnet;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Telefone telefone1 = new Telefone("21999999999");
        Telefone telefone2 = new Telefone("21888888888");

        List<Telefone> telefones = new ArrayList<>();
        telefones.add(telefone1);
        telefones.add(telefone2);

        Endereco endereco = new Endereco("Rua que sobe", "22230040","150", "Urca",
                "Rio de Janeiro", "Rio de Janeiro");

        Funcionario funcionario = new Funcionario("Marco",telefones,endereco, 12000D,
                Setor.DESENVOLVIMENTO, Cargo.PLENO);

        System.out.println("-----SISTEMA ACME-----");
        System.out.println("Nome: "+ funcionario.getNome());
        System.out.println("Telefone(s): "+funcionario.getTelefone());
        System.out.println("Salário: "+funcionario.getSalario());
        System.out.println("Endereco: "+funcionario.getEndereco());
        System.out.println("Empresa contratada: "+funcionario.empresaContratada());
        System.out.println("Tempo previsto de permanência: "+funcionario.tempoPrevistoDePermanencia());

    }
}
