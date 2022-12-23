package SprngAntns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FilmPlayerWithConstructor
{

    private Film comedyFilm;
    private Film horrorFilm;
    private Film westernFilm;

    @Autowired
    public FilmPlayerWithConstructor(@Qualifier("comedyFilm") Film comedyFilm,
                                     @Qualifier("horrorFilm") Film horrorFilm,
                                     @Qualifier("westernFilm") Film westernFilm)
    {
        this.comedyFilm = comedyFilm;
        this.horrorFilm = horrorFilm;
        this.westernFilm = westernFilm;
    }

    public String playFilm()
    {
        return "playing: " + comedyFilm.getFilm() + ", " + horrorFilm.getFilm() + ", " + westernFilm.getFilm()
                + " using constructor";
    }
}
