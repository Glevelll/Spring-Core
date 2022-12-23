package Facadee;

import org.springframework.stereotype.Component;

@Component
public class Lights {
    public void OnOffNear(int x) {
        if(x == 1) {
            System.out.println("Ближний свет включен");
        } else System.out.println("Ближний свет выключен");
    }
    public void OnOffDistant(int x) {
        if(x == 1) {
            System.out.println("Дальниый свет включен");
        } else System.out.println("Дальниый свет выключен");
    }
}
