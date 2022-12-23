package Adapterr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
class Adapterrr implements IHero {
        IAlly ally;
        public Adapterrr(IAlly ally) {
            this.ally = ally;
        }

    @Override
    public void attack() {
        ally.spell();
    }

    @Override
    public void dodge() {
     ally.protection();
    }

    @Bean("Adapter")
    public Adapterrr getAlly(){
        return new Adapterrr(ally);
    }
}
