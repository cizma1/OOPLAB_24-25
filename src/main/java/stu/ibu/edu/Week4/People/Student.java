package stu.ibu.edu.Week4.People;

public class Student extends Person {
    private int credits = 0;

    public Student(String name, String address){
        super(name, address);
    }

    public Student(String name, String address, int credits){
        super(name, address);
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