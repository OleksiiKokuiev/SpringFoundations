package closures;

import reflections.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<Person> ();
        persons.add(new Person("Valera", 20));
        //Collections.sort(persons, Comparator.comparingInt(Person::getAge));
    }
}
