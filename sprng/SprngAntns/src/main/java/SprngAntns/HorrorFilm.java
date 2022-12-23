package SprngAntns;

import org.springframework.stereotype.Component;

@Component
public class HorrorFilm implements Film
{

    @Override
    public String getFilm()
    {
        return "The Conjuring";
    }
}
