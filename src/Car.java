// JD Module 303.12

// #1. Create a superclass called Car
public class Car {
    String color;
    int speed;
    double regularPrice;

    public Car(String color, int speed, double regularPrice) {
        this.color = color;
        this.speed = speed;
        this.regularPrice = regularPrice;
    }

    double getSalePrice() {
        return  regularPrice;
    }
}
