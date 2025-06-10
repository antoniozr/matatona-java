package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyohosa Shimazu");

        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga",2000);
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        System.out.println("-------------");
        funcionario.imprime();
    }
}
