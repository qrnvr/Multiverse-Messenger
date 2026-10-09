package messenger;

public class QuantumTeleporter implements DeliveryChannel {
    @Override
    public void deliver(String kind, String content) {
        System.out.println("Quantum teleporter blinks a " + kind + " into another universe: \"" + content + "\"");
    }
}
