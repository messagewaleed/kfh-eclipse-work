package org.kfh;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address{ //implements{ InitializingBean, DisposableBean{
    private String city;

    private String pin;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Address() {
    }

    public Address(String city, String pin) {
        this.city = city;
        this.pin = pin;
    }

    public void callAtEnd() throws Exception {
        System.out.println("Bean for Address about to be taken off...");
    }

    public void callAtFirst() throws Exception {
        System.out.println("Bean for Address instantiated");
    }
}
