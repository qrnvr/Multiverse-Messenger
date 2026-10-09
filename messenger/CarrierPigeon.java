package messenger;

public class CarrierPigeon implements DeliveryChannel {
    @Override
    public void deliver(String kind, String content) {
        System.out.println("Carrier pigeon flaps away with a " + kind + ": \"" + content + "\"");
    }
}
