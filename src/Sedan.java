// JD Module 303.12

// 4. Create a subclass of the car class and name it Sedan

public class Sedan extends Car {
    int length;

    public Sedan(String color, int speed, double regularPrice, int length) {
        super(color, speed, regularPrice);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95;
        } else {
            return regularPrice * 0.9;
        }
    }

}
