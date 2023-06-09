package org.ssit.gr17.Phone;

import org.jetbrains.annotations.NotNull;

public class Phone {
    private int batteryLife;
    private String color;
    private String material;
    private int id;


    public Phone(int batteryLife, String color, String material) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;

    }

    public void createContact(@NotNull int id, String firstName, String lastName, long phoneNumber) {
        if (firstName.equals("") || lastName.equals("")) {
            System.out.println("Name can't be blank space;");
        } else if (phoneNumber < 1000000000) {
            System.out.println("Phone number must contain 10+ digits;");
        } else {
            System.out.println("\nNew contact created successfully:\n·ID: " + id + "\n·First name: " + firstName + "\n·Last name: " + lastName + "\n·Phone number: " + phoneNumber);
        }
    }

    //TODO
    public void seeContacts() {
    }

    //TODO
    public void sendMessage(@NotNull int id, @NotNull String textMessage) {
        if (textMessage.length() > 500) {
            System.out.println("Message can contains 500 digits only.");
        } else if (batteryLife <= 0) {
            System.out.println("The phone shout down because battery life is: 0h.");
        } else {
            batteryLife -= 1;
            System.out.println("Message sent successfully!\nNew battery life: " + batteryLife);
        }
    }


    //TODO
    public void seeAllMessagesFrom() {
    }

    //TODO
    public void call() {
    }

    //TODO
    public void seeCallingHistory() {
    }

}
