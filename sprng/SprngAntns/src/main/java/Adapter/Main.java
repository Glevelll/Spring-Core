package Adapter;

import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigReactiveWebApplicationContext(TurkeyAdapter.class);
        Duck adapter = ctx.getBean("Adapter", TurkeyAdapter.class);
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(adapter);
    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}