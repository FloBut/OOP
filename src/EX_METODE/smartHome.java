package EX_METODE;

import java.util.Scanner;


public class smartHome {
    public void accessHome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        int password = 76543210;
        int passwordInput = scanner.nextInt();
        //checking if the password is correct
        if (passwordInput == password) {
            chooseOption();
        } else {
            System.out.println("Incorrect password");
        }
    }

    public static void chooseOption() {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();
        System.out.println("Chose option: 1 - Speakers, 2 - Lights, 3 - Doors");

        switch (action) {
            case "1":
                controlSpeakers();
                break;
            case "2":
                //controlLights();
                break;
            case "3":
                //controlDoors();
                break;
            default:
                System.out.println("Invalid option");
        }

    }

    public static void controlSpeakers() {
        // switch (speakersState) {
        // case "on":
        // ...
        // case "off":
        // ...
        // default:
        // ...
    }
}

