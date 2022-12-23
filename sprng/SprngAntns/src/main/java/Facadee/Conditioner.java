package Facadee;

import org.springframework.stereotype.Component;

@Component
public class Conditioner {
    public void on() {
        System.out.println("Кондиционер включен");
    }
    public void setTemperature(int i) {
        System.out.println("Температура " + i + "C");
    }
    public void off() {
        System.out.println("Кондиционер выключен");
    }
}
