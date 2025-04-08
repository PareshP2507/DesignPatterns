package behavioral.observer;

/**
 * This class acts a concrete observer and implements the ServerObserver
 * interface and provides a concrete implementation of the update method. It is
 * responsible for displaying the server's status to the user.
 */
public class Display implements ServerObserver {

    @Override
    public void update(String status) {
        display(status);
    }

    private void display(String status) {
        System.out.println("Server Status: " + status);
    }
}
