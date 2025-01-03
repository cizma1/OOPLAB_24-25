package stu.ibu.edu.Week13.Task5;

public class MainTrafficLight {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        context.transitionToGreen();
        context.transitionToYellow();
        context.transitionToRed();
    }
}
