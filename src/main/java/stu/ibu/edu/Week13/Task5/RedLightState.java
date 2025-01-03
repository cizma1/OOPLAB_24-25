package stu.ibu.edu.Week13.Task5;

public class RedLightState implements TrafficLightState{
    public void transitionToRed(TrafficLightContext context){
        System.out.println("Already Red");
    }

    public void transitionToYellow(TrafficLightContext context){
        System.out.println("Switching to Yellow");
    }

    public void transitionToGreen(TrafficLightContext context){
        System.out.println("Switching to Green");
    }
}
