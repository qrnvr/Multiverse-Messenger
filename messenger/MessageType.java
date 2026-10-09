package messenger;

public abstract class MessageType {
    protected final DeliveryChannel channel;

    protected MessageType(DeliveryChannel channel) {
        this.channel = channel;
    }

    public abstract void send(String content);
}
