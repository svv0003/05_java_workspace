package edu.inheritance.ex2;

public class Car extends Vehicle {
    private String fuelType;
    private int doors;

    public Car() {
        super();
    }

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }
    public Car(String brand, String model, int year, String color, String fuelType, int doors) {
        super(brand,model,year,color);
        this.fuelType = fuelType;
        this.doors = doors;
    }

    @Override
    public void accelerate() {
        System.out.println("자동차가 액셀러레이터를 밟아 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("자동차가 브레이크를 밟아 감속합니다.");
    }

    public void honk() {
        System.out.println(getBrand() + " " + getModel() + "이(가) 빵빵! 경적을 울립니다.");
    }

    public void openTrunk() {
        System.out.println(getBrand() + " " + getModel() + "이(가) 트렁크를 엽니다.");
    }

    // getter & setter
    public String getFuelType() {
        return fuelType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}