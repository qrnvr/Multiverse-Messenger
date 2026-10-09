package messenger;

public class Main {
    public static void main(String[] args) {
        DeliveryChannel pigeon = new CarrierPigeon();
        DeliveryChannel teleporter = new QuantumTeleporter();

        new TextMessage(pigeon).send("Hello from universe A");
        new TextMessage(teleporter).send("Hello from universe A");
        new VoiceMessage(pigeon).send("Hello from universe A");
        new VoiceMessage(teleporter).send("Hello from universe A");
    }
}
