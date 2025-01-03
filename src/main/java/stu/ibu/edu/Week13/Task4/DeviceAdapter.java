package stu.ibu.edu.Week13.Task4;

public class DeviceAdapter implements NewDevice{
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice){
        this.oldDevice = oldDevice;
    }

    public void operateNewFunction(){
        oldDevice.operateOldFunction();
    }
}
