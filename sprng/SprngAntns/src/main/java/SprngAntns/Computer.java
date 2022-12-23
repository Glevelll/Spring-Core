package SprngAntns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer
{

    private int id;
    private FilmPlayer filmPlayer;
    private FilmPlayerWithConstructor filmPlayerWithConstructor;
    private FilmPlayerWithSetter filmPlayerWithSetter;

    @Autowired
    public Computer(FilmPlayer filmPlayer, FilmPlayerWithConstructor filmPlayerWithConstructor,
                    FilmPlayerWithSetter filmPlayerWithSetter)
    {
        this.id = 322;
        this.filmPlayer = filmPlayer;
        this.filmPlayerWithSetter = filmPlayerWithSetter;
        this.filmPlayerWithConstructor = filmPlayerWithConstructor;
    }

    @Override
    public String toString()
    {
        return "Computer with ID " + id + " " + filmPlayer.playFilm() + "\n"
                + filmPlayerWithConstructor.playFilm() + "\n"
                + filmPlayerWithSetter.playFilm() + "\n";
    }

}
