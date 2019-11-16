package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{

    List<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        this.personList.add(person);
    }

    public Person findById (long id){
        for(Person person : personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public Boolean contains (Person personToFind){
        return this.personList.contains(personToFind);
    }

    public void remove (Person personToRemove){
        personList.remove(personToRemove);
    }

    public void remove (long id){
        Person personToRemove = findById(id);
        remove(personToRemove);
    }

    public void removeAll (){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] personArray = new Person[personList.size()];
        for (int i = 0; i < personList.size(); i++){
//            personArray[i] = String.format("ID: %l, Name: %s", personList.get(i).getId(), personList.get(i).getName());
            personArray[i] = personList.get(i);
        }
        return personArray;
    }

    @Override
    public Iterator<Person> iterator() {
        return this.personList.iterator();
    }
}
