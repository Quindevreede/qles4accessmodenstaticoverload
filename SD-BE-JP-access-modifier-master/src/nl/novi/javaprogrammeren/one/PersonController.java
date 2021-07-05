package nl.novi.javaprogrammeren.one;


import java.util.ArrayList;

public class PersonController {
private ArrayList<Person> person = new ArrayList<>();
    public PersonController() {
    }

    public void generatePerson() {
        Person personDefault = new Person("Default", "Default", 000);
        person.add(personDefault);
    }
        public void generatePersonTwo() {
        PersonTwo person2 = new PersonTwo("Sjaak", "Cook", 40, "fishing", true);
        person.add(person2);
    }

    public void generatePartner() {
        Partner partner1 = new Partner("Simone", "Cop", 34, "Sjaak", true);
        person.add(partner1);
    }

    public void printList() {
        int listSize = person.size();

        for (int i = 0; i < listSize; i++) {
            Person tmpPersonlist = person.get(i);
            System.out.println(tmpPersonlist);
        }
    }
}


