package com.kriso.dogDoors;

import java.util.concurrent.TimeUnit;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.addAllowedBark(new DogBark("rowlf"));
        door.addAllowedBark(new DogBark("rooowlf"));
        door.addAllowedBark(new DogBark("rawlf"));
        door.addAllowedBark(new DogBark("woof"));
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        // Simulate the hardware hearing bark
        System.out.println("Bruce starts barking.");
        recognizer.recognize(new DogBark("rowlf"));

        System.out.println("\nBruce has gone outside...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nBruce's all done...");
        System.out.println("\n...but he's stuck outside!");

        //Simulate the hardware hearing a bark (not Bruce!)
        DogBark smallDogBark = new DogBark("yip");
        System.out.println("A small dog starts barking.");
        recognizer.recognize(smallDogBark);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Simulate the hardware hearing a bark again.
        System.out.println("Brice starts barking.");
        recognizer.recognize(new DogBark("rooowlf"));

        System.out.println("\nBruce is back inside...");
    }

    static void firstCase(Remote remote) {
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido's all done...");
        System.out.println("\nFido's back inside");
    }

    static void secondCase(Remote remote, BarkRecognizer recognizer) {
        System.out.println("Fido barks to go outside...");
        recognizer.recognize(new DogBark("woof"));

        System.out.println("\nFido has gone outside...");
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nFido's all done...");

        System.out.println("\nFido barks to go inside...");
        recognizer.recognize(new DogBark("woof"));
        System.out.println("\nFido's back inside");
    }
}
