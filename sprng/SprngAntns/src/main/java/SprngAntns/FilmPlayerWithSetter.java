package SprngAntns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FilmPlayerWithSetter
{

    private Film comedyFilm;
    private Film horrorFilm;
    private Film westernFilm;

    @Autowired
    @Qualifier("comedyFilm")
    public void setComedyFilm(Film comedyFilm)
    {
        this.comedyFilm = comedyFilm;
    }

    @Autowired
    @Qualifier("horrorFilm")
    public void setHorrorFilm(Film horrorFilm)
    {
        this.horrorFilm = horrorFilm;
    }

    @Autowired
    @Qualifier("westernFilm")
    public void setWesternFilm(Film westernFilm)
    {
        this.westernFilm = westernFilm;
    }

    public String playFilm()
    {
        return "playing: " + comedyFilm.getFilm() + ", " + horrorFilm.getFilm() + ", " + westernFilm.getFilm()
                + " using setter";
    }
}
