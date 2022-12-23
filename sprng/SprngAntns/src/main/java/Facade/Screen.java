package Facade;


import org.springframework.stereotype.Component;

@Component
public class Screen {
    public void down() {
        System.out.println("Theater Screen going down");
    }

    public void up() {
        System.out.println("Theater Screen going up");
    }
}
