import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
    }

    public void displayPhoneBook() {
        List<Map.Entry<String, Set<String>>> sortedEntries = new ArrayList<>(contacts.entrySet());

        // Сортировка по убыванию
        sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        // Вывод
        for (Map.Entry<String, Set<String>> entry : sortedEntries) {
            System.out.println("Имя: " + entry.getKey() + ", Телефоны: " + entry.getValue());
        }
    }
}