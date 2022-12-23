package SprngAntns;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cinema
{

    @Value("228")
    private int cinemaId;
    @Value("${cinema.name}")
    private String cinemaName;

    @Autowired
    private FilmPlayer filmPlayer;

    @Autowired
    private ObjectFactory<FilmPlayer> city;

    @Autowired
    private FilmPlayerWithSetter filmPlayerWithSetter;

    @Autowired
    private FilmPlayerWithConstructor filmPlayerWithConstructor;

    @Override
    public String toString()
    {
        return "Cinema " + cinemaName + " with ID " + cinemaId + " " + filmPlayer.playFilm() + "\n"
                + filmPlayerWithConstructor.playFilm() + "\n"
                + filmPlayerWithSetter.playFilm() + "\n";
    }
}
