package task3;

/**
 * A message is a byte array that can be sent through a {@link EventMessageQueue}.
 * <br>
 * Warning: the {@code bytes} array is the only field which will be written when sent to the message queue.
 */
public class EventMessage {
    private byte[] bytes;

    /**
     * Constructs a new {@code EventMessage} with the specified byte array.
     *
     * @param bytes the byte array to be sent
     */
    public EventMessage(byte[] bytes, int offset, int length) {
        this.bytes = new byte[length];
        System.arraycopy(bytes, offset, this.bytes, 0, length);
    }

    public EventMessage(byte[] bytes) {
        this(bytes, 0, bytes.length);
    }
}