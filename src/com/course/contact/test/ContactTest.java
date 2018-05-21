package contact.test;

import java.util.List;

import contact.business.ContactManager;
import contact.entity.Contact;

public class ContactTest {

    public static void main(String[] args) {
        ContactManager cm = new ContactManager();

        Contact c1 = new Contact("Андрей", "Соколов", "+7-911-890-7766", "sokolov@yandex.ru");
        Contact c2 = new Contact("Сергей", "Иванов", "+7-911-890-7755", "ivanov@google.com");
        Contact c3 = new Contact("Татьяна", "Семенова", "+7-911-890-1164", "semenova@mail.ru");

        System.out.println("ADD CONTACT ==============");

        Long cID1 = cm.addContact(c1);
        Long cID2 = cm.addContact(c2);
        Long cID3 = cm.addContact(c3);

        List<Contact> result1 = cm.findContacts();
        for (Contact c : result1) {
            System.out.println(c);
        }

        System.out.println("UPDATE CONTACT ==============");
        Contact change = new Contact(cID1, "Алексей", "Соколов", "+7-911-890-7766", "sokolov@yandex.ru");
        cm.updateContact(change);
        List<Contact> result2 = cm.findContacts();
        for (Contact c : result2) {
            System.out.println(c);
        }

        System.out.println("DELETE CONTACT ==============");
        cm.deleteContact(cID1);
        for (Contact c : result2) {
            System.out.println(c);
        }
    }
}
