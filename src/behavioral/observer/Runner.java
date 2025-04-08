package behavioral.observer;

public class Runner {
    public static void main(String[] args) {
        Server server = new Server();
        server.addObserver(new AdminNotifier());
        server.addObserver(new Display());
        
        server.setStatus("Running");
    }
}
