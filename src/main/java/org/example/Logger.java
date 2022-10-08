package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Logger {
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Calendar cal = Calendar.getInstance();
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + formater.format(cal.getTime()) + " " + num++ + "] " + msg);
    }

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}