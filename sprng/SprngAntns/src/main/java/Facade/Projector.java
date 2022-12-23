package Facade;

import org.springframework.stereotype.Component;

@Component
public class Projector {
    public void on() {
        System.out.println("Projector on");
    }

    public void wideScreenMode() {
        System.out.println("Projector in widescreen mode (16x9 aspect ratio)");
    }

    public void off() {
        System.out.println("Projector off");
    }
}
