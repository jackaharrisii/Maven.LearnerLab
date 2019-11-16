package io.zipcoder.interfaces;

import java.lang.reflect.Array;

public class ZipCodeWilmington {

//    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

//    public static ZipCodeWilmington getInstance(){
//        return INSTANCE;
//    }

    public void hostLecture (Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

//    public void hostLecture ()

}
