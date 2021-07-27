package day5;

public class Task1 {
    public static void main(String[] args){
        Car car = new Car();
        car.setModel("GTZ");
        car.setColor("Black");
        car.setYear(2010);

        System.out.println(car.getColor() + " "  + car.getYear() + " " + car.getModel());

        Bike bike = new Bike("Red", "Honda", 2021);

        System.out.println(bike.getYear() + " " + bike.getModel() + " " +  bike.getColor());
    }
}
