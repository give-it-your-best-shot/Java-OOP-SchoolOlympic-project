
package data;

public abstract class Competitor {
    protected String name;
    protected int age;
    protected String sex;

    public Competitor(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public abstract double run();
    public abstract void showRecord();
}
