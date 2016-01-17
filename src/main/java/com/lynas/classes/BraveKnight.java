package com.lynas.classes;

import com.lynas.interfaces.Knight;
import com.lynas.interfaces.Quest;

/**
 * Created by lynas on 1/9/16.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void emberkOnQuest() {
        quest.emberk();
    }
}
