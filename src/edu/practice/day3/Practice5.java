package edu.practice.day3;

public class Practice5 {

    /*
    - `String brand` (브랜드)
    - `String model` (모델명)
    - `int fuel` (연료량, 0~100)
    - `int speed` (현재 속도, 기본값 0)
    - `boolean isEngineOn` (엔진 상태, 기본값 false)
    - `int totalDistance`
     */

    private String brand;
    private String model;
    private int fuel;
    private int speed = 0;
    private boolean isEngineOn = false;
    private int totalDistance = 0;

    public Practice5() {
    }

    public Practice5(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.fuel = 100;
    }

    public Practice5(String brand, String model, int fuel, int speed, boolean isEngineOn, int totalDistance) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.speed = speed;
        this.isEngineOn = isEngineOn;
        this.totalDistance = totalDistance;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    /*
    - `startEngine()`: 엔진 시동 (연료 체크 후 시동)
    - `stopEngine()`: 엔진 정지
    - `accelerate(int speedUp)`: 가속 (엔진 켜진 상태에서만, 연료 소모)
    - `brake(int speedDown)`: 감속
    - `refuel(int amount)`: 주유
    - `drive(int distance)`: 주행 (거리만큼 이동, 연료 소모, 총 주행거리 증가)
    - `displayCarInfo()`: 자동차 현재 상태 출력
     */

    /*
    - `startEngine()`: 연료가 0이면 시동 불가 메시지
    - `accelerate()`: 엔진이 꺼져있으면 가속 불가
    - `drive()`: 거리 1km당 연료 0.1L 소모 (10km당 1L)
    - 연료가 부족하면 자동으로 엔진 정지
     */

    public void startEngine(){
        if (!isEngineOn){
            System.out.println(getModel() + " 엔진이 시동되었습니다.");
            isEngineOn = true;
            if (fuel <= 0){
                System.out.println("연료가 부족하여 시동을 걸 수 없습니다.");
            }
        } else {
            System.out.println("이미 시동이 걸려있습니다.");
        }
    }

    public void stopEngine(){
        // System.out.println( + " 엔진이 정지되었습니다.");
    }

    public void accelerate(int ridingSpeed){
        System.out.println(ridingSpeed + "km/h로 가속했습니다. 현재 속도: " + ridingSpeed + "km/h");
        setSpeed(ridingSpeed);
    }

    public void brake(){
        // System.out.println( + "km/h로 감속했습니다. 현재 속도: " ++ "km/h");
    }

    public void drive(int distance){
        if (!isEngineOn) System.out.println("엔진이 꺼져있어 주행할 수 없습니다.");

        int fuelNeeded = distance / 10; // 10km당 1L 소모
        if (fuel < fuelNeeded) {
            System.out.println("연료가 부족하여 " + distance + "km를 주행할 수 없습니다.");
            return;
        } else System.out.println(distance + "km 주행했습니다. 연료 " + fuelNeeded + "L 소모되었습니다.");
        if ((fuel - fuelNeeded) == 0) {
            System.out.println("연료가 모두 소모되었습니다. 엔진을 정지합니다.");
            isEngineOn = false;
        }
        setEngineOn(isEngineOn);
        setTotalDistance(distance);
        setFuel(fuel-fuelNeeded);
    }

    public void method5(int ridingSpeed, int distance){
        System.out.printf("---자동차 정보---\n브랜드 : %s\n모델 : %s\n연료량 : %dL\n속도 : %dkm/h\n엔진상태 : %b\n총 주행거리 : %dkm\n", brand, model, fuel, speed, isEngineOn, totalDistance);
        System.out.println();
        startEngine();
        System.out.println();
        accelerate(ridingSpeed);
        System.out.println();
        drive(distance);
        System.out.println();
        System.out.printf("---자동차 정보---\n브랜드 : %s\n모델 : %s\n연료량 : %dL\n속도 : %dkm/h\n엔진상태 : %b\n총 주행거리 : %dkm\n", getBrand(), getModel(), getFuel(), getSpeed(), isEngineOn(), getTotalDistance());



    }
}
