package SprngAntns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestSpringAnnotations implements CommandLineRunner
{

    @Autowired
    ApplicationContext context;

    @Autowired
    Computer tComputer;

    @Autowired
    Cinema tCinema;

    public static void main(String[] args)
    {
        SpringApplication.run(TestSpringAnnotations.class, args);
    }

    public void run(String... args) throws Exception
    {
        System.out.println(tCinema);
        System.out.println(tComputer);
    }
}
