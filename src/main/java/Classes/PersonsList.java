package Classes;

import java.util.List;

public class PersonsList {

    public List<Person> person;
    public PersonsList(List<Person> persons) {
        this.person = persons;
    }

    public List<Person> getPersons() {
        return person;
    }

    public void setPersons(List<Person> persons) {
        this.person = persons;
    }
    public Person findByName(String name) {
        Person result = null;
        for (int i = 0; i < person.size(); i++) {
            String[] personName = person.get(i).getName().split(" ", 2);
            if (name.equals(person.get(i).getName())) {
                result = (Person) person;
            } else {
                throw new IllegalArgumentException("Invalid format of name");
            }
        }
        return result;
    }


}


