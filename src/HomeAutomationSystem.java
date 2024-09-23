import java.util.Arrays;

public class HomeAutomationSystem {
    public static void main(String[] args) {

        SmartDevice light = new SmartLight();
        SmartDevice thermostat = new SmartThermostat();
        ControlMethod voiceControl = new VoiceControl();

        Room livingRoom = new Room("Living Room", Arrays.asList(light, thermostat), voiceControl);
        livingRoom.controlDevices("Turn everything ON");

        light.turnOn();
        thermostat.turnOn();

        livingRoom.controlDevices("Check status");

    }
}
