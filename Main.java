import org.w3c.dom.Node;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иван", "123456789");
        phoneBook.addContact("Петр", "987654321");
        phoneBook.addContact("Иван", "987654321");
        phoneBook.addContact("Мария", "555555555");
        phoneBook.addContact("Иван", "111111111");

        phoneBook.displayPhoneBook();
    }
}