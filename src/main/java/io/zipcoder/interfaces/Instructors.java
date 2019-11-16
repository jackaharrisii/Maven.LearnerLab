package io.zipcoder.interfaces;

public final class Instructors extends People{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor younger = new Instructor(41, "Kris Younger");
        personList.add(younger);
        Instructor sleuth = new Instructor(42, "Dolio Durant");
        personList.add(sleuth);
        Instructor dedeus = new Instructor(43, "Roberto DeDeus");
        personList.add(dedeus);
        Instructor miranda = new Instructor(44, "Froilan Miranda");
        personList.add(miranda);
        Instructor nobles = new Instructor(45,"Christopher Nobles");
        personList.add(nobles);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

}
