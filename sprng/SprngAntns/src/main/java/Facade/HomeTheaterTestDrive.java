package Facade;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeTheaterTestDrive implements CommandLineRunner {
    @Autowired
    HomeTheaterFacade homeTheater;
    public static void main(String[] args) {
        SpringApplication.run(HomeTheaterTestDrive.class);
    }
    public  void run(String... args) throws Exception{
        homeTheater.watchMovie("Raiders of the Lost Ark");
        System.out.println("---------------");
        homeTheater.endMovie();
    }
}
