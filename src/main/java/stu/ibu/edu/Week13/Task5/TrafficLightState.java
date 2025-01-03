package stu.ibu.edu.Week13.Task5;

public interface TrafficLightState {
    void transitionToRed(TrafficLightContext context);
    void transitionToYellow(TrafficLightContext context);
    void transitionToGreen(TrafficLightContext context);
}
