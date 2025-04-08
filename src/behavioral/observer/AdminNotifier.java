package behavioral.observer;

/**
 * This class acts a concrete observer and implements the ServerObserver
 * interface and provides a concrete implementation of the update method. It is
 * responsible for displaying the server's status to the admin.
 */
public class AdminNotifier implements ServerObserver {

    @Override
    public void update(String status) {
        notifyAdmin(status);
    }

    private void notifyAdmin(String status) {
        System.out.println("Admin notified: Server Status - " + status);
    }
}
