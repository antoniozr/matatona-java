package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("Black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
//        List<Car> greenCarrs = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
        List<Car> greenCarrs = filter(cars,car -> car.getColor().equals("green"));
        List<Car> redCarrs = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCarrs = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCarrs);
        System.out.println(redCarrs);
        System.out.println(yearBeforeCarrs);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }


}
