public class VoiceControl implements ControlMethod{

    @Override
    public void sendCommand(String command) {
        System.out.println("Voice command received: " + command);
    }
}
