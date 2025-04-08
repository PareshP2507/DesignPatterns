package behavioral.observer;

/**
 * This acts as an observer in the Observer design pattern.
 * It defines the methods that observers must implement to receive updates from
 * the subject. Implementations of this interface will receive updates about the
 * server's status.
 */
public interface ServerObserver {
    void update(String status);
}
