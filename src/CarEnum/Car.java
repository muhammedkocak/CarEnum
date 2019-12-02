package CarEnum;

public class Car {

    private int horsepower;
    private CarBrand  brand;
    private Person owner;
    private FuelType fuel;
    private double fuelUsage;
    private double maxFuel;


    public Car(int horsepower, CarBrand brand, Person owner, FuelType fuel, double fuelUsage, double maxFuel){
        this.horsepower = horsepower;
        this.brand = brand;
        this.owner = owner;
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.maxFuel = maxFuel;
    }



    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", brand=" + brand +
                ", owner=" + owner +
                ", fuel=" + fuel +
                ", fuelUsage=" + fuelUsage +
                ", maxFuel=" + maxFuel +
                '}';
    }
}
