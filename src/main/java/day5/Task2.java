package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike("Red", "GTZ", 2020);
        motorbike.getInfo();
    }
}
    class Motorbike {
        private int yearRelease;
        private String color;
        private String model;

    public Motorbike(String color, String model, int yearRelease) {
        this.color = color;
        this.model = model;
        this.yearRelease = yearRelease;
    }
    public void getInfo(){
        System.out.println("Цвет мотоцикла: " + color + " Модель мотоцикла: " + model + " Год выпуска: " + yearRelease);
    }
}
