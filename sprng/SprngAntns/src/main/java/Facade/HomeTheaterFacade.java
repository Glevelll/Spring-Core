package Facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeTheaterFacade {
    @Autowired
     Amplifier amp;
    @Autowired
    StreamingPlayer player;
    @Autowired
    Projector projector;
    @Autowired
    Screen screen;
    @Autowired
    TheaterLights lights;
    @Autowired
    PopcornPopper popper;
    @Autowired
    public HomeTheaterFacade(Amplifier amp, StreamingPlayer player, Projector projector,
                             Screen screen, TheaterLights lights, PopcornPopper popper) {
        this.amp = amp;
        this.player = player;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
}