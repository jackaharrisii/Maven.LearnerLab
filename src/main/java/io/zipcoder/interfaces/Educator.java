package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    YOUNGER(41, "Kris Younger"),
    SLEUTH(42, "Dolio Durant"),
    DEDEUS(43, "Roberto DeDeus"),
    MIRANDA(44, "Froilan Miranda"),
    NOBLES(45, "Christopher Nobles");

    private long id;
    private String name;
    private double timeWorked;

    Educator (long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getID (){
        return this.id;
    }

    public String getName (){
        return this.name;
    }

    public double getTimeWorked(){
        return timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners){
            learner.learn(numberOfHoursPerLearner);
        }
        this.timeWorked += numberOfHours;
    }



}
