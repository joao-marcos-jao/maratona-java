package cursojava.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import cursojava.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import cursojava.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParamntroTest03 {
    private static List<Car> cars = List.of(new Car("green",2011),new Car("black",1998),new Car("red",2019));
    public static void main(String[] args) {
        List<Car> greencars = filter(cars, car -> car.getColor().equals("green")) ;
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() <2015);
        System.out.println(greencars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
        List<Integer> nums =List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num-> num % 2 == 0));
    }
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filterdList = new ArrayList<>();
        for (T e: list) {
            if (predicate.test(e)){
                filterdList.add(e);
            }
        }
        return filterdList;
    }

}
