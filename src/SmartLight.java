public class SmartLight implements SmartDevice{

    private String status = "OFF";

    @Override
    public void turnOff() {
        status = "OFF";
        System.out.println("Smart Light is now OFF.");
    }

    @Override
    public void turnOn() {
        status = "ON";
        System.out.println("Smart Light is now ON.");
    }

    @Override
    public String status() {
        return "Smart Light is " + status;
    }
}
