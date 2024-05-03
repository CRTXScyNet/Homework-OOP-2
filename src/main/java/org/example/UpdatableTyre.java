package org.example;

public interface UpdatableTyre {
    public default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
