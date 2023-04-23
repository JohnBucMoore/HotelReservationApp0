package ui;

public class AdminMenu {
    public String[] options = {
            "See all Customers",
            "See all Rooms",
            "See all Reservations",
            "Add a Room",
            "Add Test Data",
            "Back to Main Menu"
    };
    public AdminMenu() {
        System.out.println("Admin Menu");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < options.length; i++) {
            System.out.println(Integer.toString(i+1) + ". " + options[i]);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Please select a number for the menu option");
    }
    /**
     * getUserInput
     * takes a valid user input and calls a method on one of the other classes
     * if user input is not valid throws and error and runs the menu again asking for valid input
     * while True loops over the menu until user enters last valid input which returns false and user returns to main menu
     * **/
}
