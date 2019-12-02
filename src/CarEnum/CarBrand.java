package CarEnum;

public enum  CarBrand {

    AUDI(1800), PORSCHE(1400), BMW(2100), TESLA(3200), PEUGEOT(1500),CHEVROLET(2250),CADILLAC(2500),OLDSMOBILE(1950),FORD(2800),BUICK(1500),CHRYSLER(1700),GMC(3500),LINCOLN(2850),MERCURY(1300),PLYMOUTH(1100),PONTIAC(2200);

    private double weight;

    private CarBrand(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "CarBrand{" +
                "weight=" + weight +
                '}';
    }
}
