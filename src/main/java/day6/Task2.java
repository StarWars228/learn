package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("AirLine", 2005, 7500, 42000);
        airplane.setYear(2018);
        airplane.setLength(70);

        airplane.fillUp(1000);
        airplane.fillUp(8000);
        airplane.info();
    }
}
