package edu.practice.day3;

public class Practice2 {

    private String model;
    private int batteryLevel;
    private boolean isPowerOn = true;

    public Practice2() {
    }

    public Practice2(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }


    public void useBattery(int usePercent){
        if (!isPowerOn) {
            System.out.println("전원이 꺼져있어 배터리를 사용할 수 없습니다.");
        } else {
            if (batteryLevel < usePercent) {
                powerOff();
                isPowerOn = false;
                System.out.println("배터리가 모두 소모되어 전원이 꺼집니다.");
                batteryLevel = 0;
            } else {
                System.out.println("배터리를 " + usePercent + "% 사용했습니다.");
                batteryLevel -= usePercent;
            }
        }
    }

    public void powerOff(){
        isPowerOn = false;
        System.out.println(model + "의 전원이 꺼졌습니다.");
    }

    public void charge(int chargePercent){
        if (!isPowerOn){
            System.out.println(model + "의 전원이 켜졌습니다.");
        }
        if (batteryLevel + chargePercent >= 100) {
            System.out.println((100-batteryLevel) + "% 충전되었습니다.");
            batteryLevel = 100;
        } else {
            System.out.println(chargePercent + "% 충전되었습니다.");
            batteryLevel += chargePercent;
        }

    }

    public void method2(int usePercent, int chargePercent){
        System.out.println("=== 스마트폰 상태 ===");
        System.out.println("모델: " + model);
        System.out.println("배터리: " + batteryLevel + "%");
        System.out.println("전원 상태: " + isPowerOn);
        System.out.println();

        useBattery(usePercent);
        System.out.println("전원 상태: " + isPowerOn);
        System.out.println("=== 스마트폰 상태 ===");
        System.out.println("모델: " + model);
        System.out.println("배터리: " + batteryLevel + "%");
        System.out.println("전원 상태: " + isPowerOn);
        System.out.println();

        charge(chargePercent);
        System.out.println("=== 스마트폰 상태 ===");
        System.out.println("모델: " + model);
        System.out.println("배터리: " + batteryLevel + "%");
    }
    /*

    배터리를 30% 사용했습니다.
=== 스마트폰 상태 ===
모델: Galaxy S24
배터리: 70%
전원 상태: ON

System.out.println( + "의 전원이 켜졌습니다.");
System.out.println( + "의 전원이 꺼졌습니다.");
System.out.println("배터리를 " +  + "% 사용했습니다.");
System.out.println("배터리가 모두 소모되어 전원이 꺼집니다.");
System.out.println("전원이 꺼져있어 배터리를 사용할 수 없습니다.");
System.out.println( "% 충전되었습니다.");
System.out.println("=== 스마트폰 상태 ===");
System.out.println("모델: " + );
System.out.println("배터리: " + );
System.out.println("전원 상태: " + );
     */
}