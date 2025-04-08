package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * This class acts as a subject in the Observer design pattern.
 * It maintains a list of observers and notifies them of any changes in the
 * server's status. It provides methods to add and remove observers from the
 * list.
 * The observers will be notified whenever the server's status changes.
 */
public class Server {
    private List<ServerObserver> observers = new ArrayList<>();

    public void addObserver(ServerObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ServerObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        System.out.println("Server status changed to: " + status + " notifyig observers");
        notifyObservers(status);
    }

    private void notifyObservers(String status) {
        for (ServerObserver observer : observers) {
            observer.update(status);
        }
    }
}
