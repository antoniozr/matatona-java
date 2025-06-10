package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositiorio;

public class RepositorioMemoria implements Repositiorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
