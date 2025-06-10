package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Antonio")
                .lastName("Queiroz")
                .userName("JuniorQ")
                .email("Antonio@")
                .build();
        System.out.println(build);
    }
}
