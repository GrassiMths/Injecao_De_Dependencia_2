public class SmartCamera implements SmartDevice{

    private String status = "OFF";

    @Override
    public void turnOff() {
        status = "OFF";
        System.out.println("Smart Camera is now OFF.");
    }

    @Override
    public void turnOn() {
        status = "ON";
        System.out.println("Smart Camera is now ON.");
    }

    @Override
    public String status() {
        return "Smart Camera is"  + status;
    }
}
