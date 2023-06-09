package org.ssit.gr17.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new SamsungGalaxyS6(9, "", "wood");
        phone1.createContact(1, "Ana", "Morar", 5754445750L);
        phone1.createContact(2, "Marius", "Andreo", 8765456802L);
        phone1.sendMessage(3, "Hello World");






    }
}
