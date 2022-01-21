
package data;

import java.util.Random;

public class Student extends Teacher implements RaceRegistration {
    public String healthConditions;
    public static final int MAXSPEED = 20;
    public Student(String healthConditions, String school, String ID, String name, int age, String sex) {
        super(school, ID, name, age, sex);
        this.healthConditions = healthConditions;
    }

    public String getHealthConditions() {
        return healthConditions;
    }

    public void setHealthConditions(String healthConditions) {
        this.healthConditions = healthConditions;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-8s|%-20s|%-10s|%-15s|%2d|%-6s|%-2d|%-6s|"
        ,"STUDENT", school, ID, name, age, sex, healthConditions);
    }

    @Override
    public double run() {
        double x = new Random().nextDouble() * MAXSPEED;
        return x;
               
    }

    @Override
    public double runForOnesLife() {
        return run() * 2;
    }

    @Override
    public void unbelievableAchievement() {
        System.out.println(school + " STUDENT " + name + " " + "ARE RUN AT SPEED " );
    }
    @Override
    public void result(){
        System.out.printf(name);
    }
    
}
