package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Black");
        car.setModel("Opel");
        car.setYear(2020);

<<<<<<< HEAD
        Car ford = new Car();
        ford.setYearRelease(1958);
        ford.setColorCar("Red");
        ford.setModel("Mustang GT");

        Car mustang = new Car();
        mustang.setModel("Mustang 770");
        mustang.setColorCar("Оранжевый");
        mustang.setYearRelease(1980);

        ford.getInfo();
        mustang.getInfo();
    }
}
        class Car {
           private int yearRelease;
           private String colorCar;
           private String model;

            public void setYearRelease(int yearRelease) {
                this.yearRelease = yearRelease;
            }
            public void setColorCar(String colorCar) {
                this.colorCar = colorCar;
            }
            public void setModel(String model) {
                this.model = model;
            }
            public int getYearRelease() {
                return yearRelease;
            }
            public String getColorCar() {
                return colorCar;
            }
            public String getModel() {
                return model;
            }
            public void getInfo() {
                System.out.println("Дата выпуска: " + yearRelease + " Цвет авто: " + colorCar + " Модель авто: " + model);
            }
        }
=======
        System.out.println(" Model car: " + car.getModel() + " \n Color car: " + car.getColor() + "\n Year car: " + car.getYear());
    }
}
>>>>>>> ca2de84 (day 6)
