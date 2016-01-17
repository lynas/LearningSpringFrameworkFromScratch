package com.lynas.classes;

import com.lynas.interfaces.Show;

/**
 * Created by lynas on 1/17/16.
 */
public class Performance implements Show {
    @Override
    public void perform() {
        System.out.println("I am performing");
    }
}
