package Adapterr;

import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigReactiveWebApplicationContext(Adapterrr.class);
        IHero adapter = ctx.getBean("Adapter", Adapterrr.class);
        IHero hero = new Hero();
        IAlly ally = new Ally();

        System.out.println("Союзник помогает:");
        ally.spell();
        ally.protection();
        System.out.println("Герой делает:");
        testHero(hero);
        System.out.println("Адаптированный союзник помогает:");
        testHero(adapter);
    }
    static void testHero(IHero iHero) {
        iHero.attack();
        iHero.dodge();
    }
}