package Facade;


import org.springframework.stereotype.Component;

@Component
public class StreamingPlayer {
    public void on() {
        System.out.println("Streaming Player on");
    }

    public void play(String movie) {
        System.out.println("Streaming Player playing \"Raiders of the Lost Ark\"");
    }

    public void stop() {
        System.out.println("Streaming Player stopped \"Raiders of the Lost Ark\"");
    }

    public void off() {
        System.out.println("Streaming Player off");
    }
}
