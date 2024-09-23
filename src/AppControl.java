public class AppControl implements ControlMethod{

    @Override
    public void sendCommand(String command) {
        System.out.println("App command sent: " + command);
    }
}
