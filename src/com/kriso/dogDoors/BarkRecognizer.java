package com.kriso.dogDoors;

import java.util.ArrayList;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(DogBark bark) {
        System.out.println("BarkRecognizer: Heard a '" + bark.getBark() + "'");
        ArrayList<DogBark> allowedBarks = door.getAllowedBarks();

        for (DogBark allowedBark: allowedBarks) {
            if (allowedBark.equals(bark)) {
                door.open();
                return;
            }
        }

        System.out.println("This dog is not allowed!");
    }
}
