package Facadee;

import org.springframework.stereotype.Component;

@Component
public class Windows {
    public void OnOffLeftFront(int x) {
        if(x == 1) {
            System.out.println("Левое переднее окно опущенно");
        } else System.out.println("Левое переднее окно поднято");
    }
    public void OnOffLeftBack(int x) {
        if(x == 1) {
            System.out.println("Левое заднее окно опущенно");
        } else System.out.println("Левое заднее окно поднято");
    }
    public void OnOffRightFront(int x) {
        if(x == 1) {
            System.out.println("Правое переднее окно опущенно");
        } else System.out.println("Правое переднее окно поднято");
    }
    public void OnOffRightBack(int x) {
        if(x == 1) {
            System.out.println("Правое заднее окно опущенно");
        } else System.out.println("Правое заднее окно поднято");
    }
}
