package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        for (Educator educator : Educator.values()){
            this.add(new Instructor(educator.getID(),educator.getName()));
        }
//        Instructor younger = new Instructor(41, "Kris Younger");
//        super.add(younger);
//        Instructor sleuth = new Instructor(42, "Dolio Durant");
//        super.add(sleuth);
//        Instructor dedeus = new Instructor(43, "Roberto DeDeus");
//        super.add(dedeus);
//        Instructor miranda = new Instructor(44, "Froilan Miranda");
//        super.add(miranda);
//        Instructor nobles = new Instructor(45,"Christopher Nobles");
//        super.add(nobles);
    }

    public Instructor[] getArray() {
        Instructor[] instructorArray = new Instructor[INSTANCE.count()];
        int i = 0;
        for (Instructor instructor : INSTANCE){
            instructorArray[i++] = instructor;
        }
        return instructorArray;
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

}
