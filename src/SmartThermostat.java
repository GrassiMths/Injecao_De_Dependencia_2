public class SmartThermostat implements SmartDevice{

    private String status = "OFF";

    @Override
    public void turnOff() {
        status = "OFF";
        System.out.println("Smart Thermostat is now OFF.");
    }

    @Override
    public void turnOn() {
        status = "ON";
        System.out.println("Smart Thermostat is now ON.");
    }

    @Override
    public String status() {
        return "Smart Thermostat is " + status ;
    }
}
