package behavioral.cor;

public class NotFoundHandler extends UrlHandler {

    @Override
    public void handleRequest(String url) {
        System.out.println("404 Not Found: " + url);
    }

    @Override
    public boolean canHandle(String url) {
        return true; // This handler will always be able to handle the request
    }
}
