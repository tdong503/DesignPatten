package com.example.DesignPatten.Decorator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car extends AbstractCar {
    private String name;
    private String type;

    @Override
    public void build() {
        System.out.println("build body");
        System.out.println("build wheel");
        System.out.println("build engine");
    }
}
