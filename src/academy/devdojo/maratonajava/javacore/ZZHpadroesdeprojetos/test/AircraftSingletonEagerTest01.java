package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEager.getInstance());
        AircraftSingletonEager aircraft = AircraftSingletonEager.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
