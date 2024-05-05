package org.example;

public interface UpdatableTyre {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
