package stu.ibu.edu.Week4.Task3;

public class Student extends Person{
    private int credits = 0;

    public Student(String name, String address, int age, String country){
        super(name, address, age, country);
    }

    public Student(String name, String address, int credits, int age, String country){
        super(name, address, age, country);
        this.credits=credits;
    }

    public int getCredits(){
        return credits;
    }

    public void setCredits(int credits){
        this.credits=credits;
    }

    public void study(){
        this.credits++;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + " credits " + this.credits;
    }
}
