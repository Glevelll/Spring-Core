package Facadee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarFacadeDrive implements CommandLineRunner {
    @Autowired
    CarFacade car;
    public static void main(String[] args) {
        SpringApplication.run(CarFacadeDrive.class);
    }
    public  void run(String... args) throws Exception{
        car.getInTheCar();
        System.out.println("*Поездка*");
        car.getOutOfTheCar();
    }
}
