package SprngAntns;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:cinema.properties", encoding = "windows-1251")
public class AppContext
{

}
