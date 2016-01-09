package classes;

import interfaces.Quest;

import java.io.PrintStream;

/**
 * Created by lynas on 1/9/16.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void emberk() {
        stream.println("Emberking on slay dragon quest");
    }
}
