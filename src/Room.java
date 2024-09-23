import java.util.List;

public class Room {

    private String name;
    private List<SmartDevice> devices;
    private ControlMethod controlMethod;

    public Room (String name, List<SmartDevice> devices, ControlMethod controlMethod){

        this.name = name;
        this.devices = devices;
        this.controlMethod = controlMethod;

    }

    public void controlDevices(String command){
        controlMethod.sendCommand(command);
        for(SmartDevice device: devices){
            System.out.println(device.status());
        }

    }

}
