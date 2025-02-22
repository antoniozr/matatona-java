package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositiorio;

public class RepositorioBancoDeDados implements Repositiorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
