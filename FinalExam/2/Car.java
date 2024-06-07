package org.example;

public class Car extends Vehicle { // Car 繼承 Vehicle

    private int passengerSpace; // Car 除了有 Vehicle 的 member 還有一個新的 member (Vehicle 沒有 passengerSpace)

    public Car(String carName, String carYear, int passengerSpace) { // 建構子 constructor
        super(carName, carYear);              // 呼叫 Vehicle 的 constructor
        this.passengerSpace = passengerSpace; // initialize 自己的 member
    }

    @Override // override toString method
    public String toString() {
        return super.toString() + "\nPassenger Space: " + passengerSpace;
        // 先呼叫 Vehicle 的 toString 回傳 name 跟 year，再回傳自己的 passengerSpace
    }
}
