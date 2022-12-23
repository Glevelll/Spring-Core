package SprngAntns;

import org.springframework.stereotype.Component;

@Component
public class WesternFilm implements Film
{

    @Override
    public String getFilm()
    {
        return "High Noon";
    }
}
