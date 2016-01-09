package classes;

import config.KnightConfig;
import interfaces.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lynas on 1/9/16.
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.emberkOnQuest();
        context.close();
    }
}