package cursojava.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import cursojava.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import cursojava.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParamntroTest02 {
    private static List<Car> cars = List.of(new Car("green",2011),new Car("black",1998),new Car("red",2019));
    public static void main(String[] args) {
   //List<Car> greencars = filter(cars, new CarPredicate() {
   //     @Override
   //     public boolean test(Car car) {
   //         return car.getColor().equals("green");
   //     }
   // });
        List<Car> greencars = filter(cars, car -> car.getColor().equals("green")) ;
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() <2015);

        System.out.println(greencars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);

    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car>filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }

        }
        return filteredCar;

    }
}
