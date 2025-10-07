class Vehicle {
    String brand;
    int year;
    double price;
    
    Vehicle (String brand, int year, double price){
        this.brand = brand;
        this.year = year;
        this.price = price;

    }

    void displayInfo(){
        System.out.println("Brand Name: "+brand);
        System.out.println("Year Release: "+year);
        System.out.println("Brand Price: "+price);

    }
}


class Car extends Vehicle {
    double speed ;
    Car (String brand, int year , double price){
        super(brand, year, price);
    }
}

public class TestOOP {
    public static void main (String[] args){
        Car redCar =  new Car ("Toyota Supra ", 2003, 40000);

        Car blueCar =  new Car( "Mazda RX7", 2009, 50000 );

        Car greenCar =  new Car( "Hennessy Venom F5", 2009, 70000 );

        redCar.displayInfo();
        blueCar.displayInfo();
        greenCar.displayInfo();

    }
}