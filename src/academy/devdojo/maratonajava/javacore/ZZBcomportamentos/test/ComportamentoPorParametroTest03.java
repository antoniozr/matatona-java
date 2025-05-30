package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("Black", 1998), new Car("red", 2019));

    public static void main(String[] args) {

        List<Car> greenCarrs = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCarrs = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCarrs = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCarrs);
        System.out.println(redCarrs);
        System.out.println(yearBeforeCarrs);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }


}
