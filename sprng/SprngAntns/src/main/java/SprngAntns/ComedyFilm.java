package SprngAntns;

import org.springframework.stereotype.Component;

@Component
public class ComedyFilm implements Film
{

    @Override
    public String getFilm()
    {
        return "The Hangover";
    }
}
