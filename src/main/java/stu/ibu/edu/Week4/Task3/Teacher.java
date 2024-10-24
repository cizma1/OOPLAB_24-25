package stu.ibu.edu.Week4.Task3;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int salary, int age, String country){
        super(name, address, age, country);
        this.salary=salary;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + " salary " + this.salary + " euros/month";
    }
}
