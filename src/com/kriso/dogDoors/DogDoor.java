package com.kriso.dogDoors;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private ArrayList<DogBark> allowedBarks;

    public DogDoor() {
        this.open = false;
        this.allowedBarks = new ArrayList<DogBark>();
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void addAllowedBark(DogBark allowedBark) {
        this.allowedBarks.add(allowedBark);
    }

    public ArrayList<DogBark> getAllowedBarks() {
        return allowedBarks;
    }
}
