package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositiorio;

public class RepositorioArquivo implements Repositiorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
