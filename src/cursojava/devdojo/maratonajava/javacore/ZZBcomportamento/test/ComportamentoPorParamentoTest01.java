package cursojava.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import cursojava.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParamentoTest01 {
   private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2016));
    public static void main(String[] args) {
        System.out.println(filteGreenCar(cars));
        System.out.println(filteRedCar(cars));
        System.out.println(filteByColor(cars,"green"));
        System.out.println(filteByColor(cars,"red"));
        System.out.println(filterByYearBefore(cars,2016));

    }
    private static List<Car> filteGreenCar(List<Car> cars){
        List<Car>filterdCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")){
                filterdCar.add(car);
            }

        }
        return filterdCar;

    }
    private static List<Car> filteRedCar(List<Car> cars){
        List<Car>filterdCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")){
                filterdCar.add(car);
            }

        }
        return filterdCar;

    }
    private static List<Car> filteByColor(List<Car> cars, String cor){
        List<Car>filterdCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)){
                filterdCar.add(car);
            }

        }
        return filterdCar;

    }
    private static List<Car> filterByYearBefore(List<Car> cars, int year){
        List<Car>filterdCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() <year){
                filterdCar.add(car);
            }

        }
        return filterdCar;

    }

    }
    


