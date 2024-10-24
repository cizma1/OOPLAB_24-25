package stu.ibu.edu.Week4.People;

public class Person {
    private String eskoUkkonen;
    private String s;

    public Person(String eskoUkkonen, String s) {
        this.eskoUkkonen = eskoUkkonen;
        this.s = s;
    }

    public String getEskoUkkonen() {
        return eskoUkkonen;
    }

    public void setEskoUkkonen(String eskoUkkonen) {
        this.eskoUkkonen = eskoUkkonen;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String toString(){
        return this.eskoUkkonen + "\n" + " " + this.s;
    }
}
