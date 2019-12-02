package CarEnum;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Muhammed", 34);
        Person person2 = new Person("Milan", 4);
        Person person3 = new Person("Lion", 1);
        Person person4 = new Person("Nergiz",35);


        System.out.println("Eigenaar1 = " +person1);
        System.out.println("Eigenaar2 = " +person2);
        System.out.println("Eigenaar3 = " +person3);
        System.out.println("Eigenaar4 = " +person4);



        Car car1 = new Car(117,CarBrand.BUICK,person1,FuelType.PETROL,10,55);
        Car car2 = new Car(153,CarBrand.CADILLAC,person1,FuelType.GAS,7,65);
        Car car3 = new Car(213,CarBrand.CHEVROLET,person1,FuelType.PETROL,5,85);
        Car car4 = new Car(300,CarBrand.OLDSMOBILE,person1,FuelType.GAS,3,120);
        Car car5 = new Car(120,CarBrand.LINCOLN,person2,FuelType.PETROL,5,65);
        Car car6 = new Car(150,CarBrand.BMW,person2,FuelType.DIESEL,17,60);
        Car car7 = new Car(130,CarBrand.AUDI,person3,FuelType.PETROL,16,50);
        Car car8 = new Car(100,CarBrand.BMW,person3,FuelType.DIESEL,22,40);
        Car car9 = new Car(181,CarBrand.TESLA,person4,FuelType.ELECTRIC,39,0);
        Car car10 = new Car(120,CarBrand.FORD,person4,FuelType.DIESEL,25,50);

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);
        System.out.println("car6 = " + car6);
        System.out.println("car7 = " + car7);
        System.out.println("car8 = " + car8);
        System.out.println("car9 = " + car9);
        System.out.println("car10 = " + car10);


    }

}
