package com.kriso.dogDoors;


public class Remote {

    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if (door.isOpen()) {
            door.close();
        } else {
            door.open();


        }
    }

    public void setBark(String barkSound) {
        DogBark bark = new DogBark(barkSound);
        door.addAllowedBark(bark);
    }
}
