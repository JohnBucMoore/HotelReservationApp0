package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    public String firstName;
    public String lastName;
    public String email;
    private final String emailRegex = "^(.+)@(.+).(.+)$";
    private final Pattern pattern = Pattern.compile(emailRegex);
    public Customer(String firstName, String lastName, String email) {
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid Email Address Format\nPlease Re-enter Customer Info");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "First Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nEmail: " + this.email + "\n";
    }
}
