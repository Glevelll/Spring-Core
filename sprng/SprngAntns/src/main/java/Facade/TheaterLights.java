package Facade;


import org.springframework.stereotype.Component;

@Component
public class TheaterLights {
    public void dim(int i) {
        System.out.println("Theater Ceiling Lights dimming to 10%");
    }

    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }
}
