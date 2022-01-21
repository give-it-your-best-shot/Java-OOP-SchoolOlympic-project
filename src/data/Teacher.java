
package data;

import java.util.Random;

public class Teacher extends Competitor implements RaceRegistration{
    public static final int MAXSPEED = 15;
    public String school;
    public String ID;

    public Teacher(String school, String ID, String name, int age, String sex) {
        super(name, age, sex);
        this.school = school;
        this.ID = ID;
    }
    
    @Override
    public double run() {
        double x = new Random().nextDouble() * MAXSPEED;
        return x;
               
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-8s|%-20s|%-10s|%-15s|%2d|%-6s|%-2d|"
        , "TEACHER", school, ID, name, age, sex);
    }

    @Override
    public double runForOnesLife() {
        return run() * 2;
    }

    @Override
    public void unbelievableAchievement() {
        System.out.println( school + " TEACHER " + name + " " + "ARE RUN AT SPEED " );
    }
    @Override
    public void result(){
        System.out.printf(name);
    }
}
