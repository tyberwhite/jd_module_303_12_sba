// JD Module 303.12 - SBA
// 3/1/23
// J.T.W.

public class MyOwnAutoShop {
    public static void main(String[] args) {

        // 5a. Create an instance of the Sedan class and initialize all fields.
        Sedan bentley = new Sedan("green", 75, 125000, 18 );

        // 5b. Create two instances of the Ford class and initialize all the fields with appropriate values.
        Ford mustang = new Ford("black", 120, 45000, 2020, 2000);
        Ford taurus = new Ford("red", 85, 25950, 2022, 1800);

        // 5c. Create an instance of the Car class and initialize all the fields with appropriate values.
        Car pinto = new Car("blue", 65, 10000);

        // 5d. Display the sale prices of all instances.
        System.out.println("Bentley Sedan Sale Price: " + bentley.getSalePrice()); // 112500.0
        System.out.println("Mustang Sale Price: " + mustang.getSalePrice()); // 43000.0
        System.out.println("Taurus Sale Price: " + taurus.getSalePrice()); // 24150.0
        System.out.println("Pinto Sale Price: " + pinto.getSalePrice()); // 10000.0
    }
}