package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.LinkedHashMap;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture (Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[])students.toArray(), numberOfHours);
    }

    public void hostLecture (long id, double numberOfHours) {
        Instructor instructor = (Instructor) instructors.findById(id);
        instructor.lecture((Learner[])students.toArray(), numberOfHours);
    }

    public LinkedHashMap<Student, Double> getStudyMap(){
        LinkedHashMap<Student,Double> map = new LinkedHashMap<Student, Double>();
        for(Person person : students){
            map.put((Student)person, ((Learner)person).getTotalStudyTime());
        }
        return map;
    }

}
