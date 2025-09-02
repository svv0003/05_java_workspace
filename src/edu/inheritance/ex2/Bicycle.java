package edu.inheritance.ex2;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean isElectric;

    public Bicycle() {

    }

    public Bicycle(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    public Bicycle(String brand, String model, int year, String color, int gearCount, boolean isElectric) {
        super(brand, model, year, color);
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    public void ringBell() {
        System.out.println(getBrand() + " " + getModel() + "이(가) 따르릉~ 벨을 울립니다!");
    }

    public void pedal() {
        System.out.println(getBrand() + " " + getModel() + "이(가) 힘차게 페달링을 합니다!");
    }

    @Override
    public void accelerate() {
        System.out.println("자전거가 페달을 밟아 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("자전거가 브레이크를 잡아 감속합니다.");
    }

    // getter & setter
    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }


}