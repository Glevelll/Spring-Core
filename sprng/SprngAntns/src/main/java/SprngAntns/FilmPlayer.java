package SprngAntns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FilmPlayer
{

    @Autowired
    @Qualifier("comedyFilm")
    private Film comedyFilm;

    @Autowired
    @Qualifier("horrorFilm")
    private Film horrorFilm;

    @Autowired
    @Qualifier("westernFilm")
    private Film westernFilm;

    public String playFilm()
    {
        return "playing: " + comedyFilm.getFilm() + ", " + horrorFilm.getFilm() + ", " + westernFilm.getFilm();
    }
}
