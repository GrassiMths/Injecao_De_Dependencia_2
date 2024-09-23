public class RemoteControl implements ControlMethod{

    @Override
    public void sendCommand(String command) {
        System.out.println("Remote control command: " + command);
    }
}
