package org.example;

public class Television {

    public final String MANUFACTURER;
    public final int SCREEN_SIZE;

    public boolean powerOn;
    public int channel;
    public int volume;

    Television(String brand, int size) {
        this.MANUFACTURER = brand;
        this.SCREEN_SIZE = size;

        this.powerOn = false;
        this.channel = 2;
        this.volume = 20;
    }

    public void setChannel(int station) {
        this.channel = station;
    }

    public void power() {
        this.powerOn = !this.powerOn;
    }

    public void increaseVolume() {
        this.volume++;
    }

    public void decreaseVolume() {
        this.volume--;
    }

    public int getChannel() {
        return this.channel;
    }

    public int getVolume() {
        return this.volume;
    }

    public String getManufacturer() {
        return this.MANUFACTURER;
    }

    public int getScreenSize() {
        return this.SCREEN_SIZE;
    }

}
