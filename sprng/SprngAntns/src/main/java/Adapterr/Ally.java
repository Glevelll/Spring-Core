package Adapterr;

import org.springframework.stereotype.Component;

@Component
public class Ally implements IAlly{
    @Override
    public void spell() {
        System.out.println("Va faill, Elaine");
    }

    @Override
    public void protection() {
        System.out.println("Защита");
    }
}
