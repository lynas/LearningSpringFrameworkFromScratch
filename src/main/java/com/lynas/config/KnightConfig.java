package com.lynas.config;

import com.lynas.aspect.Audience;
import com.lynas.classes.BraveKnight;
import com.lynas.classes.Performance;
import com.lynas.classes.SlayDragonQuest;
import com.lynas.interfaces.Knight;
import com.lynas.interfaces.Quest;
import com.lynas.interfaces.Show;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by lynas on 1/9/16.
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.lynas")
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }


    @Bean
    public Audience audience(){
        return new Audience();
    }


}
