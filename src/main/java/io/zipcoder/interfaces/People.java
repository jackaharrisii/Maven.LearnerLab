package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{

    private ArrayList<E> personList;

    public People(ArrayList<E> personList){
        this.personList = personList;
    }

    public People() {
        this.personList = new ArrayList<E>();
    }

    public void add(E e){
        this.personList.add(e);
    }

    public E findById (long id){
        for(E e : this.personList){
            if (e.getId() == id){
                return e;
            }
        }
        return null;
    }

    public Boolean contains (E e){
        return this.personList.contains(e);
    }

    public void remove (E e){
        personList.remove(e);
    }

    public void remove (long id){
        E e = findById(id);
        if (e != null) {
            remove(e);
        }
    }

    public void removeAll (){
        this.personList.clear();
    }

    public Integer count(){
        return this.personList.size();
    }

    public abstract E[] getArray();
//        E[] personArray = new E[personList.size()];
//        for (int i = 0; i < personList.size(); i++){
////            personArray[i] = String.format("ID: %l, Name: %s", personList.get(i).getId(), personList.get(i).getName());
//            personArray[i] = personList.get(i);
//        }
//        return personArray;


    @Override
    public Iterator<E> iterator() {
        return this.personList.iterator();
    }
}
