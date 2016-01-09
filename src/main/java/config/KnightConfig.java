package config;

import classes.BraveKnight;
import classes.SlayDragonQuest;
import interfaces.Knight;
import interfaces.Quest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lynas on 1/9/16.
 */

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
