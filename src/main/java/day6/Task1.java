package day6;

public class Task1 {
    public static void main(String[] args) {

    Car car = new Car();
    car.setModel("Honda");
    car.setColor("Black");
    car.setYear(1980);

    Motobike motobike = new Motobike(2000, "Red", "GTZ");

    car.info();
        System.out.println(car.yearDifference(2021) + " год автомобилю \n");

    motobike.info();
         System.out.println(motobike.yearDifference(2021) + " год мотоциклу");
    }
}
