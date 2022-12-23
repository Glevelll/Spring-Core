package Adapterr;

import org.springframework.stereotype.Component;

@Component
public class Hero implements IHero {
    @Override
    public void attack() {
        System.out.println("Удар мечом");
    }

    @Override
    public void dodge() {
        System.out.println("Перекат");
    }
}
