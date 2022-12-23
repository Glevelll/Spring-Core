package Facadee;

import org.springframework.stereotype.Component;

@Component
public class Eco {
    public void on() {
        System.out.println("Eco режим включен");
    }
    public void off() {
        System.out.println("Eco режим выключен");
    }
}
