package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L,"Antonio","12345671");
        Turma turma = new Turma("Maratona Java virado no Jiraya");
        aluno.setTurma(turma);
        serializar(aluno);
        desserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))) {
            oss.writeObject(aluno);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


     private static void desserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
