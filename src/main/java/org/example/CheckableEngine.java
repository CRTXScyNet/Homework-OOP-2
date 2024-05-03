package org.example;

public interface CheckableEngine {
    public default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
