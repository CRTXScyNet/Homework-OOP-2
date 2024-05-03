package org.example;

public class Truck extends Transport implements UpdatableTyre, CheckableEngine {
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
