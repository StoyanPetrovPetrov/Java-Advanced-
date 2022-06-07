package RawData;

public class Tire {
    private double presure;
    private int age;

    public Tire(double presure, int age) {
        this.presure = presure;
        this.age = age;
    }

    public double getPresure() {
        return presure;
    }

    public void setPresure(double presure) {
        this.presure = presure;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
