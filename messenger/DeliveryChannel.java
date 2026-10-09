package messenger;

public interface DeliveryChannel {
    void deliver(String kind, String content);
}
