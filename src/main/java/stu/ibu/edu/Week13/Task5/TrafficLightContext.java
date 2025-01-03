package stu.ibu.edu.Week13.Task5;

public class TrafficLightContext {
    private TrafficLightState state = new RedLightState();

    public void setState(TrafficLightState state){
        this.state = state;
    }

    public void transitionToRed(){
        state.transitionToRed(this);
    }

    public void transitionToYellow(){
        state.transitionToYellow(this);
    }

    public void transitionToGreen(){
        state.transitionToGreen(this);
    }
}
