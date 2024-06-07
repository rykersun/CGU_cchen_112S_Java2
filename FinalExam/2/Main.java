package org.example;

public class Main {
    public static void main(String[] args) {

        Vehicle v[] = new Vehicle[2]; // 建立一個大小為 2 的 Vehicle 陣列

        Vehicle myVehicle = new Vehicle("myVehicle", "bmw2019"); // 建立並初始化一個 Vehicle 物件 myVehicle
        Car myCar = new Car("myCar", "toyota2020", 10);          // 建立並初始化一個 Car 物件 myCar

        // 將物件放入 Vehicle 陣列
        v[0] = myVehicle;
        v[1] = myCar;

        // 迭代呼叫 Vehicle 陣列裡面物件的 toString method
        for (Vehicle i : v)
            System.out.println(i.toString());
    }
}