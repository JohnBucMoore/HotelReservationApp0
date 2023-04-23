package ui;

public class MainMenu {
    public String[] options = {
            "Find and reserve a room",
            "See my reservations",
            "Create an Account",
            "Admin",
            "Exit"
    };
    public MainMenu() {
        System.out.println("Welcome to the Hotel Reservation Application\n");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < options.length; i++) {
            System.out.println(Integer.toString(i+1) + ". " + options[i]);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Please select a number for the menu option");
    }

    /**
     * polymorphism Array of all menuOptionObjects - https://youtu.be/GE43dZeE2p0?t=204
     * getUserInput - Scanner asking for userInput, validates that input, and calls a method of another class
     * while True: menu is displayed until valid userInput of last option which then returns false and exits the program
     * **/
}
