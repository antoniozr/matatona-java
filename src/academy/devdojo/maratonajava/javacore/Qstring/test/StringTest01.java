package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William";
        String nome2 = "William";
        nome = nome.concat(" Suane"); // nome += " suane"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("William"); // 1 variavel de referência, 2 objeto do tipo string, 3 uma string no pool de string
    }
}
